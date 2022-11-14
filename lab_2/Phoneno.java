import java.util.*;
public class Phoneno{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String phone;
        int check=0;
        phone = sc.nextLine();
        while (check == 0){
            if (phone.length()==10 || phone.equals("999")== true){
                break;
            }
            System.out.println("ReEnter number:");
            phone = sc.nextLine();
        }
        if (phone.equals("999")== false){
            String newnum="(";
            for (int i=0;i<3;i++){
                newnum= newnum + phone.charAt(i);
            }
            newnum=newnum + ") ";
            for (int i=3;i<6;i++){
                newnum= newnum + phone.charAt(i);
            }
            newnum=newnum+"-";
            for (int i=6;i<10;i++){
                newnum= newnum + phone.charAt(i);
            }
            System.out.println(newnum);
        }
        else{
            System.out.println("999 entered");
        }
    }
}