#include<stdio.h>
#include<math.h>


int main()
{
 float p, R, r, emi;
 int n;

 printf("Enter principal amount: ");
 scanf("%f", &p);
 printf("Enter annual interest rate: ");
 scanf("%f", &R);
 printf("Enter number of months: ");
 scanf("%d", &n);

 r = R/(12*100);

 emi = p * r * pow(1+r,n)/(pow(1+r,n)-1);

 printf("Monthly EMI: %0.2f", emi);

 return 0;
}