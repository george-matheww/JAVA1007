import java.util.Scanner;
public class q1 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int v, c;
        System.out.println("enter number of voters:");
        v = in.nextInt();
        System.out.println("enter number of candidates:");
        c = in.nextInt();
        String s;
        System.out.println("enter ranklist:");
        String[] arr = new String[v * c];
        for (int i = 0; i < v * c; i++) {
            arr[i] = in.next();
        }
        ranklist r = new ranklist(v, c, arr);
        String win = r.calc();
        System.out.println("winner is " + win);
    }
}
