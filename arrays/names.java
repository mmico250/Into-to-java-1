import java.util.Scanner;
import java.lang.String; 
public class names
{
    public static void main(String args[]) 
    {
        int arraySize=1;
        Scanner input=new Scanner(System.in);
        String[] names=new String[15];
        int counter=1;
        String temp;
        for (int k=0;k<arraySize;k++)
        {
            if (arraySize<=15)
            {
                
            names=new String[arraySize];
            System.out.printf("please enter name %d ==>",counter);
            names[k]=input.nextLine();
            for (int i=0;i<names.length;i++)
            {                  
                for (int j=i+1;j<names.length;j++)
                {  
                    if (names[j].compareTo(names[i])<0)            
                    {
                        temp=names[i];
                        names[i]=names[j];
                        names[j]=temp;
                    }
                    
                }
                System.out.println(names[i]);           
            }      
            }
        }
    }
}
