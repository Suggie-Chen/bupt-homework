package homework7;

import java.util.HashSet;


public class _2015211362_�����_5_Controller
{

    private _2015211362_�����_5_BookCatalog bookCatalog = new _2015211362_�����_5_BookCatalog();
    private static _2015211362_�����_5_Controller instance;
    private _2015211362_�����_5_PricingStrategyFactory factory = _2015211362_�����_5_PricingStrategyFactory.getInstance();
    private _2015211362_�����_5_Sale sale = new _2015211362_�����_5_Sale();


    private _2015211362_�����_5_Controller()
    {
        try {
           
            addStrategy(0, "1", new HashSet<Integer>(){{ add(1); }}, "001", "����ֵ1");
            addStrategy(1, "7", new HashSet<Integer>(){{ add(2); }}, "002", "�ٷֱ�1");
            addStrategy(1, "3", new HashSet<Integer>(){{ add(0); }}, "003", "�ٷֱ�2");
           
        }
        catch (Exception e)
        {

        }
    }
    public static _2015211362_�����_5_Controller getInstance()
    {
        if (instance == null)
            instance = new _2015211362_�����_5_Controller();
        return instance;
    }

    public void addBook(String isbn, double price, String title, int type)
        throws Exception
    {
        _2015211362_�����_5_ProductSpecification book = new _2015211362_�����_5_ProductSpecification(isbn, price, title, type);

        if (bookCatalog.get(book.getISBN()) != null)
            throw new Exception("�����Ѿ����ڣ�");
        else bookCatalog.add(book);
    }

    public String[][] getAllBooksInfo() { return bookCatalog.getAllData(); }

    public String[][] getAllStrategiesInfo() { return factory.getAllStratetiesInfo(); }

    public _2015211362_�����_5_PricingStrategy deleteStrategy(String ID) { return factory.removePricingStrategy(ID); }

    public _2015211362_�����_5_PricingStrategy addStrategy(int type, String paras, HashSet<Integer> books, String ID, String name)
        throws Exception
    {
        return factory.createPricingStrategy(type, paras, books, ID, name);
    }

    public _2015211362_�����_5_PricingStrategy updateStrategy(int type, String paras, HashSet<Integer> books, String ID, String name)
        throws Exception
    {
        factory.removePricingStrategy(ID);
        return factory.createPricingStrategy(type, paras, books, ID, name);
    }

    public _2015211362_�����_5_SaleLineItem buyBook(String ISBN, int num)
        throws Exception
    {
        _2015211362_�����_5_ProductSpecification bookInfo = bookCatalog.get(ISBN);
        if (bookInfo == null) throw new Exception("ISBN����Ч");
        return sale.add(new _2015211362_�����_5_SaleLineItem(num, bookInfo, factory.getStrategyOfBook(bookInfo.getType())));
    }

    public _2015211362_�����_5_Sale getSale() { return sale; }
}
