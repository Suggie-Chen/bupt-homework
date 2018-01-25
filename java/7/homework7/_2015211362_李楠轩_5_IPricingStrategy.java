package homework7;

import java.lang.reflect.Array;
import java.util.ArrayList;

public interface _2015211362_ÀîéªÐù_5_IPricingStrategy
{
    int FLATRATE = 0;
    int PERCENTAGE = 1;
    int COMPOSITE = 2;
    int NODISCOUNT = 3;

    double getSubTotal(_2015211362_ÀîéªÐù_5_SaleLineItem item);
   
}
