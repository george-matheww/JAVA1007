import java.util.*;
public class UseInsurace {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String loan_type;
        loan_type = in.nextLine();
        if (loan_type.equals("housing")){
            HousingLoan loan1=new HousingLoan(loan_type);
        }
        else if(loan_type.equals("vehicle")){
            VehicleLoan loan2=new VehicleLoan(loan_type);
        }
    }
}
