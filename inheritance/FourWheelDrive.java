public class FourWheelDrive extends Vehicle
{
    protected final int wheel = 4;
    
   public FourWheelDrive( double distance, double weight, String ... color) 
   {
       super(distance, weight, color);
       
   }

   public String toString()
   { 
       return super.toString() + " with " + wheel + " wheel";
   }
}