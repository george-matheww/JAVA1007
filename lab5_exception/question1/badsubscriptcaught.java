import java.util.*;
public class badsubscriptcaught {
    public static void main(String[] args) {
        String[] arr = new String[] {"george","lmao","highget","karun","yogesh","mister","rohan","budget"};
        // System.out.print(arr[1]);
        Scanner in = new Scanner(System.in);
        try {
            System.out.println("Enter the position required: ");
            int s1 = in.nextInt();
            System.out.println("Name in position " + s1 + " " + "is:" + arr[s1]);
        } catch (Exception e) {
            System.out.println("Index out of bounds please check again");
        }
    }
}