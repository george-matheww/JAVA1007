import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;

public class CreateCustomerfile{
public static void main(String[] args) throws IOException
{
    Scanner in=new Scanner(System.in);
    ArrayList<String> id_arr=new ArrayList<>();
    ArrayList<String> zip_arr=new ArrayList<>();
    ArrayList<String> name_arr=new ArrayList<>();
    FileWriter myfile= new
    FileWriter("C:\\Coding\\Java_1007\\Files\\question1\\q1.txt");
    // myfile.createNewFile();
    System.out.println("Enter the ID number, ZIP Code and Name and 4.to exit: ");
    int c=in.nextInt();
    while(c!=4){
        System.out.println("Enter id: ");
        String id=in.next();
        id_arr.add(id);
        myfile.write(id);
        if(!id_arr.isEmpty()){
            if(id_arr.contains(id)){
                id_arr.remove(id);
                System.out.print("The id already exists, Enter new id:");
                id=in.next();
                id_arr.add(id);
                myfile.write(id);
            }
        }
        System.out.println("Enter zip: ");
        String zip=in.next();
        System.out.println("Enter name: ");
        String name=in.next();
        if(name.length()!=7){
            System.out.println("Name too long/short, enter name of 7 characters.");
            name=in.next();
            name_arr.add(name);
        }
        myfile.write(name);
        myfile.write(zip);
        myfile.close();
        System.out.println("Enter the ID number, ZIP Code and Name and 4. to exit: ");
        c=in.nextInt();
    }
}
}
