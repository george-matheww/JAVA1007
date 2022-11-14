import java.util.*;
public class demosubscript {
    public static void main(String[] args) {
        physicalnews ph_sb1 = new physicalnews("George", "Admiralty Avenue A303 Bengaluru");
        physicalnews ph_sb2= new physicalnews("Yogesh", "Dubai");
        onlinenews on_sb3=new onlinenews("Sudeep", "malleshwaram");
        onlinenews on_sb4=new onlinenews("Reddy Anna", "Vizag @204 Royal Heritage");
        ph_sb1.set_address();
        ph_sb2.set_address();
        on_sb3.set_address();
        on_sb4.set_address();
        ph_sb1.display();
        ph_sb2.display();
        on_sb3.display();
        on_sb4.display();
    }
}
