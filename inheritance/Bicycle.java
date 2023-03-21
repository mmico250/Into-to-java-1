
public class Bicycle extends TwoWheelDrive
{
    protected double height ;
    protected double radius;

    /**
     * Constructor for objects of class Bicycle
     */
    public Bicycle(double height, double radius,double distance, double weight, String ... color)
    {
        super(distance, weight, color);
        this.height = height;
        this.radius = radius;
    }
    
    public String toString()
    {
        return super.toString() + " with " + height + " cm " + " and  radius " + radius + "cm";
    }
    
    public double getHeight()
    {
        return height;
    }
    
    public double getRadius()
    { 
        return radius;
    }
    
    
    public boolean equals(Bicycle a)
    {        
        
        if ( a.getHeight() == height) 
            return true;
         else
         return false;
    }       
    
    public int compareTo(Bicycle a)
    {
        if (a.getRadius() > radius)
            return 1;
            
        if (a.getRadius() < radius)
            return -1;
        else 
            return 0;
    }
}
