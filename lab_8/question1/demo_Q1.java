import java.util.*;
public class demo_Q1 {
    public static void main(String[] args) {
        ArrayList <q1> ss = new ArrayList<q1>();
        Scanner sc=new Scanner(System.in);
        int l=0;
        while(l==0){
            System.out.println("Enter 1 to stop");
            int ll=sc.nextInt();
            if(ll==1){
                break;
            }
            else{
                System.out.println("Select 1 to add a record, Select 2 to delete record, Select 3 to modify the record");
                int s=sc.nextInt();
                int c=0;
                if(s==1){
                    System.out.println("enter name:");
                    String p=sc.next();
                    for(q1 obj:ss){
                        if(p==obj.get_name()){
                            c++;
                        }
                    }
                    if(c==0){
                        double pp=sc.nextDouble();
                        q1 ppp=new q1(p,pp);
                        ss.add(ppp);
                    }
                    if(c>0){
                        System.out.println("Error this person already exist.....");
                    }
                }
                if(s==2){
                    String p=sc.next();
                    double pp=sc.nextDouble();
                    for(q1 obj:ss){
                        if(p==obj.get_name()){
                            ss.remove(obj);
                        }
                    }
                }
                if(s==3){
                    String p=sc.next();
                    for(q1 obj:ss){
                        if(p==obj.get_name()){
                            c++;
                        }
                    }
                    if(c==0){
                        System.out.println("Record does not exist");
                    }
                    if(c>0){
                        for(q1 obj:ss){
                            if(p==obj.get_name()){
                                System.out.println("Change the value to:");
                                double aa=sc.nextDouble();
                                obj.set_num(aa);
                            }  
                        }
                    }
                }
            }

        }
        for(q1 obj:ss){
            System.out.println(obj.get_name()+" has number "+obj.get_num());
        }
    }
}
