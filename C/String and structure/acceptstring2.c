// With the new line character
#include<stdio.h>
void main ()
{
    char s[20];
    printf("Enter the string?");
    gets(s);
    //scanf("%[^\n]s",s);
    printf("You entered %s",s);
}
