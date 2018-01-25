package homework7;

import java.util.HashMap;
public class _2015211362_�����_5_StrategyCatalog
{
    
    public static final String[] idxToStr = {"����ֵ�Żݲ���", "�ٷֱ��Żݲ���", "�˿����Ų���"};

    //����һ��hashmap�Ĳ��ԣ��������в��ԣ���һ�����������ڶ��������ɲ��Զ���
    private HashMap<String, _2015211362_�����_5_PricingStrategy> strategies = new HashMap<>();

    public _2015211362_�����_5_StrategyCatalog() { }

    
    public _2015211362_�����_5_PricingStrategy get(String ID) //���keyֵΪID�Ĳ���
    { 
    	return strategies.get(ID);
    }

   public _2015211362_�����_5_PricingStrategy remove(String ID) //ɾ��keyΪID�Ĳ���
    {
    //	for(_2015211362_�����_5_PricingStrategy strategy:strategies.values())
    //	{
    //		if(strategy.getClass()==_2015211362_�����_5_CompositeStrategy.class)
    	//	{
    	//		if(strategy.check(ID))
    	//		{
    				
    	//		}
    	//	}
   // }
    	return strategies.remove(ID); 
    }

    public int size() //���ز��Եĸ���
    { 
    	return strategies.size(); 
    }

    public _2015211362_�����_5_PricingStrategy add(_2015211362_�����_5_PricingStrategy strategy)//��Ӳ���
    {
        strategies.put(strategy.getID(), strategy);
        return strategy;
    }

    public String[][] getAllData()//����һ��Ŀ¼
    {
        int i = 0;
        String[][] data = new String[strategies.size()][];

        for (_2015211362_�����_5_PricingStrategy strategy : strategies.values()) {
            data[i] = new String[]{    //dateΪ��ά���飬�ҽ����Լ��뵽���������
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

    
    public _2015211362_�����_5_PricingStrategy getStrategyOfBook(int type)
    {
        for (_2015211362_�����_5_PricingStrategy strategy : strategies.values())
        {
            if (strategy.containsBook(type)) return strategy;
        }
        return new _2015211362_�����_5_NoDiscountStrategy();
    }


	
}
