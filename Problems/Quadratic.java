package Problems;
import java.util.*;

class RootException extends Exception
{
    RootException(){}
    @Override
    public String toString()
    {
        return "Root is imaginary";
    }
}

public class Quadratic 
{

    public static void root(int a, int b, int c) throws Exception
    {
        int d = b*b - 4*a*c;
        if(d<0)
        {
            throw new RootException();
        }
        else
        {
            double root1 = (-b + Math.sqrt(b*b - 4*a*c))/(2*a);
            double root2 = (-b - Math.sqrt(b*b - 4*a*c))/(2*a);
            System.out.println("Root 1: " + root1);
            System.out.println("Root 2: " + root2);
        }
    }
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = sc.nextInt();
        System.out.println("Enter b: ");
        int b = sc.nextInt();
        System.out.println("Enter c: ");
        int c = sc.nextInt();
        try
        {
            root(a,b,c);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        sc.close();
    }
}
