import java.util.*;
public abstract class book{
    private String bt;
    protected Double bp;
    public book(String title){
        bt=title;
    }
    public String return_book_titile(){
        return bt;
    }
    public Double return_book_price(){
        return bp;
    }
    abstract void set_book_price();
}
