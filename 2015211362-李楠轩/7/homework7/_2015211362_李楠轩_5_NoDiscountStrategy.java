package homework7;
public  class _2015211362_�����_5_NoDiscountStrategy extends _2015211362_�����_5_PricingStrategy
{
    @Override
    public double getSubTotal(_2015211362_�����_5_SaleLineItem item)
    {
        return item.getCopies() * item.getProdSpec().getPrice();
    }

    @Override
    public String getType() { return "���Ż�"; }

    @Override
    public String getPara() { return "null"; }
}
