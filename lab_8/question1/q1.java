import java.util.*;
public class q1 {
    Scanner sc=new Scanner(System.in);
    private String name;
    private double number;
    public q1(String n,double num){
        this.name=n;
        this.number=num;
    }
    public String get_name(){
        return name;
    }
    public double get_num(){
        return number;
    }
    public void set_name(String n){
        name=n;
    }
    public void set_num(double num){
        number=num;
    }
}
