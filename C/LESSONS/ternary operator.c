#include <stdio.h>

int main()
{
    int a, b, c, d;

    printf("Enter 3 numbers\n");
    scanf("%d", &a);
    scanf("%d", &b);
    scanf("%d", &c);

    d = (a>b) ? ((a>c) ? a:c) : ((b>c) ? b:c);

    printf("the greatest no is %d", d);
    
    return 0;
}