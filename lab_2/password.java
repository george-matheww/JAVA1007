import java.util.Scanner;
public class password{
    public static void main(String[] args) {
        int valid=0;
        int uc,lc,d;
        String ps;
        Scanner in=new Scanner(System.in);
        ps=in.nextLine();
        while (valid==0){
            int n=ps.length();
            uc=0;
            lc=0;
            d=0;
            for (int i=0;i<n;i++){
                if (Character.isUpperCase(ps.charAt(i)))
                    uc++;
                else if (Character.isLowerCase(ps.charAt(i)))
                    lc++;
                else if (Character.isDigit(ps.charAt(i)))
                    d++;
            }
            if (uc>1 && lc>2 && d>0)
            {
                valid=1;
                System.out.println("valid password");}
            else{
                if (uc<2)
                    System.out.println("The number of uppercase characters is less than 2");
                if (lc<3)
                    System.out.println("The number of lowercase characters is less than 3");
                if (d<1)
                    System.out.println("The number of digits is less than 1");
                System.out.println("invalid password\n enter valid password:");
                ps=in.nextLine();
            }
        }
    }
}