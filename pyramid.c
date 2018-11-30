#include <stdio.h>
//105成大
int main()
{
    int n=3;
    for(int i=1;i<=3;i++)
    {
        for(int j=1;j<=n-i;j++)
            printf(" ");
        for(int k=1;k<=2*i-1;k++)
            printf("*");
        printf("\n");
    }

    return 0;
}
