#include<stdio.h>
#include<stdlib.h>

int main(void)
{
    int *a[10], i,n;

    printf("\nenter n");
    scanf("%d", &n);

    for(i=0;i<n;i++)
    {

        a[i] = (int *)malloc(sizeof(int));
        scanf("%d",a[i]);
       /* printf("\n%u", a[i]);
        printf("\n%u", &a[i]); */


    }
    for(i=0;i<n;i++)
    {


        printf("\n%d",*a[i]);
    }

    free(a[1]);

    for(i=1;i<n-1;i++)
    {

        a[i] = a[i+1];

    }
     for(i=0;i<n-1;i++)
    {


        printf("\n%d",*a[i]);
    }

}
