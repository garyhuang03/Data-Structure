#include <stdio.h>
void multiplication(int a[][2],int b[][2],int n)
{
    
    int c[n][n];
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            c[i][j]=0;
            for(int k=0;k<n;k++){
                c[i][j]=c[i][j]+a[i][k]*b[k][j];
            }
        }
    }
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
           printf("%d",c[i][j]);
            printf(" ");
        }
       printf("\n");
    }
}

int main()
{
    int n=2;
    int a[2][2]={1,2,3,4};
    int b[2][2]={1,2,3,4};
    multiplication(a,b,n);
    return 0;
}
