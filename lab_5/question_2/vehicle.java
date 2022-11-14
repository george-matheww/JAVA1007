import java.util.*;
public class vehicle implements loan {
    Double slr;
    Double ln;
    public void set_data(Double salary,Double loan){
        slr=salary;
        ln=loan;
    }
    public void display(){
        Double eligible=slr/4;
        System.out.println("The vehicle eligibility criteria is:"+ eligible);
        if(eligible < ln){
            System.out.println("Not eligible");
        }
        else {
            System.out.println("Eligible");
        }
    }
}
