import java.util.*;
public class Countwords {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the string:");
        String str=sc.nextLine();
        int i=0;
        int counter=0;
        while(i<str.length()){
            if (str.charAt(i) == ' ' || str.charAt(i) == '.' || str.charAt(i) == ',' || str.charAt(i) == '?' || str.charAt(i) == '!' || str.charAt(i) == '-'){
                counter++;
            }
            i++;
        }
        System.out.println(counter);
    }
}
