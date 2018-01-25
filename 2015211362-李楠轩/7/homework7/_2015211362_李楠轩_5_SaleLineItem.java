package homework7;
public class _2015211362_李楠轩_5_SaleLineItem
{
 
    private int copies = 0;
    private _2015211362_李楠轩_5_ProductSpecification prodSpec = null;
    private _2015211362_李楠轩_5_PricingStrategy strategy = null;

 
    public _2015211362_李楠轩_5_SaleLineItem(int copies, _2015211362_李楠轩_5_ProductSpecification prodSpec, _2015211362_李楠轩_5_PricingStrategy strategy)
    {
        this.copies = copies;
        this.prodSpec = prodSpec;
        this.strategy = strategy;
    }

    public int getCopies() { return copies; }
    public _2015211362_李楠轩_5_ProductSpecification getProdSpec() { return prodSpec; }
    public double getSubTotal() { return strategy.getSubTotal(this); }
}
