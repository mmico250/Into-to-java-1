
/**
 * do taxes given income.
 *
 * @Mico Mike
 * 27 oct 2020
 */
public class Income
{
    // instance variables - replace the example below with your own
    private double  grossEarning;
    private double netValue;
    private double taxFreeIncome=0;
    private double taxRate;
    private double NBtaxRate;
    private double taxableFees;
    private double fedTax;
    private double NBtaxFee;
    private double totalTax;
    /**
     * Constructor for objects of class Income
     */
    public Income(double gross)
    {
        // initialise instance variables
        grossEarning=gross;
        if (gross<=12069.0)
            taxableFees=0;
        else
            taxFreeIncome=12069;
        
        return;
    }
    public double spouseDeduction(double spouse)
    {
        // put your code here
        if (spouse<=12069.0)
        {
            double diff=12069.0-spouse;
            taxFreeIncome=taxFreeIncome+diff;
            taxableFees=grossEarning-taxFreeIncome;
        }
        if (spouse>12069)
            taxFreeIncome=taxFreeIncome;
        
        return taxFreeIncome ;
    }
    public double childDeduction(int child)
    {
        // put your code here
        double childDiff=child*2000;
        
        
        if (grossEarning<12069)
            taxableFees=0;
        if (child==0)
            taxableFees=0;
        taxFreeIncome=taxFreeIncome+childDiff;
        taxableFees=grossEarning-taxFreeIncome;
        return child;
    }
    public double calcFedTax()
    {
        // put your code here
        if (grossEarning<=47360.0)
            taxRate=0.15;
        if ((grossEarning>47360.0) && (grossEarning<=95259.0))
            taxRate=0.205;
        if ((grossEarning>95259.0) && (grossEarning<=147667.0))
            taxRate=0.26;
        if ((grossEarning>147667.0) && (grossEarning<=210371.0))
            taxRate=0.29;
        if (grossEarning>210371.0)
            taxRate=0.33;
        fedTax=taxRate*taxableFees;
        
        return fedTax;
    }
    public double calcNBTax()
    {
        // put your code here
        if (taxableFees<=42592.0)
            NBtaxRate=0.0968;
        if ((taxableFees>42592.0) && (taxableFees<=85184.0))
            NBtaxRate=0.1482;
        if ((taxableFees>85184.0) && (taxableFees<=138491.0))
            NBtaxRate=0.1652;
        if ((taxableFees>138491.0) && (taxableFees<=157778.0))
            NBtaxRate=0.1784;
        if (taxableFees>157778.0)
            NBtaxRate=0.20;
        NBtaxFee=NBtaxRate*taxableFees;
       
        return NBtaxFee;
    }
    public double calcTax()
    {
        // put your code here
        totalTax=NBtaxFee+fedTax;
        return totalTax;
    }
    public double calcNet()
    {
        // put your code here
        netValue=grossEarning-totalTax;
        return netValue;
    }
    public String toString()
    {
       //put your code here
     
       if (taxableFees<0)
            taxableFees=0;
       if (fedTax<0)
            fedTax=0;
       if (NBtaxFee<0)
            NBtaxFee=0;
       if (totalTax<0)
            totalTax=0;
       if (taxableFees==0)
            netValue=grossEarning;
       return ("taxfreeincome="+ taxFreeIncome+ " taxable fees="+ taxableFees 
       + "fedTax="+fedTax+" NBtax="+NBtaxFee+" total tax="+totalTax+ " net="+ netValue);
    }
}
