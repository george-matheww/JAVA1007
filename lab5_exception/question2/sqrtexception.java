import java.util.*;
public class sqrtexception {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number to find sqrt: ");
        int n = in.nextInt();
        if (n < 0) {
            throw new ArithmeticException("Youu gave a negative number=_=");
        } else {
            System.out.println("Square root of the number is:" + Math.sqrt(n));
        }
    }
}
