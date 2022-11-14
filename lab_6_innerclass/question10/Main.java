import java.util.*;
public class Main {
    static Bus busobj = new Bus(){
        void show(){
            System.out.println("I am in Bus Enginer class");
        }
    };
    public static void main(String[] args) {
        busobj.show();
    }
}
