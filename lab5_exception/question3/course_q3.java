public class course_q3 {
    public String department;
    public int courseNumber;
    public double credits;

public course_q3(String department, int CourseNumber, double credits) throws courseexception_q3
{
    if(department.length()!=3 || (courseNumber<=100 && courseNumber>=499) || (credits<0.5) || (credits>6))
    {
        try
        {
            throw new courseexception_q3(department,courseNumber,credits);
        }
    catch(courseexception_q3 ex)
    {
    }
    }
    else
    {
        System.out.println("Course created successfully");
        System.out.println("Department: "+department+ "\nCourseNumber: "+courseNumber+"\nCredits: "+credits);
    }
    this.department=department;
    this.courseNumber= CourseNumber;
    this.credits=credits;
    }
}