package homework7;

import java.util.HashSet;
import java.util.Set;
abstract public class _2015211362_�����_5_PricingStrategy implements _2015211362_�����_5_IPricingStrategy
{
	abstract public double getSubTotal(_2015211362_�����_5_SaleLineItem item);//�����ÿ�����Ե�����������õ����
    abstract public String getType();
    abstract public String getPara();
	
	//����һ�����͵�set,���������͵ı��
    private HashSet<Integer> book = new HashSet<Integer>();
    private String ID = "", name = "";
    //���캯��
    public _2015211362_�����_5_PricingStrategy() {}
    
    public _2015211362_�����_5_PricingStrategy(HashSet<Integer> book, String ID, String name)
    {
        this.book.addAll(book);//�����µĲ���
        this.ID = ID;
        this.name = name;
    }
    //���캯������
    //�������
   // abstract public  boolean check1(String id);
    public void setBook(Set<Integer> list) 
    { 
    	book.addAll(list); 
    }
    //�Ƚ��Ƿ���type�������
    public boolean containsBook(int type) 
    { 
    	return book.contains(type); 
    }
    //���ز���id
    public String getID()
    { 
    	return ID; 
    }
    //���ز�������
    public String getName() 
    { 
    	return name; 
    }
    public String getBookTypes()//���������
    {
        StringBuilder temp = new StringBuilder();

        if (book.size() > 0)
            for (int type : book)
                temp.append(_2015211362_�����_5_ProductSpecification.idxToStr[type] + " ");
        else
            temp.append("��");

        return temp.toString();
    }

    
}
