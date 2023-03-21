import java.util.Scanner;
public class ArrayTester
{
    public static void main (String[] args)
    {
        int N;
        Scanner input=new Scanner(System.in);
        System.out.printf("how many number do you wish to enter==>");
        N=input.nextInt();
        int[] numbers=new int[N];
        for (int i=0;i<N;i++)
        {
            System.out.printf("please enter number %d ==>",i);
            numbers[i]=input.nextInt();
        }
        
        System.out.println("printing your array:");
        for (int i=0;i<numbers.length;i++)
        {
            System.out.println(numbers[i]);            
        }
    }
}
