import java.util.*;
public class Person {
    String fname;
    String lname;
    String address;
    String code;
    String phone;
    Scanner keyboard = new Scanner(System.in);

    public void setData() {
        System.out.println("Enter the first name: ");
        fname = keyboard.nextLine();
        System.out.println("Enter the last name: ");
        lname = keyboard.nextLine();
        System.out.println("Enter the address: ");
        address = keyboard.nextLine();
        System.out.println("Enter the zip code: ");
        code = keyboard.nextLine();
        System.out.println("Enter the phone number: ");
        phone = keyboard.nextLine();
    }
    public String display() {
        return "name: " + fname + lname + " :: " + "address: " + address + code + " :: " + "phone: " + phone;
    }
}
