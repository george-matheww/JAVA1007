import java.util.*;
public class vowelS_q1 {
    public static void main(String[] args) {
        String sentence;
        Scanner in=new Scanner(System.in);
        sentence = in.nextLine();
        int counter=0;
        int l=sentence.length();
        for(int i=0;i<l;i++){
            char ch=sentence.charAt(i);
            if ((ch == 'a')||(ch == 'e')||(ch == 'i')||(ch=='o')||(ch=='u')||(ch == 'A')||(ch == 'E')||(ch == 'I')||(ch=='O')||(ch=='U')){
                counter+=1;
            }
        }
        System.out.println("The total number of vowels is:"+ counter);
    }
}
