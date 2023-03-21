import java.util.Random;
import java.lang.Math;
public class math
{   
    enum week{MONDAY,TUESDAY,WEDNESDAY}
    public static void main(String[]args)
    {
        //double num=90;
        //System.out.println(Math.cos(num));
        week day;
        day=week.MONDAY;
        //System.out.println(day);
        Random generator=new Random();
        int x=generator.nextInt(2)+1;
        System.out.println(x);
        String answer;
        switch (x)
        {
            case 1:
                answer="first";
                break;
            default:
                answer="second";
        }
        System.out.println(answer);
        
    }
}