import java.util.*;
public class nonfiction extends book{
    double pricenon;
    public nonfiction(String title){
        super(title);
        set_book_price();
    }
    public final void set_book_price(){
        pricenon=37.99;
        bp=pricenon;
    }
}
