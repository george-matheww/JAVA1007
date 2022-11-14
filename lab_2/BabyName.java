import java.util.*;
public class BabyName{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] names= new String[3];
        for (int i=0;i<3;i++){
            System.out.println("Enter String "+(i+1)+":");
            names[i]=sc.nextLine();
        }
        for (int i=0;i<3;i++){
            System.out.println(names[i]);
        }
        System.out.println("The combinations are:");
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                System.out.println(names[i]+" "+names[j]);
            }
        }
    }
}

