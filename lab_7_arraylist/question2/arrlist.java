import java.util.ArrayList;
import java.util.Scanner;
public class arrlist {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<String> arr1 = new ArrayList<>();
        ArrayList<String> arr2 = new ArrayList<>();
        ArrayList<String> res = new ArrayList<>();
        String str;
        arr1.add("x");
        arr1.add("y");
        arr1.add("z");
        arr2.add("a");
        arr2.add("b");
        arr2.add("c");
        int l=3;
        for (int i=0; i<l; i++){
            if(i<3 && i<3) {
                res.add(arr1.get(i));
                res.add(arr2.get(i));
            }
            else if (i<3 && i>3) {
                res.add(arr1.get(i));
            }
            else {
                res.add(arr2.get(i));
            }
        }
        System.out.println(res);
    }
}