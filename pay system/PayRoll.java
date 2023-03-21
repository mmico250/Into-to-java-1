public class PayRoll
{
    private ElectronicPaycheck [] payroll ; 
    private int capacity;
    private int load;
    
    
    public PayRoll()
    {
       capacity = 2;
       load = 0;
       payroll = new ElectronicPaycheck [capacity];
    }
    
    public void inserts (ElectronicPaycheck paycheck)
    {
       if (load == capacity)
       {
         capacity = capacity * 10;
         ElectronicPaycheck [] myTempPayroll = new ElectronicPaycheck [capacity];
         
         for ( int i = 0 ; i < load; i++ )
         {
            myTempPayroll[i] = payroll[i] ;
         }
         payroll = myTempPayroll;
       }
       
       payroll [load] = paycheck;
       load++;
       
       sort();
    }
    
    private void sort()
    {
       for (int i=0; i<load; i++)
       {
          for ( int j = 0; j < (load-1-i); j++ )
          {
             if ( (payroll [j].compareTo( payroll[j+1])) == -1 )
             {
                ElectronicPaycheck temp = payroll [j];
                payroll[j] = payroll[j+1];
                payroll[j+1] = temp;
             }
          }
       }
    }
}