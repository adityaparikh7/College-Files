//exp 2 of oopml

import java.util.*;
public class myMath
{
    
    static float power(float x, int n)
    {
        // if (n != 0) 
        // {
        //     return (x * power(x, n - 1));
        // }
        //   else 
        //   {
        //     return 1;
        //   }
        float z =1;
        for (int i =0; i<n; i++)
        {
            z *= x;
        }
        return z;
    }
    static int factorial(int x)
    {
        int z=1;
        for(int i=x; i>0; i--)
        {
            z*=i;
        }
        return z;
    }

    static float exponential(float x,int n)
    {
        float z = 0;
        for (int i = 0; i <= n; i++ )
            z += power(x, i)/ factorial(i);
  
        return z;
    }
    static float binomial(float x, int n)
    {
        int s = 1 , y = n;
        float sum=0;
        for (int i = 0; i<=n; i++)
        {
            sum += s*(power(x,i)/factorial(i));
            s *= y;
            y -= 1;
        }
        return sum;
    }

    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the base term: ");
        float x = sc.nextFloat();
        
        System.out.println("Enter the power: ");
        int n = sc.nextInt();
        
        float y = exponential(x,n);
        System.out.println("Exponential is: " +y);
        
        float b = binomial(x,n);
        System.out.println("Binomial is: " +b);
    
    }
}


