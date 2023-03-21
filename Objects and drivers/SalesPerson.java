public class SalesPerson
{
    private String person;
    private Product p1;
    public SalesPerson(String person)
    {
        this.person=person;
        p1=new Product("cake",5);
    }
    
    public void sellCakes(int sold)
    {
       
        p1.removeQuantity(sold);
    }
    
    public void buyCakes(int bought)
    {
       
        p1.addQuantity(bought);
    }
    
    public String toString()
    {
        return person + " has " + p1.getQuantity()+ " cakes";
    }
}