package homework7;

public class _2015211362_�����_5_ProductSpecification
{
  
    static public final int NON_EXIST = -1;
    static public final int NON_COMPUTER_TEXTBOOK = 0;
    static public final int TEXTBOOK = 1;
    static public final int COMIC_BOOK = 2;
    static public final int HEALTHCARE_BOOK = 3;
    static public final int OTHER_BOOK = 4;
    static public final String[] idxToStr = {"�ǽ̲�������ͼ��", "�̲���ͼ��", "��������ͼ��", "������ͼ��", "����"};

  
    private String isbn = null, title = null;
    private double price = 0;
    private int type = NON_EXIST;

   
    public _2015211362_�����_5_ProductSpecification() {}
    public _2015211362_�����_5_ProductSpecification(String isbn, double price, String title, int type)
    {
        this.isbn = isbn;
        this.price = price;
        this.title = title;
        this.type = type;
    }

 
    public String getISBN() { return isbn; }
    public double getPrice() { return price; }
    public String getTitle() { return title; }
    public int getType() { return type; }
}
