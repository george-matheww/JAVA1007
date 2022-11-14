public class courseexception_q3 extends Exception {
    public courseexception_q3(String department,int courseNumber,double credits)
    {
        System.out.println("Object is not created Invalid details Department: "+department+"\nCourse no:"+courseNumber+"\nCredits: "+credits);
    }
}