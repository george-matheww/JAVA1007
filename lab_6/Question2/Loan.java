import java.util.*;
public abstract class Loan{
    private String loan_type;
    protected Double interest;
    public Loan(String type){
        loan_type=type;
    }
    public String return_loan_type(){
        return loan_type;
    }
    public Double return_interest(){
        return interest;
    }
    abstract void set_cost();
    abstract void set_display();
}