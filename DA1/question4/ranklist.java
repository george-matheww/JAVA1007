package DA1.question4;
import java.util.*;
import java.io.*;
public class ranklist implements Serializable {
    public ArrayList<ArrayList<Character>> rl= new ArrayList <>();
    ArrayList<Character> candidates=new ArrayList<>();
    Scanner in=new Scanner(System.in);
    public int v,c;
    public ranklist(int a, int b){
        v=a;
        c=b;
        for(int i=0; i < v; i++)
            rl.add(new ArrayList());
    }
    public void getranklist(){ // getting rank lists of all voters
        System.out.println("enter rank list:");
        for (int i=0;i<v;i++){
            for (int j=0;j<c;j++){
                rl.get(i).add(in.next().charAt(0));
            }
        }
    }
    public void calc(){
        candidates=rl.get(0);
        int maj=0;
        char m='z';
        while (maj<(c/2)){
            int count[]=new int[c];
            for (int i=0;i<c;i++)
                count[i]=0;
            for (int i=0;i<v;i++){
                    count[candidates.indexOf(rl.get(i).get(0))]++;
                }
            int min=1000;
            char mc='z';
            for (int i=0;i<c;i++){
                if (count[i]>(v/2)){
                    maj=count[i];
                    m=candidates.get(i);
                    break;
                }
                else{
                    if (count[i]<min){
                        min=count[i];
                        mc=candidates.get(i);
                    }
                }
            }
            if((Character)mc!='z')
            {
                candidates.remove((Character)mc);
                for (int i=0;i<v;i++)
                    rl.get(i).remove((Character)mc);
                c--;
            }
        }
        System.out.println("candidate that wins:"+m);
    }
}

