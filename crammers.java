/*
program to solve linear equations using crammers rule
by Mico Mike
4 oct 2020
*/
import java.util.Scanner;
import java.text.NumberFormat;
import java.text.DecimalFormat;

public class crammers
{
   public static void main(String[] args)
   {
      //declare variables
      int a11,a12,a13,b1;
      int a21,a22,a23,b2;
      int a31,a32,a33,b3;
      int c1,c2,c3;
      //prompt input
      Scanner input=new Scanner(System.in);
      System.out.println("input your values for a11,a12,a13,c1 respectively");
      a11=input.nextInt();
      a12=input.nextInt();
      a13=input.nextInt();
      c1=input.nextInt();
      System.out.println("the first equation is "+ a11 + "x+" + a12 + "y+" + a13 + "z=" + c1 );

      System.out.println("input your values for a21,a22,a23,c2 respectively");
      a21=input.nextInt();
      a22=input.nextInt();
      a23=input.nextInt();
      c2=input.nextInt();
      System.out.println("the second equation is "+ a21 + "x+" + a22 + "y+" + a23 + "z=" + c2 );
      
      System.out.println("input your values for a31,a32,a33,c3 respectively");
      a31=input.nextInt();
      a32=input.nextInt();
      a33=input.nextInt();
      c3=input.nextInt();
      System.out.println("the third equation is "+ a31 + "x+" + a32 + "y+" + a33 + "z=" + c3 );
      
      //method
      //calculating determinant
      int aa=a22*a33;
      int ab=a23*a32;
      int ac=aa-ab;
      int ad=a11*ac;
      int ba=a21*a33;
      int bb=a23*a31;
      int bc=ba-bb;
      int bd=a12*bc;
      int ca=a21*a32;
      int cb=a22*a31;
      int cc=ca-cb;
      int cd=a13*cc;
      int determinant=ad-bd+cd;
      //calculating dx
      int da=a22*a33;
      int db=a23*a32;
      int dc=da-db;
      int dd=c1*dc;
      int ea=c2*a33;
      int eb=a23*c3;
      int ec=ea-eb;
      int ed=a12*ec;
      int fa=c2*a32;
      int fb=a22*c3;
      int fc=fa-fb;
      int fd=a13*fc;
      int dx=dd-ed+fd;
      //calculating dy
      int ga=c2*a33;
      int gb=a23*c3;
      int gc=ga-gb;
      int gd=a11*gc;
      int ha=a21*a33;
      int hb=a23*a31;
      int hc=ha-hb;
      int hd=c1*hc;
      int ia=a21*c3;
      int ib=c2*a31;
      int ic=ia-ib;
      int id=a13*ic;
      int dy=gd-hd+id;
     
      //calculating dz
      int ja=a22*c3;
      int jb=c2*a32;
      int jc=ja-jb;
      int jd=a11*jc;
      int ka=a21*c3;
      int kb=c2*a31;
      int kc=ka-kb;
      int kd=a12*kc;
      int la=a21*a32;
      int lb=a22*a31;
      int lc=la-lb;
      int ld=c1*lc;
      int dz=jd-kd+ld;
      
      double x=dx/determinant;
      double y=dy/determinant;
      double z=dz/determinant;
      
      //output
      System.out.printf("x= %14.8f \n", x);
      System.out.printf("y= %14.8f \n", y);
      System.out.printf("z= %14.8f \n", z);
      
    }
}