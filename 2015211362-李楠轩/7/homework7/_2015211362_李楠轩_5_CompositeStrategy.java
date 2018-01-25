package homework7;

import java.util.ArrayList;
import java.util.HashSet;
abstract public class _2015211362_�����_5_CompositeStrategy extends _2015211362_�����_5_PricingStrategy//���ϲ���
{
    protected ArrayList<String> strategies = new ArrayList<String>();

    public _2015211362_�����_5_CompositeStrategy() {}
    public _2015211362_�����_5_CompositeStrategy(String[] list, HashSet<Integer> book, String ID, String name)
    {//���ϲ�����ӵ�һ��list�������ʾ���ϲ���
        super(book, ID, name);
        for (String strategyName : list)
            strategies.add(strategyName);
    }
    public boolean check(String id)
    {
    	
    	if(strategies.contains(id))
    	{
    		return true;
    	}
    	else
    		return false;
    	
    }
    public void add(String name)
    {
    	strategies.add(name); 
    }

    @Override
    public String getPara() 
    { 
    	return String.join(",", strategies); //�����ݷ���Ϊ A,B,C����ʽ
    }

}
