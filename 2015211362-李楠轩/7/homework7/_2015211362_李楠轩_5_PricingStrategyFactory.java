package homework7;

import java.util.HashSet;

public class _2015211362_李楠轩_5_PricingStrategyFactory
{
    //全局变量instance
    private static _2015211362_李楠轩_5_PricingStrategyFactory instance;
    //第一策略目录类
    private _2015211362_李楠轩_5_StrategyCatalog catalog;

    //构造函数
    private _2015211362_李楠轩_5_PricingStrategyFactory() 
    { 
    	catalog = new _2015211362_李楠轩_5_StrategyCatalog(); 
    }

    //新建一个策略库类
    static public _2015211362_李楠轩_5_PricingStrategyFactory getInstance()
    {
        if (null == instance)
            instance = new _2015211362_李楠轩_5_PricingStrategyFactory();
         return instance;
    }

    //访问目录
    public _2015211362_李楠轩_5_PricingStrategy getStrategyOfBook(int type) //返回一个策略
    { 
    	return catalog.getStrategyOfBook(type); 
    }
    public _2015211362_李楠轩_5_PricingStrategy getPricingStrategy(String ID) //返回ID，还是ID
    { 
    	return catalog.get(ID); 
    }
    public _2015211362_李楠轩_5_PricingStrategy removePricingStrategy(String ID) //删除一个ID的策略
    { 
    	
    	return catalog.remove(ID); 
    }
    public String[][] getAllStratetiesInfo() //获得所有的策略
    { 
    	return catalog.getAllData(); 
    }

    /* The factory pattern method */
    public _2015211362_李楠轩_5_PricingStrategy createPricingStrategy(int type, Object paras, HashSet<Integer> booktype, String ID, String name)
        throws Exception
    {
       
        if (catalog.get(ID) != null)
            throw new Exception("已存在相同编号的策略！");
        for (int i : booktype)
            if (!catalog.getStrategyOfBook(i).getType().equals("无优惠"))
                throw new Exception(_2015211362_李楠轩_5_ProductSpecification.idxToStr[i] + "已被绑定！");

        /* Create the strategy */
        _2015211362_李楠轩_5_PricingStrategy temp = null;
        switch (type)
        {
            case _2015211362_李楠轩_5_IPricingStrategy.FLATRATE:
                temp = catalog.add(new _2015211362_李楠轩_5_FlatRateStrategy(Double.parseDouble(paras.toString()), booktype, ID, name));
                break;

            case _2015211362_李楠轩_5_IPricingStrategy.PERCENTAGE:
                temp = catalog.add(new _2015211362_李楠轩_5_PercentageStrategy(Integer.parseInt(paras.toString()), booktype, ID, name));
                break;

            case _2015211362_李楠轩_5_IPricingStrategy.COMPOSITE:
                // Check Validity
                String[] list = paras.toString().split(",");
                for (String strategyID : list)
                    if (catalog.get(strategyID) == null) throw new Exception("输入的简单策略编号无效！");
                temp = catalog.add(new _2015211362_李楠轩_5_CompositeBestForCustomer(list, booktype, ID, name));
                break;

            case _2015211362_李楠轩_5_IPricingStrategy.NODISCOUNT:
                temp = catalog.add(new _2015211362_李楠轩_5_NoDiscountStrategy());
                break;

            default:
                return null;
        }
        if (temp == null) throw new Exception("参数无效！");
        return temp;
    }
}
