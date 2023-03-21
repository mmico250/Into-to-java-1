
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;  


public class Student
{
    
     /*Instance Variable*/
   protected String name;
   protected int studNum;
   protected DateTimeFormatter dtf;
   protected LocalDateTime now;
     
  
     
     /*Constructor*/
   public Student(String name, int studNum)
   {
      this.name = name;
      this.studNum = studNum;
      
      dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
      now = LocalDateTime.now();
      System.out.print("Student information was created at   ");
      System.out.println(dtf.format(now));
   }
     
     
    /*Method to get student Name*/
   public String getStudentName()
   {
      return name;
   }
    
     
     /*Method to get Student Number*/
   public int getStudentNum()
   {
      return studNum;
   }
     
     
   public String dateCreated()
   {
      return dtf.format(now);
   }
     
     /*Method to Print Student Info*/
   public String toString()
   {
      return name + "\n" + studNum + dtf.format(now) ;
   }
     
     
     
    
    /*Method to compare student number*/
   private String compareTo(Student a , Student b)
   {
      if (a.getStudentNum() == b.getStudentNum())
      {
         return "Check your student number";
      }
       
      else
      {
         return "no similarities";
      }
   }

     
      
     
     
     
}