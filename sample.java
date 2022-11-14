import java.util.Scanner;

public class sample {
    public static void main(String[] args) {
        Scanner keyboard;
        boolean myBoolean;
        byte myByte;
        double myDouble;
        float myFloat;
        int myInt;
        long myLong;
        short myShort;
        String myString;
        keyboard = new Scanner(System.in);
        System.out.print("Enter any String: ");
        myString = keyboard.nextLine();
        System.out.println("You’ve entered: " + myString);
        System.out.print("Enter a String with no space: ");
        myString = keyboard.next();
        System.out.println("You’ve entered: " + myString);
        System.out.print("Enter a boolean: ");
        myBoolean = keyboard.nextBoolean();
        System.out.println("You’ve entered: " + myBoolean);
        System.out.print("Enter a byte: ");
        myByte = keyboard.nextByte();
        System.out.println("You’ve entered: " + myByte);
        System.out.print("Enter a double: ");
        myDouble = keyboard.nextDouble();
        System.out.println("You’ve entered: " + myDouble);
        System.out.print("Enter a float: ");
        myFloat = keyboard.nextFloat();
        System.out.print("Enter a int ");
        myInt = keyboard.nextInt();
        System.out.println("You’ve entered: " + myInt);
        System.out.print("Enter a long: ");
        myLong = keyboard.nextLong();
        System.out.println("You’ve entered: " + myLong);
    }
}