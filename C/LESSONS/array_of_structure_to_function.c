
#include<stdio.h>
#include<string.h>
struct student
{
    int roll;
    char name[10];
}s1[2];


int main (void)
{
    void fun(struct student []);

    s1[0].roll = 101;

    strcpy(s1[0].name,"abc");

    s1[1].roll = 102;

    fun(s1);

    return 0;
}

void fun(struct student s2[2])
{

    printf("\n\nroll no is %d", s2[0].roll);

    printf("\n\nname is %s", s2[0].name);

    printf("\n\nroll no is %d", s2[1].roll);

}
