// public class rectangle
// {  
//     float length;
//     float breadth;
//     void get.data(float a , float b)
//     {
//         length=a;
//         breadth=b;
//     }
// }  
// public class rectarea
// {
//     public static void main(String args[]) 
//     {
//         float area;
//         Rectangle rect1 = new rectangle();
//         rect1.get.data(10,20);
//         area=rect1.length*rect1.breadth;
//         System.out.println("Area is= "+area);
//     }
// }

import java.util.Scanner;
class arearec 
{
   public static void main (String[] args)
   {
	   Scanner scanner = new Scanner(System.in);
	   System.out.println("Enter the length of Rectangle:");
	   double length = scanner.nextDouble();
	   System.out.println("Enter the width of Rectangle:");
	   double width = scanner.nextDouble();
	   double area = length*width;
	   System.out.println("Area of Rectangle is: "+area);
   }
}

