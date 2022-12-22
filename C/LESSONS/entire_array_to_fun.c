//passing entire array to function
# include<stdio.h>

int main (void)
{
    int c[] = {10,20}, sum;

    int addition(int a[]);

    sum = addition(c);
   printf("\n\n%d", sum);
   return 0;
}

int addition(int a[])
{
    int sum = 0, i;

    printf("\nwe r in fun addition of array elements");


    for(i = 0; i<2; i++)
        sum = sum+a[i];


    return sum;
}


/*
for 2D array--

    fun(array_name);

    void fun(int a[2][2])

{
}

*/
