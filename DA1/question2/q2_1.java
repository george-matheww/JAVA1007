import java.util.Scanner;
public class q2_1 {
    public static void main(String[] args){
        int id;
        Boolean cons;
        Scanner in=new Scanner(System.in);
        System.out.println("enter voterID:");
        id=in.nextInt();
        System.out.println("does voter belong to constituency:");
        cons=in.nextBoolean();
        voterchecking v= new voterchecking(id,cons);
    }
}
