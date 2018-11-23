#include <stdio.h>
int BS(int *a,int k,int l,int u);
int BS_rec(int *a,int k,int l,int u);

int main()
{
    int a[]= {22,55,5,4,88,9,75,3};
	int n=sizeof(a)/sizeof(a[0]);
	int l=0,u=n-1;
	int k=9;
    
    printf("%d\n",BS(a,k,l,u));
    printf("%d",BS_rec(a,k,l,u));
    return 0;
}
//iterative
int BS(int *a,int k,int l,int u)
{
    while(l<u){
        int mid=(l+u)/2;
        if(k<a[mid])
        {
            u=mid-1;
        }
        else if(k>a[mid])
        {
            l=mid+1;
        }
        else return mid;
    }
    return -1;
}
//recursive
int BS_rec(int *a,int k,int l,int u)
{
    if(l<u){
        int mid=(l+u)/2;
        if(k<a[mid])
          return BS_rec(a,k,l,mid-1);
        else if(k>a[mid])
          return BS_rec(a,k,mid+1,u);
        else return mid;  
    }
    return -1;
}



