#include <iostream>
using namespace std;

struct node{
    int data;
    struct node *left,*right;
} n1,n2,n3,n4,n5,n6,n7;

int flag=0,sum=0;

void foo1(struct node *p)
{
    struct node *t;
    if(p!=NULL)
    {
        t=p->left;
        p->left=p->right;
        foo1(p->left);
        foo1(p->right);
    }
}

void foo2(struct node *p)
{
    if(p!=NULL)
    {
        foo2(p->left);
        foo2(p->right);
        if(flag%2==0) sum+=p->data;
    }
    flag++;
}


int main()
{
    n1.data=6; n2.data=10; n3.data=1; n4.data=8; 
    n5.data=12; n6.data=14; n7.data=4;
    
    n1.left=&n2; n1.right=&n3;
    n2.left=&n4; n2.right=&n5;
    n3.left=&n6; n3.right=&n7;
    n4.left=n4.right=NULL;
    n5.left=n5.right=NULL;
    n6.left=n6.right=NULL;
    n7.left=n7.right=NULL;
    
    foo1(&n1);
    foo2(&n1);
    cout<<sum;
}
