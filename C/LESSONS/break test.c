// Program to calculate the multiple of maximum of positive 10 numbers
// Calculates multiple until user enters negative number

#include <stdio.h>
int main ()
{
  int i;
  double number, multi = 1;	//declare number of double type to store high precision values 
  for (i = 1; i <= 10; ++i) {
      printf ("Enter a n%d: ", i);
      scanf ("%lf", &number);	// %lf is used for double data type

    // If user enters negative number, loop is terminated
    if (number < 0.0)		// as soon as user enters the negative number,
	{			// the loop will terminate and prints the multiples till last positive number 
	  break;
	}

      multi *= number;		// multi = multi * number;
  }

  printf ("multi = %lf", multi);

  return 0;
}
