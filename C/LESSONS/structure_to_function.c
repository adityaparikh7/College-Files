
#include<stdio.h>
#include<string.h>
struct student
{
    int roll;
    char name[10];
}s1;


int main (void)
{
    void fun(struct student);

    s1.roll = 101;

    strcpy(s1.name,"abc");

    fun(s1);

    return 0;
}

void fun(struct student s2)
{

    printf("\n\nroll no is %d", s2.roll);

    printf("\n\nname is %s", s2.name);
}
