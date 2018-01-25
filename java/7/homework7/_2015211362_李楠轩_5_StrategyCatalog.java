package homework7;

import java.util.HashMap;
public class _2015211362_李楠轩_5_StrategyCatalog
{
    
    public static final String[] idxToStr = {"绝对值优惠策略", "百分比优惠策略", "顾客最优策略"};

    //定义一个hashmap的策略，保存所有策略，第一项保存策略名，第二项保存策略由策略定义
    private HashMap<String, _2015211362_李楠轩_5_PricingStrategy> strategies = new HashMap<>();

    public _2015211362_李楠轩_5_StrategyCatalog() { }

    
    public _2015211362_李楠轩_5_PricingStrategy get(String ID) //获得key值为ID的策略
    { 
    	return strategies.get(ID);
    }

   public _2015211362_李楠轩_5_PricingStrategy remove(String ID) //删除key为ID的策略
    {
    //	for(_2015211362_李楠轩_5_PricingStrategy strategy:strategies.values())
    //	{
    //		if(strategy.getClass()==_2015211362_李楠轩_5_CompositeStrategy.class)
    	//	{
    	//		if(strategy.check(ID))
    	//		{
    				
    	//		}
    	//	}
   // }
    	return strategies.remove(ID); 
    }

    public int size() //返回策略的个数
    { 
    	return strategies.size(); 
    }

    public _2015211362_李楠轩_5_PricingStrategy add(_2015211362_李楠轩_5_PricingStrategy strategy)//添加策略
    {
        strategies.put(strategy.getID(), strategy);
        return strategy;
    }

    public String[][] getAllData()//返回一个目录
    {
        int i = 0;
        String[][] data = new String[strategies.size()][];

        for (_2015211362_李楠轩_5_PricingStrategy strategy : strategies.values()) {
            data[i] = new String[]{    //date为二维数组，且将策略加入到这个数组中
                    strategy.getID(),
                    strategy.getName(),
                    strategy.getType(),
                    strategy.getBookTypes(),
                    strategy.getPara()
            };
            i++;
        }

        return data;
    }

    
    public _2015211362_李楠轩_5_PricingStrategy getStrategyOfBook(int type)
    {
        for (_2015211362_李楠轩_5_PricingStrategy strategy : strategies.values())
        {
            if (strategy.containsBook(type)) return strategy;
        }
        return new _2015211362_李楠轩_5_NoDiscountStrategy();
    }


	
}
