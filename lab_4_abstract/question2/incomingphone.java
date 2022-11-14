import java.util.*;
public class incomingphone extends phonecall{
    double pr;
    double rt;
    public incomingphone(String phone){
        super(phone);
        set_price();
    }
    public final void set_price(){
        pr=0.02;
        price=pr;
        rt=0.02;
        rate=rt;
    }
    public void display(){
        System.out.println("The phone number of the incoming call is:"+print_phone_no());
        System.out.println("The rate of the incoming call is:"+print_rate());
        System.out.println("The price for the incoming call is:"+print_price());
    }
}
