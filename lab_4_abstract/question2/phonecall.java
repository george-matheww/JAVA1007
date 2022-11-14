import java.util.*;
public abstract class phonecall{
    private String phno;
    protected Double price;
    protected Double rate;
    protected int time;
    public phonecall(String phone){
        phno=phone;
        price=0.0;
        rate=0.0;
        time=0;
    }
    public String print_phone_no(){
        return phno;
    }
    public Double print_price(){
        return price;
    }
    public Double print_rate(){
        return rate;
    }
    abstract void set_price();
}
