#include<stdio.h>

void main()
{
char str[20];
int strlength;

printf("Enter String:");
gets(str);
strlength=strlen(str);
printf("Given String Length Is: %d", strlength);

}
