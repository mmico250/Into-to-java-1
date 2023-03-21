import java.io.File; 
import java.util.Scanner; 
public class readFile
{
    public static void main(String[]args)throws Exception
    {
        File file=new File("C:\\Users\\micof\\Desktop\\matrix.txt");
        Scanner read=new Scanner(file);
        Scanner read1=new Scanner(file);
        int numLines;       
        String[] lines=new String[6];
        lines[0]=read.nextLine();
        lines[1]=read.nextLine();
        int row=0;
        int column=0;
        row=Integer.parseInt(lines[0]);
        column=Integer.parseInt(lines[1]);
        numLines=(row*column)+2;
        lines=new String[numLines];
        int i=0;
        for(int l=0;l<numLines;l++)
        {
            lines[l]=read.nextLine();
            
        }  
        int j=2;
        int increment=0;
        for(int k=0;i<row;)
        {
            
            for(j=0;j<j+column;j++)
            {
                increment=2;
                System.out.printf(lines[j+increment]+(" "));
            }
            System.out.printf("\n");
            increment=increment+column;
        }
       
    }
}