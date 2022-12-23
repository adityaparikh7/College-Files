// program to initialize and print array
// public class arraytest 
// {
//     // int x[][] = {{0,1,2,3,4},{0,1,2},{0,1,2,3}};
//     // System.out.println(x.length);
//     // System.out.println(x[0].length);
//     // System.out.println(x[1].length);
//     // System.out.println(x[2].length);

//      public static void main(String args[])
//     {  
//     //     int a[]=new int[5];  
//     //     a[0]=10; 
//     //     a[1]=20;  
//     //     a[2]=30;  
//     //     a[3]=40;  
//     //     a[4]=50;   
//     //     for(int i=0;i<a.length;i++) 
//     //     System.out.println(a[i]);  

//     }

// }

// Program to demonstrate 2-D jagged array in Java with sum
public class arraytest {
    public static void main(String args[]) 
    {

        int arr[][] = new int[3][4];
        arr[0] = new int[3];
        arr[1] = new int[3];
        arr[2] = new int[3];

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = count++;
            }
        }

        System.out.println("Contents of 2D Jagged Array");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++)
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++)
        {
        for (int j = 0; j < arr[i].length; j++)
        sum = sum + arr[i][j];
        }
        System.out.println("Sum of all the elements of an array: " + sum);
        arr = resize(arr,5,6);
        for (int i = 0; i < arr.length; i++) 
        {
            for (int j = 0; j < arr[i].length; j++)
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }
       
        
    }
    static int[][] resize(int a[][],int x, int y)
    {
        int t[][]=new int [x][y];
        for (int i = 0; i < a.length; i++)
        {
            for (int j = 0; j < a[0].length; j++)
            {
                t[i][j] = a[i][j];
            }
        }
        return t;
    }
}
