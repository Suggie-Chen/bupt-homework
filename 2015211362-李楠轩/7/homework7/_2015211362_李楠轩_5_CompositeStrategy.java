package homework7;

import java.util.ArrayList;
import java.util.HashSet;
abstract public class _2015211362_李楠轩_5_CompositeStrategy extends _2015211362_李楠轩_5_PricingStrategy//符合策略
{
    protected ArrayList<String> strategies = new ArrayList<String>();

    public _2015211362_李楠轩_5_CompositeStrategy() {}
    public _2015211362_李楠轩_5_CompositeStrategy(String[] list, HashSet<Integer> book, String ID, String name)
    {//符合策略添加到一个list里，用来显示符合策略
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
    	return String.join(",", strategies); //将数据返回为 A,B,C的形式
    }

}
