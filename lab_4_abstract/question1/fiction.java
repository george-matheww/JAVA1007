import java.util.*;
public class fiction extends book{
    double pricefic;
    public fiction(String title){
        super(title);
        set_book_price();
    }
    public final void set_book_price(){
        pricefic=24.99;
        bp=pricefic;
    }
}
