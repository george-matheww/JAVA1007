import java.util.*;
public class outgoingphone extends phonecall{
    int timer;
    Double prpr;
    Double rtrt;
    public outgoingphone(String phone, int time){
        super(phone);
        timer=time;
        set_price();
    }
    public final void set_price(){
        rtrt=0.04;
        rate =rtrt;
        prpr=rtrt*timer;
        price=prpr;
    }
    public void display(){
        System.out.println("The phone number of the outgoing call is:"+print_phone_no());
        System.out.println("The rate of the outgoing call is:"+print_rate());
        System.out.println("The time of the call duration is:" +timer+" minutes");
        System.out.println("The price of the outgoing call is:"+print_price());
    }
}
