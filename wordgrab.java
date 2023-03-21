/*

*/
import java.util.Scanner;
public class wordgrab
{
   public static void main(String[] args)
   {
      Scanner input=new Scanner(System.in);
      System.out.println("name");
      String name=input.nextLine();
      System.out.println(name);
      name=name.concat(" mico");
      System.out.println(name);
      System.out.println(name.indexOf("ke"));
   }
}
