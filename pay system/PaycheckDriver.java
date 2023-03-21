public class PaycheckDriver
{
  public static void main ( String [] args )
  {
     ElectronicPaycheck person1 = new ElectronicPaycheck("First First", 27, 11, 2020, 12345.67, 98765);
     ElectronicPaycheck person2 = new ElectronicPaycheck("second second", 27, 11, 2020, 5, 43210);
     ElectronicPaycheck person3 = new ElectronicPaycheck("third third", 27, 11, 2020, 11111.11, 12345);
     ElectronicPaycheck person4 = new ElectronicPaycheck("fourth fourth", 27, 11, 2020, 2222.22, 11222);
     ElectronicPaycheck person5 = new ElectronicPaycheck("fifth fifth", 27, 11, 2020, 5555.55, 45454);
     
     PayRoll payroll1 = new PayRoll ();
     
     
     payroll1.inserts(person1);
     payroll1.inserts(person2);
     payroll1.inserts(person3);
     payroll1.inserts(person4);
     payroll1.inserts(person5);
     
     System.out.println(person1);
     double [] list = (payroll1.getPaymentAmount());
     
     for (int r = 0; r < list.length; r++)
    {
        System.out.println(list[r]);
     }
     
     

     /*System.out.println(person2);
     System.out.println(person3);
     System.out.println(person4);
     System.out.println(person5);
     */
  }
}