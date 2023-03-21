public class gradeDriver
{
    public static void main (String[]args)
    {
        
        Grade[] grades=new Grade[5];
        grades[0]=new Grade("a",95);
        grades[1]=new Grade("b",85);
        grades[2]=new Grade("c",75);
        grades[3]=new Grade("d",65);
        grades[4]=new Grade("e",55);
        
        for(int i=0;i<grades.length;i++)
            System.out.println(grades[i].toString());
    }
}