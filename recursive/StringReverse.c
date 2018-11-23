#include <stdio.h>
//105中山大學資料結構
void reverse(char *s)
{
    if(*s)
    {
        reverse(s+1);
        printf("%c",*s);
    }
}


int main()
{
    char *a="hello";
    reverse(a);
    return 0;
}
