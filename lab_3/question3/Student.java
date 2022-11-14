import java.util.*;
public class Student extends Person {
    String major;
    double gpa;
    Scanner keyboard = new Scanner(System.in);

    @Override
    public void setData() {
        super.setData();
        System.out.println("Enter the student's major: ");
        major = keyboard.nextLine();
        System.out.println("Enter the GPA: ");
        gpa = keyboard.nextDouble();
    }
    @Override
    public String display() {
        return super.display() + "\n" + "major: " + major + " :: " + "GPA: " + gpa;
    }
}
