

public class Car extends FourWheelDrive
{
    protected String brand;
    protected double gasRating;
    
    
    public Car(String brand, double gasRating, double distance, double weight, String ... color)
    {
        super(distance, weight, color);
        this.brand = brand;
        this.gasRating = gasRating;
    }

    public String toString()
    {
        return super.toString() + " of a " + brand + " with " + gasRating + " Km/L";
    }
    
    public double setGasRating(double kM, double liT)
    {
       gasRating = kM/liT;
       
       return gasRating;
    }
}
