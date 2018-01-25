package homework7;

import java.util.HashMap;

/**
 * Created by YeWenting on 2017/1/3.
 */
public class _2015211362_李楠轩_5_BookCatalog
{

    HashMap<String, _2015211362_李楠轩_5_ProductSpecification> books = new HashMap<>();
    _2015211362_李楠轩_5_PricingStrategyFactory factory = _2015211362_李楠轩_5_PricingStrategyFactory.getInstance();

    public _2015211362_李楠轩_5_BookCatalog() {}

    public _2015211362_李楠轩_5_ProductSpecification add(_2015211362_李楠轩_5_ProductSpecification book) { books.put(book.getISBN(), book); return book; }
    public _2015211362_李楠轩_5_ProductSpecification get(String ISBN) { return books.get(ISBN); }
    public String[][] getAllData()
    {
        int i = 0;
        String[][] data = new String[books.size()][];

        for (_2015211362_李楠轩_5_ProductSpecification book : books.values()) {
            data[i] = new String[]{
                    book.getISBN(),
                    book.getTitle(),
                    _2015211362_李楠轩_5_ProductSpecification.idxToStr[book.getType()],
                    String.valueOf(book.getPrice()),
                    factory.getStrategyOfBook(book.getType()).getType()
            };
            i++;
        }

        return data;
    }
}
