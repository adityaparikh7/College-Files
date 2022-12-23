import java.util.*;
public class postlab1 
{
    public static void main(String args[]) 
    {
        int i, j, c=4, d=3;
        Scanner sc = new Scanner(System.in);
        int a[][] = new int[3][];
        int b[][] = new int[2][0];
        for(i=0;i<a.length;i++)
        {
            {
                a[i]=new int[c];
                c = c - 1;
                for(j=0;j<a[i].length;j++)
                {
                    System.out.println("Enter integer for ("+(i+1)+","+(j+1)+") of 1st Array: ");
                    a[i][j]=sc.nextInt();
                }
            }   
        }
        for(i=0;i<b.length;i++)
        {
            b[i] = new int[d];
            d = d + 1;
            for(j=0;j<b.length;j++)
            {
                System.out.println("Enter integer for ("+(i+1)+","+(j+1)+") of 2nd Array: ");
                b[i][j]=sc.nextInt();
            }
        }
        System.out.println("Contents of 1st 2D Jagged Array");
        for (i=0; i<a.length; i++)
        {
            for (j=0; j< a[i].length; j++)
            {
            System.out.print(a[i][j]+" ");
            }
            System.out.println(" ");
        }
        System.out.println("Contents of 2nd 2D Jagged Array");
        for (i=0; i<b.length; i++)
            {
                for (j=0; j< b[i].length; j++)
                    {
                        System.out.print(b[i][j]+" ");
                    }
                    System.out.println(" ");
            }     
    }
}