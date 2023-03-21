 
 

import edu.princeton.cs.algs4.*;
import java.io.*;
import java.awt.Color;
import java.awt.Color.*;

/* Please hack up this class to make your solution for Program 1 */

public class P1 {

   // bad definition of green, needs improvement
   static boolean isGreen(Color c) {
      return c.getGreen() > c.getRed() + c.getBlue();
   }

   
   public static void main(String [] args) {
      Picture pix = new Picture("/home/owen/Downloads/somepix.png");
      Picture pix1 = new Picture(pix);  // copy with transparency problem fixed
      // you can get things from pix, but only change pix1
      
      // how many pixels have a fair bit of green?
      int ymax = pix.height();
      int xmax = pix.width();
      int ctr = 0;
      
      for (int i=0; i < ymax; ++i)
         for (int j=0; j < xmax; ++j) {
            Color c = pix.get(j,i);
            if (isGreen(c)) {  // not shown function I made
               ctr++;
               pix1.set(j,i,Color.GREEN); // standardize it
            }
         }
      
      System.out.println("green pixel count is "+ctr);
      
      pix1.show(); // reveal what I did
   
      System.out.println("press enter to continue, and if that does not work, use Ctrl-C");
      try {
         System.in.read();
      } catch (Exception e) {};
      
   }
}