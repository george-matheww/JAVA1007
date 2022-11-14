import java.util.*;
public class HousingLoan extends Loan{
    double inter;
    public HousingLoan(String type){
        super(type);
        set_cost();
        set_display();
    }
    public final void set_cost(){
        inter=0.08;
        interest=inter;
    }
    public final void set_display(){
        System.out.println("The type of loan is:"+return_loan_type());
        System.out.println("The interest rate is:"+ return_interest());
    }
}