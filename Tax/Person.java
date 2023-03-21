
/**
 * use the income object to do this persons taxes.
 *
 * @Mike Mico
 * 27 oct 2020
 */
import java.util.Scanner;
public class Person
{
    // instance variables - replace the example below with your own
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        Income person;
        //prompt input of gross earning
        System.out.println("Enter gross earning");
        double earn=input.nextDouble();
        if (earn>12069)
        {
            person=new Income(earn);
            //ask if married
            System.out.println("Are you married?reply true for yes and false for no");
            boolean married=input.nextBoolean();
            if (married==true)
            {
                System.out.println("enter spouse salary");
                double spouseSalary=input.nextDouble();
                person.spouseDeduction(spouseSalary);
            }
            if (married==false)
            {
                double spouseSalary=0;
            }    
            
            //ask number of children person has
            System.out.println("how many children under 16 do you have?");
            int childNum=input.nextInt();    
            person.childDeduction(childNum);
            person.calcFedTax();
            person.calcNBTax();
            person.calcTax();
            person.calcNet();
            System.out.println(person.toString());
        } 
        else
            System.out.println("no taxes are applied ");
    }
}
