#include <stdio.h>

int main(void)
{
    float length, width, radius, side, base, height, area;
//rectangle
    printf("\nenter length =");
    scanf("%f",&length);
    printf("\nenter width =");
    scanf("%f",&width);
    area = length * width;
    printf("\narea of rectangle is = %0.2f", area);

//square
    printf("\nenter side =");
    scanf("%f",&side);
    area = side * side;
    printf("\narea of square is = %0.2f", area);

//circle
    printf("\nenter radius =");
    scanf("%f",&radius);
    area = 3.14 * radius *radius;
    printf("\narea of circle is = %0.2f", area);

//triangle
    printf("\nenter base = ");
    scanf("%f",&base);
    printf("\nenter height =");
    scanf("%f",&height);
    area = (base * height)/2;
    printf("\narea of triangle is = %0.2f", area);

    return 0;
}
