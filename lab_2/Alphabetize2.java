import java.util.Scanner;

public class Alphabetize2 {
    public static void main(String[] args) {
        String[] str = new String[3];
        System.out.println("Enter strings:");
        for (int i = 0; i < 3; i++) {
            Scanner SC = new Scanner(System.in);
            str[i] = SC.nextLine();
        }
        String temp;
        for (int i = 0; i < 3; i++) {
            for (int j = i + 1; j < 3; j++) {
                if (str[i].compareTo(str[j]) > 0) {
                    temp = str[i];
                    str[i] = str[j];
                    str[j] = temp;
                }
            }
        }
        System.out.println(
                "The names in alphabetical order are: ");
        for (int i = 0; i < 3; i++) {
            System.out.println(str[i]);
        }
    }
}
