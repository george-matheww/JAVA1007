
import java.util.*;
public class Faculty extends CollegeEmployee {
    boolean tenure;
    Scanner keyboard = new Scanner(System.in);

    @Override
    public void setData() {
        super.setData();
        System.out.println("is the faculty tenured: ");
        tenure = keyboard.nextBoolean();
    }
    @Override
    public String display() {
        if (tenure) {
            return super.display() + "faculty is tenured";
        } else {
            return super.display() + "faculty is not tenured";
        }
    }
}
