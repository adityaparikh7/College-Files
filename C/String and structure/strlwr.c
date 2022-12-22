#include<stdio.h>

void main()
{
char str[20];

printf("Enter String:");
gets(str);
printf("Lowercase String : %s", strlwr(str));

}
