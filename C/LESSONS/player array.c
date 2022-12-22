#include<stdio.h>
#include<stdlib.h>

struct players array
{
    char name[10];
    int m, r, w;
    double bowl_avg;
}player[10];

int main(void)
{
    int i,n;
    printf("Number of players=\n");
    scanf("%d",&n);
    printf("Player info\n");
    for(i=0;i<n;i++)
    {
        printf("\nP_Name is: ");
        scanf("%s",&b[i].name);
        printf("\nNum_Matches is: ");
        scanf("%d",&b[i].m);
        printf("\nNum_Wickets is: ");
        scanf("%d",&b[i].w);
        printf("\nNum_Runs is: ");
        scanf("%d",&b[i].r);
    }
    for(int i=0;i<n;i++)
    {
        printf("\nP_Data is: %s %d %d %d %f",b[i].name,b[i].m,b[i].w,b[i].r,b[i].bowl_avg);
    }
}
