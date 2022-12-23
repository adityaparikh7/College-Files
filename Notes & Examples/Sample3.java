
import java.util.*;
class Sample3 
{
    public static void main(String[] args) 
{        
        int result,number;
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter the number");
        number=s1.nextInt();
        result = abc.factorial(number);
        System.out.println(number + " factorial = " + result);
    }
}
class abc
{
    static int factorial( int n ) 
      {
        if (n != 0)  
            return n * factorial(n-1); 
        else
            return 1;
    }
}
