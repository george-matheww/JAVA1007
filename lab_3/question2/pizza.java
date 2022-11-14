import java.util.*;
public class pizza {
    String Descr;
    int price;
    public void pizza(String Descr, int price){
        this.Descr = Descr;
        this.price = price;
    }
    public void Display(){
        System.out.println("Description of the pizza:"+Descr);
        System.out.println("Price of the pizza:"+price);
    }
}
