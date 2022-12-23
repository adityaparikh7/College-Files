// package exp 2;
import java.util.*;
public class series 
{
    static double sum(int n)
    {
      double i, s = 0.0;
      for (i = 1; i <= n; i++)
          s = s + 1/i;
      return s;
    }
    public static void main(String args[])
    {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of n: ");
        n = sc.nextInt();
        System.out.printf("Sum is %f", sum(n));
         
    }    
}  
