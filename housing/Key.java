import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;  

public class Key extends Student
{
   protected int keyId;
   protected DateTimeFormatter dtf;
   protected LocalDateTime now;
   protected double money;
   protected String name;
  
  
   public Key(String name, int studNum, int keyId,double money)
   {
      super(name,studNum);
   
      this.keyId = keyId;
      this.money = money;
      this.name = name;
      this.studNum = studNum;
       
      dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
      now = LocalDateTime.now();
      System.out.print("Key information was created at   ");
      System.out.println(dtf.format(now));
   
   }

  
   public int getKeyId()
   {
      return keyId;
   }
  
   public double getBalance()
   {
      return money;
   }
   
   public  double setBalance(double cash)
   {
      return money  = cash;
   }
   
   
   public String toString()
   {
      return "\n" + super.getStudentNum()  + "\n"  + keyId + "\n" + "Current balance => " + money; 
   }
   
   public void Terminate()
   {
      dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
      now = LocalDateTime.now();
      System.out.print("Terminated at   ");
      System.out.println(dtf.format(now));
   
   
   }
   
}