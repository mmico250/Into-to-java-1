/**
*function for the halloween problem
@ Mico Mike
@september 24,2020
*/
public class halloweenproblem
{
   public static void main(String[] args)
   {
      int AG;
      int CG;
      int SBL;
      int ABL;
      int CBL;
      int numGreen;
      int numBlue;
      int numCandy;
      int numPeople;
      int brown;
      int candy;
      candy=5;
      brown=1;
      AG=5;
      CG=2;
      SBL=3;
      ABL=4;
      CBL=1;
      numGreen=AG+(CG*AG);
      numBlue=(2*SBL)+(2*SBL*ABL)+(SBL*ABL*CBL);
      numPeople=numGreen+numBlue+brown;
      numCandy=candy*numPeople;
      System.out.println("Emelius Brown will have to buy "+numCandy+" candys");
   }
}
      
