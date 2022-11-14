package DA1.question3;
public class ranklistthread extends Thread{
    public void run(){
        int v=8,c=4;
        ranklist r= new ranklist(v,c);
        r.getranklist();        
        r.calc();
    }
}