public class driver
{
    public static void main(String[]args)
    {
        /*
        SalesPerson person=new SalesPerson("Mico");
        person.buyCakes(3);
        person.sellCakes(4);
        System.out.println(person.toString());
        */
        SalesPerson person1=new SalesPerson("Bob");
        SalesPerson person2=new SalesPerson("Mary");
        person1.sellCakes(2);
        person2.buyCakes(2);
        System.out.printf(person1.toString()+ "\n"+ person2.toString());
    }
}