#include <iostream>
using namespace std;

struct node{
    int data;
    struct node *left,*right;
} n1,n2,n3,n4,n5,n6,n7;

void swap(struct node *p)
{
    struct node *t;
    if(p!=NULL)
    {
        t=p->left;
        p->left=p->right;
        p->right=t;
        swap(p->left);
        swap(p->right);
    }
}

void preorder(struct node *T)
{
    if(T!=NULL)
    {
        cout<<T->data<<" ";
        preorder(T->left);
        preorder(T->right);
    }
}

int main()
{
    /*         6
            /     \
           10      1      
          /  \    /  \     
         8   12  14  4       
    */
    n1.data=6; n2.data=10; n3.data=1; n4.data=8; 
    n5.data=12; n6.data=14; n7.data=4;
    
    n1.left=&n2; n1.right=&n3;
    n2.left=&n4; n2.right=&n5;
    n3.left=&n6; n3.right=&n7;
    n4.left=n4.right=NULL;
    n5.left=n5.right=NULL;
    n6.left=n6.right=NULL;
    n7.left=n7.right=NULL;
    
    swap(&n1);
    preorder(&n1);//用前序追蹤印出來
   
   return 0;
}
