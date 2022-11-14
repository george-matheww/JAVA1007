import java.util.Scanner;
public class Palindrome{
    public static void main(String args[])
    {
        Scanner keyboard;
        String phrase;
        String inver = new String();
        keyboard = new Scanner(System.in);
        System.out.println("enter a string: ");
        phrase = keyboard.nextLine();
        String lowercase_string=phrase.toLowerCase();
        for (int i=0; i<lowercase_string.length(); i++)
        {
            char ch= lowercase_string.charAt(i); 
            inver = ch + inver; 
        }
        if(lowercase_string.equals(inver)==true)
        {
            System.out.println("its a palindrome");
        }
        else
        {
            System.out.println("its not a palindrome");
        }
    }
}