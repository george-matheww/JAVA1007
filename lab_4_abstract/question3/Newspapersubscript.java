import java.net.ProtocolException;
import java.util.*;
public abstract class Newspapersubscript {
    private String Name;
    protected String address;
    protected int rate;
    public Newspapersubscript(String Nm){
        Name=Nm;
        address="";
        rate=0;
    }
    public String print_name(){
        return Name;
    }
    public String print_address(){
        return address;
    }
    public int print_rate(){
        return rate;
    }
    abstract void set_address();
}
