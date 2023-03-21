
/**
 * course object.
 *
 * @Mico Mike
 * 14/11/2020
 */
public class Course
{
    // instance variables - replace the example below with your own
    private String courseName;
    private String Instructor;
    private int creditHours;
    private String courseDailyTime;

    /**
     * Constructor for objects of class Course
     */
    public Course(String courseName,String Instructor,
    int creditHours,String courseDailyTime)
    {
        // initialise instance variables
        this.courseName=courseName;
        this.Instructor=Instructor;
        this.creditHours=creditHours;
        this.courseDailyTime=courseDailyTime;
    }

    public int getHours()
    {
        return creditHours;
    }
    public String toString()
    {
        System.out.println("courseName is "+courseName);
        System.out.println("instructor name is "+Instructor);
        System.out.println("number of credit hours are"+creditHours);
        System.out.println("course daily time is "+courseDailyTime);
        return("");
    }
     public String compareTo(Course subject)
    {
        
        if (subject.getHours()>5)
            System.out.println("difficlt");
        if (subject.getHours()<2)
            System.out.println("easy"); 
        if ((subject.getHours()>=2)&&(subject.getHours()<=5))
            System.out.println("medium difficulty");
        return("") ;
    }
   
}
