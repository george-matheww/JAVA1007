package DA1.question4;
import java.io.*;
import java.util.*;
public class q4 {
    public static void main(String args[])throws Exception{
        int v=8;
        int c=4;
        ranklist r=new ranklist(v,c);
        r.getranklist();
        FileOutputStream fout=new FileOutputStream("C:\\Coding\\Java_1007\\DA1\\question4\\cat2file.txt"); 
        ObjectOutputStream out=new ObjectOutputStream(fout);
        out.writeObject(r.rl);
        System.out.println("serializing.... file created"); 
        ObjectInputStream in=new ObjectInputStream(new FileInputStream("C:\\Coding\\Java_1007\\DA1\\question4\\cat2file.txt"));
        System.out.println("deserializing.... reading from file"); 
        //ranklist r2=(ranklist)in.readObject();
        ranklist r2=new ranklist(v,c);
        r2.rl=(ArrayList<ArrayList<Character>>)in.readObject();
        r2.calc();
    }
}


