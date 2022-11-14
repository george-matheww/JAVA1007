import java.util.*;
public class DeliveryPizza extends pizza {
    int delfee;
    String address;
    public DeliveryPizza(String Descr, int price, String address) {
        this.Descr = Descr;
        this.price = price;
        this.address = address;
    }
    public void displayfinal() {
        int total;
        if (price > 15) {
            delfee = 3;
        } else {
            delfee = 5;
        }
        total = delfee + price;
        System.out.println("Pizza description: " + Descr);
        System.out.println("price: " + price);
        System.out.println("delivery address: " + address);
        System.out.println("delivery fee: " + delfee);
        System.out.println("total: " + total);
    }
}
