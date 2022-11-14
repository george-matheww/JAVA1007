import java.util.*;
public class demophone {
    public static void main(String[] args) {
        incomingphone incom=new incomingphone("9686255277");
        outgoingphone outcom=new outgoingphone("9742204549", 25);
        incom.set_price();
        outcom.set_price();
        incom.display();
        outcom.display();
    }
}
