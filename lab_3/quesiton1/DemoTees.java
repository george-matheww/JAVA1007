import java.util.*;
public class DemoTees {
    public static void main(String[] args) {
        int ord1,ord2,ord3,ord4;
        String size1,size2,size3,size4;
        String colour1,colour2,colour3,colour4;
        String slogan1,slogan2;
        TeeShirt tee1 = new TeeShirt();
        TeeShirt tee2 = new TeeShirt();
        CustomTee tee3 = new CustomTee();
        CustomTee tee4 = new CustomTee();
        Scanner in = new Scanner(System.in);
        //shirt 1
        System.out.println("Enter order num of shirt 1:");
        ord1=in.nextInt();
        tee1.setOrderNumber(ord1);
        System.out.println("Enter size of shirt 1:");
        size1=in.next();
        tee1.setSize(size1);
        System.out.println("Enter colour of shirt 1:");
        colour1=in.next();
        tee1.setColor(colour1);
        //shirt 2
        System.out.println("Enter order num of shirt 2:");
        ord2=in.nextInt();
        tee2.setOrderNumber(ord2);
        System.out.println("Enter size of shirt 2:");
        size2=in.next();
        tee2.setSize(size2);
        System.out.println("Enter colour of shirt 2:");
        colour2=in.next();
        tee2.setColor(colour2);
        //shirt 3
        System.out.println("Enter order num of shirt 3:");
        ord3=in.nextInt();
        tee3.setOrderNumber(ord3);
        System.out.println("Enter size of shirt 3:");
        size3=in.next();
        tee3.setSize(size3);
        System.out.println("Enter colour of shirt 3:");
        colour3=in.next();
        tee3.setColor(colour3);
        System.out.println("Enter slogan of shirt 3:");
        int spare;
        in.nextLine();
        slogan1=in.nextLine();
        tee3.setSlogan(slogan1);
        //shirt 4
        System.out.println("Enter order num of shirt 4:");
        ord4=in.nextInt();
        tee4.setOrderNumber(ord4);
        System.out.println("Enter size of shirt 4:");
        size4=in.next();
        tee4.setSize(size4);
        System.out.println("Enter colour of shirt 4:");
        colour4=in.next();
        tee4.setColor(colour3);
        System.out.println("Enter slogan of shirt 4:");
        in.nextLine();
        slogan2=in.nextLine();
        tee4.setSlogan(slogan2);
        display(tee1);
        display(tee2);
        displayCustomData(tee3);
        displayCustomData(tee4);
    }

    public static void display(TeeShirt tee) {
        System.out.println("Order #" + tee.getOrderNumber());
        System.out.println(" Description: " + tee.getSize() +" " + tee.getColor());
        System.out.println(" Price: $" + tee.getPrice());
    }

    public static void displayCustomData(CustomTee tee) {
        display(tee);
        System.out.println(" Slogan: " + tee.getSlogan());
    }
}