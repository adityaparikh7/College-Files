#include <stdio.h>

void main()
{
   int i, sum=0;
   printf("Numbers between 100 and 200, divisible by 9 : \n");
   for(i=101;i<200;i++)
   {
     if(i%3==0 && i%5==0)
     {
       printf("% 5d",i);
       sum+=i;
     }
   }
   printf("\n\nThe sum : %d \n",sum);
}
