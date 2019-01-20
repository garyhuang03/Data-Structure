#include <stdio.h>
void store(int a[][2],int n)
{
    
    int c[n*n]; int k=0;
    for(int i=0;i<n;i++)
        for(int j=0;j<n;j++){
            c[k]=a[i][j];
            k++;
        }
    
    
    for(int i=0;i<n*n;i++){
        printf("%d ",c[i]);
    }
}

int main()
{
    int n=2;
    int a[2][2]={1,2,3,4};
    
    store(a,n);
    return 0;
}
