#include<stdio.h>

void main()
{
char str1[20], str2[20];
int res;

printf("Enter First String:");
scanf("%s",str1);
printf("Enter Second String:");
scanf("%s",str2);
res = strcmp(str1,str2);
printf("Compare String Result is:%d",res);

}
