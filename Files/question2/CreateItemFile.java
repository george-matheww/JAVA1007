import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
public class CreateItemFile {
    private int itemNumber;
    private String itemDescription;

    public CreateItemFile() {
        itemNumber = 0;
        itemDescription = "";
    }

    public CreateItemFile(int itemNum, String itemDesc) {
        itemNumber = itemNum;
        itemDescription = itemDesc;
    }

    public int getItemNumber() {
        return itemNumber;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public static void main(String[] args) {
        int itemNum;
        String itemDesc;
        ArrayList<Integer> itemNumList = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        try {
            FileWriter fw = new FileWriter("items.txt");
            while (true) {
                System.out.print("Enter the three digit " + "item number: ");
                itemNum = sc.nextInt();
                sc.nextLine();
                if (itemNum == -1) {
                    break;
                }
                if (itemNumList.contains(itemNum) == false) {
                    itemNumList.add(itemNum);
                    System.out.print("Enter the item " + "description: ");
                    itemDesc = sc.nextLine();
                    while (itemDesc.length() > 20) {
                        System.out.println("The item description " + "is too long.");
                        System.out.print("Enter the item " + "description: ");
                        itemDesc = sc.nextLine();
                    }
                    fw.write(Integer.toString(itemNum));
                    fw.write("\n");
                    fw.write(itemDesc);
                    fw.write("\n");
                } else {
                    System.out.println("The item with item " + "number " +
                            itemNum + " is already in the file.");
                }
                System.out.println();
            }
            fw.close();
        } catch (IOException exe) {
            System.out.println("File does not exist!");
        }
    }
}
