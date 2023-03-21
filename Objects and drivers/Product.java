/* ************************************************************************
    Program:           LabDemo.java
    Course:            CS 1073 Fall 2020 UNB Saint John
    by:                Dr. Jeffrey M McNally
    Program Date:      September 18th, 2020
****************************************************************************
   Purpose:            Practice in java
************************************************************************* 
*/
class Product
{

    // Instance DAta which will define the object when created
    private String name;
    private int quantityLeft;   
   
    // Constructor uses to create (Instantiate) the object whenever we want one
    // it  takes in two parameters from the call
    public Product(String theName, int theQuantity)
    {
            name = theName;
            quantityLeft = theQuantity;
    }

    public int getQuantity(){return quantityLeft;}
    // mutator method   
    public void addQuantity(int toAdd)
    {
            quantityLeft = quantityLeft + toAdd;
    }
   

    // mutator method   
    public void removeQuantity(int toRemove)
    {
            quantityLeft = quantityLeft - toRemove;
    }
   
    // the toString method is AUTOMATICALLY called any time an
    // object of this call type is uses where a sting is expected such as 
    // in System.out.printf()
    public String toString()
    {
            return quantityLeft + " " + name;
    }
}
