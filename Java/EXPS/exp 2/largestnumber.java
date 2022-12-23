import java.util.*;
public class largestnumber 
{
    public static void main(String args []) 
    {
        int n1,n2,n3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 3 numbers: ");
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        n3 = sc.nextInt();

        {
            if (n1 >= n2 && n1 >= n3)
                System.out.println(n1 + " is the largest number");
            else if (n2 >= n1 && n2 >= n3)
                System.out.println(n2 + " is the largest number");
            else if (n3 > n1 && n3 > n2)
                System.out.println(n3 + " is the largest number");
            else if (n1 == n2 && n2 == n3)
                System.out.println("The numbers are the same");
        }
    }
}
 