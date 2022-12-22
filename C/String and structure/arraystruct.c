#include<stdio.h>

struct book
{
int bookid;
char bookname[20];
char author[20];
};
 struct book b1[5];
main()
{
int i;

for (i=0;i<5;i++)
{
printf("Enter the Book Id: ");
scanf("%d", &b1[i].bookid);
printf("Enter the Book Name: ");
scanf("%s", b1[i].bookname);
printf("Enter the Author Name: ");
scanf("%s", b1[i].author);
}
for (i=0;i<5;i++)
{
printf("%d \t %s \t %s \n", b1[i].bookid, b1[i].bookname,b1[i].author);
}

}

