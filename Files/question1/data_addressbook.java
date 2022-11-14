import java.util.ArrayList;
import java.util.Scanner;
public class data_addressbook {
    Scanner in = new Scanner(System.in);
    ArrayList<String> arr = new ArrayList<>();
    ArrayList<Integer> arr1 = new ArrayList<>();

    public void addperson() {
        System.out.println("Enter the person Name: ");
        String name;
        name = in.nextLine();
        arr.add(name);
        System.out.println("Enter the person ID: ");
        int id;
        id = in.nextInt();
        arr1.add(id);
    }

    public void delete() {
        int temp = 0;
        System.out.println("Enter the person ID to delete: ");
        int x = in.nextInt();
        for (int i = 0; i < arr1.size(); i++) {
            if (arr1.get(i) == x) {
                temp = i;
            }
        }
        arr.remove(temp);
        arr1.remove(temp);
        System.out.println("Person with id:" + (temp + 1) + " has been deleted successfully");
    }

    public void modify() {
        System.out.println("Enter the person ID to modify: ");
        int x = in.nextInt();
        int temp = 0;
        for (int i = 0; i < arr1.size(); i++) {
            if (arr1.get(i) == x) {
                temp = i;
            }
        }
        System.out.println("Enter the New name of the Person: ");
        String xx = in.next();
        arr.set(temp, xx);
        System.out.println("Person with id:" + (temp + 1) + " has been Modified successfully");
    }

    public void display() {
        System.out.println("The person list elements are: ");
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }
    }
}
