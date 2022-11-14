import java.util.*;
public class Main {
    public static void main(String[] args) {
        OuterClass myOuter =new OuterClass();
        OuterClass.InnerClass myInner = myOuter.new InnerClass();
        System.out.println(myInner.myInnerMethod());
    }
}
