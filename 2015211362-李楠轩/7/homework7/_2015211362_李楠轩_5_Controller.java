package homework7;

import java.util.HashSet;


public class _2015211362_李楠轩_5_Controller
{

    private _2015211362_李楠轩_5_BookCatalog bookCatalog = new _2015211362_李楠轩_5_BookCatalog();
    private static _2015211362_李楠轩_5_Controller instance;
    private _2015211362_李楠轩_5_PricingStrategyFactory factory = _2015211362_李楠轩_5_PricingStrategyFactory.getInstance();
    private _2015211362_李楠轩_5_Sale sale = new _2015211362_李楠轩_5_Sale();


    private _2015211362_李楠轩_5_Controller()
    {
        try {
           
            addStrategy(0, "1", new HashSet<Integer>(){{ add(1); }}, "001", "绝对值1");
            addStrategy(1, "7", new HashSet<Integer>(){{ add(2); }}, "002", "百分比1");
            addStrategy(1, "3", new HashSet<Integer>(){{ add(0); }}, "003", "百分比2");
           
        }
        catch (Exception e)
        {

        }
    }
    public static _2015211362_李楠轩_5_Controller getInstance()
    {
        if (instance == null)
            instance = new _2015211362_李楠轩_5_Controller();
        return instance;
    }

    public void addBook(String isbn, double price, String title, int type)
        throws Exception
    {
        _2015211362_李楠轩_5_ProductSpecification book = new _2015211362_李楠轩_5_ProductSpecification(isbn, price, title, type);

        if (bookCatalog.get(book.getISBN()) != null)
            throw new Exception("本书已经存在！");
        else bookCatalog.add(book);
    }

    public String[][] getAllBooksInfo() { return bookCatalog.getAllData(); }

    public String[][] getAllStrategiesInfo() { return factory.getAllStratetiesInfo(); }

    public _2015211362_李楠轩_5_PricingStrategy deleteStrategy(String ID) { return factory.removePricingStrategy(ID); }

    public _2015211362_李楠轩_5_PricingStrategy addStrategy(int type, String paras, HashSet<Integer> books, String ID, String name)
        throws Exception
    {
        return factory.createPricingStrategy(type, paras, books, ID, name);
    }

    public _2015211362_李楠轩_5_PricingStrategy updateStrategy(int type, String paras, HashSet<Integer> books, String ID, String name)
        throws Exception
    {
        factory.removePricingStrategy(ID);
        return factory.createPricingStrategy(type, paras, books, ID, name);
    }

    public _2015211362_李楠轩_5_SaleLineItem buyBook(String ISBN, int num)
        throws Exception
    {
        _2015211362_李楠轩_5_ProductSpecification bookInfo = bookCatalog.get(ISBN);
        if (bookInfo == null) throw new Exception("ISBN号无效");
        return sale.add(new _2015211362_李楠轩_5_SaleLineItem(num, bookInfo, factory.getStrategyOfBook(bookInfo.getType())));
    }

    public _2015211362_李楠轩_5_Sale getSale() { return sale; }
}
