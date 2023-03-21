public class ElectronicPaycheck
{
   private String name;
   private int day, month, year;
   private double payAmount;
   private int accountNum;
   
   public ElectronicPaycheck(String name, int day, int month, int year, double payAmount, int accountNum)
   {
      this.name = name;
      this.day = day;
      this.month = month;
      this.year = year;
      this.payAmount = payAmount;
      this.accountNum = accountNum;
   }
   
   public String toString()
   {
      return name + "\n" + day + "\n" + month + "\n" + year + "\n" + payAmount + "\n" + accountNum + "\n";
   }
   
   public int compareTo(ElectronicPaycheck otherCheck)
   {
     if (payAmount > otherCheck.getPayAmount())
     {
       return 1;
     }
     else if (payAmount < otherCheck.getPayAmount())
     {
       return -1;
     }
     else
     {
       return 0 ;
     }  
   }
   
   public double getPayAmount()
   {
      return payAmount;
   }
}