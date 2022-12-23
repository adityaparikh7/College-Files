import java.util.*;
class postlab2 
{
    public static void main(String args[])
    {
        int i,j,n;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter Limit: ");
        n = s.nextInt();
        int a[][]=new int[n][];
        for(i=0;i<a.length;i++)
            {
                a[i]=new int[i+1];
                for(j=0;j<a[i].length;j++)
                {
                    System.out.println("Enter integer for ("+(i+1)+","+(j+1)+"): ");
                    a[i][j]=s.nextInt();
                }
            }
        System.out.println("Contents of 2D Jagged Array");
        for (i=0; i<a.length; i++)
            {
                for (j=0; j< a[i].length; j++)
                {
                    System.out.print(a[i][j]+" ");
                }
                System.out.println(" ");
            }
    }
}