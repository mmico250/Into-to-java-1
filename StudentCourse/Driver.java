
/**
 * driver to test objects student and course
 *
 * @Mico Mike
 * @14/11/2020
 */
import java.util.Scanner;
public class Driver
{
    public static void main(String[]args)
    {
        Scanner input=new Scanner(System.in);
        Course course1;
        Student stdnt1;
        String name;
        int stdntNum;
        int cc;
        Course c1,c2,c3,c4,c5,c6;
        c1=new Course("math","rebecca",3,"8am");
        c2=new Course("cs1","jeff",3,"9am");
        c3=new Course("cs2","jeff",3,"10am");
        c4=new Course("math2","rebecca",3,"11am");
        c5=new Course("math3","rebecca",3,"12pm");
        c6=new Course("chemistry","simon",3,"1pm");
        stdnt1=new Student("mike",3685120,6,c1,c2,c3,c4,c5,c6);
        String courseInfo;
        System.out.println("how many students information will you be entering?");
        int numStudents=input.nextInt();
        System.out.println("how many courses?");
        int numCourses=input.nextInt();
        stdnt1.setCount(numCourses);
        if (numCourses==1)
        {
            System.out.println("enter course name,instructor,daily time and credit hours. separate each with a space");
            courseInfo=input.nextLine();
            Scanner strScanner=new Scanner(courseInfo);
            while(strScanner.hasNext())
            {
               String word=strScanner.next();
               System.out.println(word);
            }
        }
        if (numCourses==2)
        {
             System.out.println("enter course name,instructor,daily time and credit hours. separate each with a space");
             courseInfo=input.nextLine();
             Scanner strScanner=new Scanner(courseInfo);
            while(strScanner.hasNext())
            {
                    String word=strScanner.next();
                    System.out.println(word);
            }
            System.out.println("enter 2nd course name,instructor,daily time and credit hours. separate each with a space");
            courseInfo=input.nextLine();
            strScanner=new Scanner(courseInfo);
            while(strScanner.hasNext())
              {
                  String word=strScanner.next();
                  System.out.println(word);
              }
        }
        if (numCourses==3)
        {
            System.out.println("enter course name,instructor,daily time and credit hours. separate each with a space");
            courseInfo=input.nextLine();
            Scanner strScanner=new Scanner(courseInfo);
            while(strScanner.hasNext())
            {
                String word=strScanner.next();
                System.out.println(word);
            }
            System.out.println("enter 2nd course name,instructor,daily time and credit hours. separate each with a space");
            courseInfo=input.nextLine();
            strScanner=new Scanner(courseInfo);
            while(strScanner.hasNext())
            {
                String word=strScanner.next();
                System.out.println(word);
            }
            System.out.println("enter 3rdcourse name,instructor,daily time and credit hours. separate each with a space");
            courseInfo=input.nextLine();
            strScanner=new Scanner(courseInfo);
            while(strScanner.hasNext())
            {
                    String word=strScanner.next();
                    System.out.println(word);
            }
            }
        if (numCourses==4)
        {
                System.out.println("enter course name,instructor,daily time and credit hours. separate each with a space");
                courseInfo=input.nextLine();
                Scanner strScanner=new Scanner(courseInfo);
                while(strScanner.hasNext())
                {
                    String word=strScanner.next();
                    System.out.println(word);
                }
                System.out.println("enter 2nd course name,instructor,daily time and credit hours. separate each with a space");
                courseInfo=input.nextLine();
                strScanner=new Scanner(courseInfo);
                while(strScanner.hasNext())
                {
                    String word=strScanner.next();
                    System.out.println(word);
                }
                System.out.println("enter 3rd course name,instructor,daily time and credit hours. separate each with a space");
                courseInfo=input.nextLine();
                strScanner=new Scanner(courseInfo);
                while(strScanner.hasNext())
                {
                    String word=strScanner.next();
                    System.out.println(word);
                }
                System.out.println("enter 4th course name,instructor,daily time and credit hours. separate each with a space");
                courseInfo=input.nextLine();
                strScanner=new Scanner(courseInfo);
                while(strScanner.hasNext())
                {
                    String word=strScanner.next();
                    System.out.println(word);
                }
         }
           
         if (numCourses==5)
         {
                System.out.println("enter course name,instructor,daily time and credit hours. separate each with a space");
                courseInfo=input.nextLine();
                Scanner strScanner=new Scanner(courseInfo);
                while(strScanner.hasNext())
                {
                    String word=strScanner.next();
                    System.out.println(word);
                }
                System.out.println("enter 2nd course name,instructor,daily time and credit hours. separate each with a space");
                courseInfo=input.nextLine();
                strScanner=new Scanner(courseInfo);
                while(strScanner.hasNext())
                {
                    String word=strScanner.next();
                    System.out.println(word);
                }
                System.out.println("enter 3rd course name,instructor,daily time and credit hours. separate each with a space");
                courseInfo=input.nextLine();
                strScanner=new Scanner(courseInfo);
                while(strScanner.hasNext())
                {
                    String word=strScanner.next();
                    System.out.println(word);
                }
                System.out.println("enter 4th course name,instructor,daily time and credit hours. separate each with a space");
                courseInfo=input.nextLine();
                strScanner=new Scanner(courseInfo);
                while(strScanner.hasNext())
                {
                    String word=strScanner.next();
                    System.out.println(word);
                }
                System.out.println("enter 5th course name,instructor,daily time and credit hours. separate each with a space");
                courseInfo=input.nextLine();
                strScanner=new Scanner(courseInfo);
                while(strScanner.hasNext())
                {
                    String word=strScanner.next();
                    System.out.println(word);
                }
         }
         if (numCourses==6)
         {
                System.out.println("enter course name,instructor,daily time and credit hours. separate each with a space");
                courseInfo=input.nextLine();
                Scanner strScanner=new Scanner(courseInfo);
                while(strScanner.hasNext())
                {
                    String word=strScanner.next();
                    System.out.println(word);
                }
                System.out.println("enter 2nd course name,instructor,daily time and credit hours. separate each with a space");
                courseInfo=input.nextLine();
                strScanner=new Scanner(courseInfo);
                while(strScanner.hasNext())
                {
                    String word=strScanner.next();
                    System.out.println(word);
                }
                System.out.println("enter 3rd course name,instructor,daily time and credit hours. separate each with a space");
                courseInfo=input.nextLine();
                strScanner=new Scanner(courseInfo);
                while(strScanner.hasNext())
                {
                    String word=strScanner.next();
                    System.out.println(word);
                }
                System.out.println("enter 4th course name,instructor,daily time and credit hours. separate each with a space");
                courseInfo=input.nextLine();
                strScanner=new Scanner(courseInfo);
                while(strScanner.hasNext())
                {
                    String word=strScanner.next();
                    System.out.println(word);
                }
                System.out.println("enter 5th course name,instructor,daily time and credit hours. separate each with a space");
                courseInfo=input.nextLine();
                strScanner=new Scanner(courseInfo);
                while(strScanner.hasNext())
                {
                    String word=strScanner.next();
                    System.out.println(word);
                }
                System.out.println("enter 6th course name,instructor,daily time and credit hours. separate each with a space");
                courseInfo=input.nextLine();
                strScanner=new Scanner(courseInfo);
                while(strScanner.hasNext())
                {
                    String word=strScanner.next();
                    System.out.println(word);
                }
         }
         System.out.println("organized print for student");
         System.out.println(stdnt1.toString());
    }
}
