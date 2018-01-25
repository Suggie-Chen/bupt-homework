package homework7;

import java.util.HashSet;
public  class _2015211362_李楠轩_5_PercentageStrategy extends _2015211362_李楠轩_5_PricingStrategy
{
    private int discountPercent = 0;

    public _2015211362_李楠轩_5_PercentageStrategy(int discount, HashSet<Integer> book, String ID, String name)
    {
        //将数据保存
    	super(book, ID, name);
        discountPercent = discount;//获取折扣数
    }

    @Override
    public double getSubTotal(_2015211362_李楠轩_5_SaleLineItem item)//计算价格
    {
        return item.getCopies() * item.getProdSpec().getPrice() * (100 - discountPercent) / 100;
    }

    @Override
    public String getType()//显示策略
    { 
    	return "百分比优惠策略"; 
    }

    @Override
    public String getPara() //输出折扣
    { 
    	return String.valueOf(discountPercent); 
    }
}