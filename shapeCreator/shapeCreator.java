import java.util.Scanner;
import java.lang.String;
public class shapeCreator
{
    public static void main(String[] args)
    {
        String space=" ";
        Scanner input=new Scanner(System.in);
        int stars=20;
        int spaces=0;
        for(int i=0;i<20;i++)
        {
            for(int j=0;j<spaces;j++)
            {
                System.out.printf(" "); 
            }
            for(int k=0;k<stars;k++)
            {
                System.out.printf("*"); 
            }
            System.out.printf("\n");
            spaces++;
            stars--;
        }    
    }
}
