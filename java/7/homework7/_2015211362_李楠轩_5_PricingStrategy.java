package homework7;

import java.util.HashSet;
import java.util.Set;
abstract public class _2015211362_李楠轩_5_PricingStrategy implements _2015211362_李楠轩_5_IPricingStrategy
{
	abstract public double getSubTotal(_2015211362_李楠轩_5_SaleLineItem item);//后面的每个策略调用这个函数得到结果
    abstract public String getType();
    abstract public String getPara();
	
	//定义一个整型的set,保存书类型的编号
    private HashSet<Integer> book = new HashSet<Integer>();
    private String ID = "", name = "";
    //构造函数
    public _2015211362_李楠轩_5_PricingStrategy() {}
    
    public _2015211362_李楠轩_5_PricingStrategy(HashSet<Integer> book, String ID, String name)
    {
        this.book.addAll(book);//加入新的策略
        this.ID = ID;
        this.name = name;
    }
    //构造函数结束
    //加入策略
   // abstract public  boolean check1(String id);
    public void setBook(Set<Integer> list) 
    { 
    	book.addAll(list); 
    }
    //比较是否有type这个策略
    public boolean containsBook(int type) 
    { 
    	return book.contains(type); 
    }
    //返回策略id
    public String getID()
    { 
    	return ID; 
    }
    //返回策略名称
    public String getName() 
    { 
    	return name; 
    }
    public String getBookTypes()//获得书类型
    {
        StringBuilder temp = new StringBuilder();

        if (book.size() > 0)
            for (int type : book)
                temp.append(_2015211362_李楠轩_5_ProductSpecification.idxToStr[type] + " ");
        else
            temp.append("无");

        return temp.toString();
    }

    
}
