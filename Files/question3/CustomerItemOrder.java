import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CustomerItemOrder {
    public static void main(String[] args) {
        int custId, itemNum, isCustomerFound = 0, isItemFound = 0;
        String currentLine;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a customer id: ");
        custId = sc.nextInt();
        System.out.print("Enter an item number: ");
        itemNum = sc.nextInt();
        BufferedReader bread = null;
        try {
            bread = new BufferedReader(new FileReader("C:\\Coding\\Java_1007\\Files\\question3\\customers.txt"));
            while ((currentLine = bread.readLine()) != null) {
                if (currentLine.equals(Integer.toString(custId))) {
                    System.out.println("\nCustomer Information:");
                    System.out.println("Customer Id: " + currentLine);
                    currentLine = bread.readLine();
                    System.out.println("Customer Last Name: " + currentLine);
                    currentLine = bread.readLine();
                    System.out.println("Customer Zip Code: " + currentLine);
                    isCustomerFound = 1;
                    break;
                }
            }
            bread.close();
        } catch (IOException exe) {
            System.out.println("Some error occurred!");
        }
        try {
            bread = new BufferedReader(new FileReader("C:\\Coding\\Java_1007\\Files\\question3\\items.txt"));
            while ((currentLine = bread.readLine()) != null) {
                if (currentLine.equals(Integer.toString(itemNum))) {
                    System.out.println("\nItem Information:");
                    System.out.println("Item Number: " + currentLine);
                    currentLine = bread.readLine();
                    System.out.println("Item Description: " + currentLine);
                    isItemFound = 1;
                    break;
                }
            }
            bread.close();
        } catch (IOException exe) {
            System.out.println("Some error occurred!");
        }
        if (isCustomerFound == 0) {
            System.out.println("\nCustomer with id " + custId + " does not exist in the file.");
        }
        if (isItemFound == 0) {
            System.out.println("\nItem with item number " + itemNum + " does not exist in the file.");
        }
    }
}
