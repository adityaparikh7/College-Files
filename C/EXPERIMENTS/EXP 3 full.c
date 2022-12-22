#include <stdio.h>
#include <stdlib.h>

int main()
{
    int ch, n1 = 0, n2 = 1, n3, i, n, sum = 0, r, temp;
    printf("1.Palindrome\n");
    printf("2.Sum of Fibonacci\n");
    printf("3.Sum of number between 100 and 200 divisible by 3 and 5\n");
    printf("Enter your choice=");
    scanf("%d", &ch);
    switch (ch)
    {
    case 1:
        printf("Welcome to case 1\n");
        int n, r, sum = 0, temp;
        printf("enter the number=");
        scanf("%d", &n);
        temp = n;
        while (n > 0)
        {
            r = n % 10;
            sum = (sum * 10) + r;
            n = n / 10;
        }
        if (temp == sum)
            printf("palindrome number ");
        else
            printf("not palindrome");
        break;

    case 2:
        printf("Welcome to case2\n");
        printf("Enter the number of elements:");
        scanf("%d", &n);
        printf("\n%d %d", n1, n2);
        for (i = 2; i < n; ++i)
        {
            n3 = n1 + n2;
            printf(" %d", n3);
            n1 = n2;
            n2 = n3;
        }
        break;

    case 3:
        printf("Welcome to case3\n");
        printf("Numbers between 100 and 200, divisible by 3 and 5 : \n");
        sum=0;
        for (i = 100; i < 200; i++)
        {
            if (i % 3 == 0 && i % 5 == 0)
            {
                printf("%5d", i);
                sum += i;
            }
        }
        printf("\n\nThe sum : %d \n", sum);

        break;

    default:
        printf("Wrong choice");
    }
}