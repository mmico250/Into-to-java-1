import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;  



public class House extends Key
{
   protected int roomID;
   protected String furniture;
   protected DateTimeFormatter dtf;
   protected LocalDateTime now;
   public String info;

    

   public House(String name, int studNum, int keyId,double money,int roomID, String furniture)
   {
      super( name,studNum, keyId,money);
      this.furniture = furniture;
      this.roomID = roomID;
      
   }
   
   
   public String HouseHistory()
   {
      dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
      now = LocalDateTime.now();
      return  "Student entered " + roomID + "and  used " + furniture + "at "  + "\n" + dtf.format(now);
   
      
   }
   
   public String toString()
   {
      return super.toString();
   }
   
}