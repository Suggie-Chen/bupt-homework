package homework7;
public  class _2015211362_李楠轩_5_NoDiscountStrategy extends _2015211362_李楠轩_5_PricingStrategy
{
    @Override
    public double getSubTotal(_2015211362_李楠轩_5_SaleLineItem item)
    {
        return item.getCopies() * item.getProdSpec().getPrice();
    }

    @Override
    public String getType() { return "无优惠"; }

    @Override
    public String getPara() { return "null"; }
}
