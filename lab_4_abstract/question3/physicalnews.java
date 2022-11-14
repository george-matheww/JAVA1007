import java.util.*;
public class physicalnews extends Newspapersubscript {
    String add_phys;
    int rate_phys;
    int i=0;
    public physicalnews(String name,String address){
        super(name);
        add_phys=address;
        set_address();
    }
    public final void set_address(){
        address=add_phys;
        char[] spare_add=add_phys.toCharArray();
        for (char c : spare_add){
            if(Character.isDigit(c)){
                i=1;
            }
        }
        if(i==1){
            rate_phys=15;
            rate=rate_phys;
        }
        else{
            rate_phys=0;
            rate=rate_phys;
        }
    }
    public void display(){
        System.out.println("The Name of the user of the physical news subsriber is:"+print_name());
        if (i==1){
            System.out.println("The address of the subscriber is:"+print_address());
            System.out.println("The rate of the subscriber is:"+print_rate());
        }
        else{
            System.out.println("The entered address is invalid and the rate for the subscriber is:"+print_rate());
        }
        System.out.println();
    }
}
