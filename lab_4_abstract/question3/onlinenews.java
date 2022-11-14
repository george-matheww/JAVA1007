import java.util.*;
public class onlinenews extends Newspapersubscript {
    String add_online;
    int rate_online;
    int j=0;
    public onlinenews(String name, String address){
        super(name);
        add_online=address;
        rate_online=rate;
        set_address();
    }
    public final void set_address(){
        address=add_online;
        char[] spar_add=add_online.toCharArray();
        for (char d : spar_add){
            if(d=='@'){
                j=1;
            }
        }
        if (j==1){
            rate_online=9;
            rate=rate_online;
        }
        else{
            rate_online=0;
            rate=rate_online;
        }
    }
    public void display(){
        System.out.println("The Name of the user of the online news subsriber is:"+print_name());
        if (j==1){
            System.out.println("The address of the subscriber is:"+print_address());
            System.out.println("The rate of the subscriber is:"+print_rate());
        }
        else{
            System.out.println("The entered address is invalid and the rate for the subscriber is:"+print_rate());
        }
        System.out.println();
    }
}
