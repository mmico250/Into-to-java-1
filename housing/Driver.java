import java.util.Scanner;
   
public class Driver
{
   public static void main(String[] args)
   {
     
      Scanner input = new Scanner(System.in);
   
      System.out.println("Enter your student name");
          
      input = new Scanner(System.in);
      String nName = input.nextLine();
          
      System.out.println("Enter your student Id");
      int nNumber = input.nextInt();
          
      Student student = new Student(nName, nNumber);
      System.out.println(student);
          
                    
      System.out.println("Enter your Key Id");
      int KeyId = input.nextInt();
          
      System.out.println("Enter your the amount you want");
      double amount = input.nextInt();
          
      Student key = new Key(nName, nNumber, KeyId, amount);
      System.out.println(key);
          
      System.out.println("Enter your room Id");
      int roomId = input.nextInt();
          
          
      System.out.println("Enter your furniture used");
      String furniture = input.nextLine();
      Student house = new House (nName,nNumber,KeyId,amount,roomId,furniture);
      System.out.println(house);
           
      Student blackList = new BlackList(nName,nNumber,KeyId,amount,roomId,furniture);
      System.out.println(blackList);
   
           
   
   
          
          
   
          
   
   }
}