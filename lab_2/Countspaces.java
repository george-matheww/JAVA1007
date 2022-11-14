import java.util.*;
public class Countspaces{
    public static void main(String args[])
    {
        String str="Kailash is very nice";
        int l=str.length();
        int spacecount=0;
        for(int i=0;i<l;i++)
        {
            char ch=str.charAt(i);
            if(ch==' ')
            {
                spacecount++;
                
            }
        }
        System.out.println("Spacecount: "+spacecount);
    }
}
