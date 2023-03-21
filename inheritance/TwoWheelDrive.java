
public class TwoWheelDrive extends Vehicle
{
    protected final int wheel = 2;
    
   public TwoWheelDrive( double distance, double weight, String ... color) 
   {
       super(distance, weight, color);
       
   }
   
   public String toString()
   { 
       return super.toString() + " with " + wheel + " wheel";
   }

    
}
