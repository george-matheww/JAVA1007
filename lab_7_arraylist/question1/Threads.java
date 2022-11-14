import java.util.Scanner;
public class Threads {
    public static void main(String[] args) throws InterruptedException {
        Scanner in = new Scanner(System.in);
        int n;
        String pass = "George@123";
        System.out.print("Enter a number : ");
        n = in.nextInt();
        armstrong arm = new armstrong(n);
        arm.start();
        arm.join();
        String an2 = arm.getArms();
        random r = new random(n);
        r.start();
        r.join();
        String an3 = r.getAns();
        String inp;
        in.nextLine();
        System.out.print("Enter the password for showing sols: ");
        inp = in.nextLine();
        if (pass.equals(inp)) {
            System.out.println("The number you have entered is: " + n);
            fibbo fib = new fibbo(n);
            fib.start();
            fib.join();
            System.out.println();
            System.out.println(an2);
            System.out.println(an3);
        } else {
            System.out.println("Wrong Password X_X");
        }
    }
}