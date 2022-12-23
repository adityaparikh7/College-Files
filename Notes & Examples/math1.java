import java.util.*;
 class math1
{
   public static void main(String args[])
   {
      float a;
     Scanner s1=new Scanner(System.in);
      System.out.println("Enter a number whose square root you want to find out");
     a=s1.nextFloat();
      double x=Math.sqrt(a);
     System.out.println("Square root is:"+x);
 
    }
}