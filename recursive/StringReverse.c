#include <stdio.h>
//105,107中山大學
int reverse(int n)
{
    if(n>0)
    {
        int a=n%10;
        printf("%d",a);
        return reverse(n/10);
    }
}

int reverse_char(char*s)
{
    if(*s)
    {
        reverse_char(s+1);
        printf("%c",*s);
    }
}

int main()
{
   int a=9876;
   char s[]="abcd";
   reverse(a);
   printf("\n");
   reverse_char(s);
    return 0;
}
