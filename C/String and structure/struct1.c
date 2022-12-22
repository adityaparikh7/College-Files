#include<stdio.h>

struct book
{
int bookid;
char bookname[20];
char author[20];
float price;
int year;
int pages;
char publisher[25];
};
struct book b1, b2, b3;
 main()
{
struct book b1;

printf("Enter the Book Id: ");
scanf("%d", &b1.bookid);
printf("Enter the Book Name: ");
scanf("%s", b1.bookname);
printf("Enter the Author Name: ");
scanf("%s", b1.author);
printf("Enter the Price: ");
scanf("%f", &b1.price);
printf("Enter the Year: ");
scanf("%d", &b1.year);
printf("Enter the Total No. of Pages: ");
scanf("%d", &b1.pages);
printf("Enter the Publisher Name: ");
scanf("%s", b1.publisher);
printf("%d %s %d %f %d %d %s", b1.bookid, b1.bookname,
b1.author, b1.price, b1.year, b1.pages, b1.publisher);

}

