package homework7;

import java.util.ArrayList;

public class _2015211362_ÀîéªĞù_5_Sale implements _2015211362_ÀîéªĞù_5_Subject
{

    private ArrayList<_2015211362_ÀîéªĞù_5_SaleLineItem> items = new ArrayList<>();

  
    ArrayList<_2015211362_ÀîéªĞù_5_Observer> observers = new ArrayList<>();

   
    public _2015211362_ÀîéªĞù_5_Sale() {}

    
    public _2015211362_ÀîéªĞù_5_SaleLineItem add(_2015211362_ÀîéªĞù_5_SaleLineItem item)
    {
        items.add(item);
        notifyObservers();
        return item;
    }

    public double getTotal()
    {
        double temp = 0;
        for (_2015211362_ÀîéªĞù_5_SaleLineItem item : items)
            temp += item.getSubTotal();
        return temp;
    }

    public String[][] getCartInfo()
    {
        String[][] temp = new String[items.size()][];

        for (int i = 0; i < items.size(); i++)
        {
            _2015211362_ÀîéªĞù_5_SaleLineItem item = items.get(i);
            double oldPrice = item.getCopies() * item.getProdSpec().getPrice();
            double discount = oldPrice - item.getSubTotal();

            temp[i] = new String[]{
                items.get(i).getProdSpec().getTitle(),
                String.valueOf(items.get(i).getCopies()),
                String.valueOf(oldPrice),
                String.valueOf(discount)
            };
        }

        return temp;
    }

   
    @Override
    public void registerObserver(_2015211362_ÀîéªĞù_5_Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(_2015211362_ÀîéªĞù_5_Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (_2015211362_ÀîéªĞù_5_Observer observer : observers) {
            observer.update(this);
        }
    }
}
