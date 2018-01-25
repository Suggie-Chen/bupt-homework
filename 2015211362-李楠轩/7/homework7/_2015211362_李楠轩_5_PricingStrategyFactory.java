package homework7;

import java.util.HashSet;

public class _2015211362_�����_5_PricingStrategyFactory
{
    //ȫ�ֱ���instance
    private static _2015211362_�����_5_PricingStrategyFactory instance;
    //��һ����Ŀ¼��
    private _2015211362_�����_5_StrategyCatalog catalog;

    //���캯��
    private _2015211362_�����_5_PricingStrategyFactory() 
    { 
    	catalog = new _2015211362_�����_5_StrategyCatalog(); 
    }

    //�½�һ�����Կ���
    static public _2015211362_�����_5_PricingStrategyFactory getInstance()
    {
        if (null == instance)
            instance = new _2015211362_�����_5_PricingStrategyFactory();
         return instance;
    }

    //����Ŀ¼
    public _2015211362_�����_5_PricingStrategy getStrategyOfBook(int type) //����һ������
    { 
    	return catalog.getStrategyOfBook(type); 
    }
    public _2015211362_�����_5_PricingStrategy getPricingStrategy(String ID) //����ID������ID
    { 
    	return catalog.get(ID); 
    }
    public _2015211362_�����_5_PricingStrategy removePricingStrategy(String ID) //ɾ��һ��ID�Ĳ���
    { 
    	
    	return catalog.remove(ID); 
    }
    public String[][] getAllStratetiesInfo() //������еĲ���
    { 
    	return catalog.getAllData(); 
    }

    /* The factory pattern method */
    public _2015211362_�����_5_PricingStrategy createPricingStrategy(int type, Object paras, HashSet<Integer> booktype, String ID, String name)
        throws Exception
    {
       
        if (catalog.get(ID) != null)
            throw new Exception("�Ѵ�����ͬ��ŵĲ��ԣ�");
        for (int i : booktype)
            if (!catalog.getStrategyOfBook(i).getType().equals("���Ż�"))
                throw new Exception(_2015211362_�����_5_ProductSpecification.idxToStr[i] + "�ѱ��󶨣�");

        /* Create the strategy */
        _2015211362_�����_5_PricingStrategy temp = null;
        switch (type)
        {
            case _2015211362_�����_5_IPricingStrategy.FLATRATE:
                temp = catalog.add(new _2015211362_�����_5_FlatRateStrategy(Double.parseDouble(paras.toString()), booktype, ID, name));
                break;

            case _2015211362_�����_5_IPricingStrategy.PERCENTAGE:
                temp = catalog.add(new _2015211362_�����_5_PercentageStrategy(Integer.parseInt(paras.toString()), booktype, ID, name));
                break;

            case _2015211362_�����_5_IPricingStrategy.COMPOSITE:
                // Check Validity
                String[] list = paras.toString().split(",");
                for (String strategyID : list)
                    if (catalog.get(strategyID) == null) throw new Exception("����ļ򵥲��Ա����Ч��");
                temp = catalog.add(new _2015211362_�����_5_CompositeBestForCustomer(list, booktype, ID, name));
                break;

            case _2015211362_�����_5_IPricingStrategy.NODISCOUNT:
                temp = catalog.add(new _2015211362_�����_5_NoDiscountStrategy());
                break;

            default:
                return null;
        }
        if (temp == null) throw new Exception("������Ч��");
        return temp;
    }
}
