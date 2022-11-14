import java.util.Scanner;
public class Countspaces2{
    public static void main(String args[])
    {
        String str;
        System.out.println("Enter string:");
        Scanner SC= new Scanner(System.in);
        str=SC.nextLine();
        int l=str.length();
        int spacecount=0;
        for(int i=0;i<l;i++)
        {
            char ch=str.charAt(i);
            if(ch==' '){
                spacecount++;
                
            }
        }
        System.out.println("Spacecount: "+spacecount);
    }
}