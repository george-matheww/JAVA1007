
import java.util.*;
public class CollegeEmployee extends Person {
    String ssn;
    double salary;
    String deptname;
    Scanner keyboard = new Scanner(System.in);

    @Override
    public void setData() {
        super.setData();
        System.out.println("Enter the ssn: ");
        ssn = keyboard.nextLine();
        System.out.println("Enter the annual salary: ");
        salary = keyboard.nextDouble();
        keyboard.nextLine();
        System.out.println("Enter the department name: ");
        deptname = keyboard.nextLine();
    }
    @Override
    public String display() {
        return super.display() + "\n" + "SSN: " + ssn + " :: " + "Salary: " + salary + " :: " + "department: "
                + deptname;
    }
}
