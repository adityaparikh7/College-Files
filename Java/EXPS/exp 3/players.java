import java.util.*;
public class players 
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);
        int i, j, n, matches, runs;
        float avg;
        System.out.println("Enter the number of players: ");
        n = sc.nextInt();
        int arr[][] = new int[n][];

        for(i=0;i<n;i++)
        {
            runs = 0;
            System.out.println("Enter number of matches played: "+ (i+1));
            matches = sc.nextInt();
            arr[i] = new int[matches+1];
            System.out.println("Enter number of runs scored in" +matches+ "matches");
            for(j=0;j<arr[i].length-1;j++) 
            {
                arr[i][j]=sc.nextInt();
                runs=runs+arr[i][j];
            }
            avg=(float)runs/matches;
            arr[i][matches]=Math.round(avg);
        }

        System.out.println("The average is(last column): ");//last column will show the average runs scored
        for(i=0;i<n;i++)
        {
            System.out.println("Player" +(i+1) +"\t");
            for(j=0;j<arr[i].length;j++) 
            {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }
}