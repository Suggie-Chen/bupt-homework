package homework7;

import java.util.HashSet;

public  class _2015211362_�����_5_FlatRateStrategy extends _2015211362_�����_5_PricingStrategy
{

    private double discountPerBook;


    public _2015211362_�����_5_FlatRateStrategy(double discount, HashSet<Integer> book, String ID, String name)
    {
        super(book, ID, name);
        discountPerBook = discount;
    }

    @Override
    public double getSubTotal(_2015211362_�����_5_SaleLineItem item)
    {
        return item.getCopies() * (item.getProdSpec().getPrice() - discountPerBook);
    }

    @Override
    public String getType() { return "����ֵ�Żݲ���"; }

    @Override
    public String getPara() { return String.valueOf(discountPerBook); }
}
