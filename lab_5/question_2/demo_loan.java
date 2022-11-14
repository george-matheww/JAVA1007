import java.util.*;
public class demo_loan {
    public static void main(String[] args) {
        personal_loan pl=  new personal_loan();
        buisness_loan bl = new buisness_loan();
        vehicle vl = new vehicle();
        Double salary,loan;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the salary you earn:");
        salary = in.nextDouble();
        System.out.print("Enter the loan required:");
        loan= in.nextDouble();
        pl.set_data(salary,loan);
        bl.set_data(salary,loan);
        vl.set_data(salary,loan);
        pl.display();
        bl.display();
        vl.display();
    }
}
