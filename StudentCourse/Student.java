
/**
 * student object
 *
 * @Mico Mike
 * 14/11/2020
 */
public class Student
{
    // instance variables - replace the example below with your own
    private String name;
    private int studentNum;
    private int courseCount=6;
    private Course class1,class2,class3,class4,class5,class6;
    /**
     * Constructor for objects of class Student
     */
    public Student(String name,int studentNum,int courseCount,
    Course class1,Course class2,Course class3,Course class4,
    Course class5,Course class6)
    {
        // initialise instance variables
        this.name=name;
        this.studentNum=studentNum;
        this.courseCount=courseCount;
        this.class1=class1;
        this.class2=class2;
        this.class3=class3;
        this.class4=class4;
        this.class5=class5;
        this.class6=class6;
        ;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int setCount(int count)
    {
        courseCount=count;
        return courseCount;
    }
    public int getCount()
    {
        return courseCount;
    }
    
      public String toString()
    {
        // put your code here
        System.out.println("name is "+name);
        System.out.println("student number is "+studentNum);
        System.out.println("number of courses are "+courseCount);
        if (courseCount==1)
        {
            System.out.println(class1.toString());
        }
        if (courseCount==2)
        {
            System.out.println(class1.toString());
            System.out.println(class2.toString());
        }
        if (courseCount==3)
        {
            System.out.println(class1.toString());
            System.out.println(class2.toString());
            System.out.println(class3.toString());
        }
        if (courseCount==4)
        {
            System.out.println(class1.toString());
            System.out.println(class2.toString());
            System.out.println(class3.toString());
            System.out.println(class4.toString());
        }
        if (courseCount==5)
        {
            System.out.println(class1.toString());
            System.out.println(class2.toString());
            System.out.println(class3.toString());
            System.out.println(class4.toString());
            System.out.println(class5.toString());
        }
        if (courseCount==6)
        {
            System.out.println(class1.toString());
            System.out.println(class2.toString());
            System.out.println(class3.toString());
            System.out.println(class4.toString());
            System.out.println(class5.toString());
            System.out.println(class6.toString());
        }
        return("") ;
    }
     public String compareTo(Student stdnt)
    {
        // put your code here
        if (stdnt.getCount()==6)
            System.out.println("maximum valid courses");
        return("") ;
    }
}
