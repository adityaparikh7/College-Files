
#include <stdio.h>
#include <stdlib.h>

int main() {
  int n, i, *ptr, *ptr1, sum = 0, n2, n3;

  printf("Enter number of elements: ");
  scanf("%d", &n);

  ptr = (int*) malloc(n * sizeof(int));

  ptr1 = (int*) calloc(n, sizeof(int));


  // if memory cannot be allocated
  if(ptr == NULL) {
    printf("Error! memory not allocated.");
    exit(0);
  }

  printf("Enter elements for ptr: ");
  for(i = 0; i < n; ++i) {
    scanf("%d", ptr + i); // scanf("%d", &a);

  }

  printf("\n\n");

   for(i = 0; i < n; ++i) {
    printf("\n%d", *(ptr + i));

  }

 printf("\n\n%d", *(ptr1+0));


  printf("\n\n\nEnter elements for ptr1 for calloc: ");
  for(i = 0; i < n; ++i) {
    scanf("%d", ptr1 + i);

  }


  printf("\n\n");

   for(i = 0; i < n; ++i) {
    printf("\n%d", *(ptr1 + i));

  }



  // deallocating the memory
  free(ptr);

  return 0;
}
