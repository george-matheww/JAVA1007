import java.util.*;
public class Main {
    public static void main(String[] args) {
        Outer_Demo outer= new Outer_Demo();
        Outer_Demo.Inner_Demo inner= outer.new Inner_Demo();
        System.out.println(inner.getNum());
    }
}
