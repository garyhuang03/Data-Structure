#include <stdio.h>
//105���s�j�Ǹ�Ƶ��c
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
