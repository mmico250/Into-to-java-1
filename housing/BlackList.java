public class BlackList extends House

{

   public BlackList(String name, int studNum, int keyId,double money,int roomID, String furniture)
   {
      super(name, studNum,  keyId,money,roomID,furniture);
   
   }

   public String toString()
   {
      return super.toString() + " has been blackListed";
   }
}
