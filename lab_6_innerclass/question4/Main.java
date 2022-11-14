import java.util.*;
public class Main {
    static int data=30;
    static class Inner{
        static void msg(){
            System.out.println("data is "+data);
        }
    }
    public static void main(String[] args) {
        Main.Inner.msg();
    }
}
