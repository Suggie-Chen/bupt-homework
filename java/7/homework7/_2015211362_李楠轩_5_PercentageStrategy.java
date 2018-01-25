package homework7;

import java.util.HashSet;
public  class _2015211362_�����_5_PercentageStrategy extends _2015211362_�����_5_PricingStrategy
{
    private int discountPercent = 0;

    public _2015211362_�����_5_PercentageStrategy(int discount, HashSet<Integer> book, String ID, String name)
    {
        //�����ݱ���
    	super(book, ID, name);
        discountPercent = discount;//��ȡ�ۿ���
    }

    @Override
    public double getSubTotal(_2015211362_�����_5_SaleLineItem item)//����۸�
    {
        return item.getCopies() * item.getProdSpec().getPrice() * (100 - discountPercent) / 100;
    }

    @Override
    public String getType()//��ʾ����
    { 
    	return "�ٷֱ��Żݲ���"; 
    }

    @Override
    public String getPara() //����ۿ�
    { 
    	return String.valueOf(discountPercent); 
    }
}