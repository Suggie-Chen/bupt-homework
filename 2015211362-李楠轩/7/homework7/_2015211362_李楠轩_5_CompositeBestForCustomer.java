package homework7;

import java.util.HashSet;
public  class _2015211362_李楠轩_5_CompositeBestForCustomer extends _2015211362_李楠轩_5_CompositeStrategy
{
    static final int MAX_TOTAL = 2014211519;

    /* The constructor method */
    public _2015211362_李楠轩_5_CompositeBestForCustomer(String[] list, HashSet<Integer> book, String ID, String name)
    {
        super(list, book, ID, name);
    }

    @Override
    public double getSubTotal(_2015211362_李楠轩_5_SaleLineItem item)
    {
        double best = MAX_TOTAL, temp;

        for (String name : strategies)
        {
            temp = _2015211362_李楠轩_5_PricingStrategyFactory.getInstance().getPricingStrategy(name).getSubTotal(item);
            best = best > temp ? temp: best;
        }
        return best;
    }
    public  boolean check1(String id)
    {
    	return true;
    }
    @Override
    public String getType() { return "顾客最优策略"; }

}
