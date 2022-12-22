
#include<stdio.h>

void main()
{
char str1[20], str2[20];
int res;

printf("Enter First String:");
scanf("%s",str1);
printf("Enter Second String:");
scanf("%s",str2);
strcpy(str1,str2);
printf("First String is:%s",str1);
printf("Second String is:%s",str2);

}

