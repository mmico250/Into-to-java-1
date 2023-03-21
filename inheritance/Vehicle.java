 
public class Vehicle
{    
    protected String[] color;
    protected double distance;
    protected double weight;   

    /**
     * Constructor for objects of class Vehicle
     */
    public Vehicle(double distance, double weight, String ... color)
    {
        this.color = color;
        this.distance = distance;
        this.weight = weight;
    }
    
    public String toString()
    {
        String result= " ";
        
        for (int i = 0; i < color.length; i++)
        {
            result  += color[i] + ",";
        }
        return result;
       
    }
    
    public double getWeight()
    {
        return weight;
    }
    
    public boolean equals(Vehicle a)
    {        
        
        if ( a.getWeight() == weight) 
            return true;
         else
         return false;
    }       
    
    public double getDistance()
    {
        return distance;
    }               
    
    public int compareTo(Vehicle a)
    {
        if (a.getDistance() > distance)
            return 1;
            
        if (a.getDistance() < distance)
            return -1;
        else 
            return 0;
    }
}
