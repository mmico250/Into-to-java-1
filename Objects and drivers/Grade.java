public class Grade
{
    private String letterGrade;
    private int mark;
    public Grade(String letterGrade,int mark)
    {
        this.letterGrade=letterGrade;
        this.mark=mark;
    }
    public String toString()
    {
        String result=letterGrade + " "+mark;
        
        return result;
    }
}