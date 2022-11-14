import java.util.*;
public class lab1{
   int eid;
   String bruh,name,Designation,Department;
   float Basic,da,hra,gross;
   float net_salary;
   void input(){
    System.out.println("Enter eid:");
    Scanner inp= new Scanner(System.in);
    eid=inp.nextInt();
    bruh=inp.nextLine();//spare to avoid error during inputs
    System.out.println("Enter name: ");
    name=inp.nextLine();
    System.out.println("Enter Designation: ");
    Designation=inp.nextLine();
    System.out.println("Enter Department: ");
    Department=inp.nextLine();
    System.out.println("Enter Basic: ");
    Basic=inp.nextInt();
    System.out.println("Enter DA: ");
    da=inp.nextInt();
    System.out.println("Enter HRA: ");
    hra=inp.nextInt();
   }
   void Display(){
    System.out.println("Name:"+name);
    System.out.println("Emp id:"+eid);
    System.out.println("Designation"+Designation);
    System.out.println("Department"+Department);
   }
   void calc(){
    gross=Basic+(float)((da/100)*Basic)+((hra/100)*Basic);
    System.out.println("The Gross Salary is:"+gross);
    System.out.print("The Net salary is:");
    if(gross>=0 && gross<=2500){
        System.out.println(gross);
    }
    else if(gross>2500 && gross<=5000){
        net_salary=gross - (float)(0.05*gross);
        System.out.println(net_salary);
    }
    else if(gross>5000 && gross<=7500){
        net_salary=gross - (float)(0.1*gross);
        System.out.println(net_salary);
    }
    else if(gross>7500 && gross<=10000){
        net_salary=gross - (float)(0.15*gross);
        System.out.println(net_salary);
    }
    else if(gross>10000 && gross<=12000){
        net_salary=gross - (float)(0.2*gross);
        System.out.println(net_salary);
    }
    else if(gross>12000 && gross<=15000){
        net_salary=gross - (float)(0.25*gross);
        System.out.println(net_salary);
    }
    else{
        net_salary=gross - (float)(0.3*gross);
        System.out.println(net_salary);
    }
   }
}


