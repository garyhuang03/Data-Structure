#include <iostream>
using namespace std;

struct node{
    int data;
    struct node *left,*right;
} n1,n2,n3,n4,n5,n6,n7;

void kthlarge(struct node *s,int k,int &c)
{   
    if(s==NULL || c>k) return;
    kthlarge(s->right,k,c);
    c++;
    if(c==k)
    {
        cout<<k<<"th large is:"<<s->data;
    }
    kthlarge(s->left,k,c);
}


int main()
{
    /*         6
            /     \
           4      10      
          /  \    /  \     
         3   5  8     11    
    */
    n1.data=6; n2.data=4; n3.data=10; n4.data=3; 
    n5.data=5; n6.data=8; n7.data=11;
    
    n1.left=&n2; n1.right=&n3;
    n2.left=&n4; n2.right=&n5;
    n3.left=&n6; n3.right=&n7;
    n4.left=n4.right=NULL;
    n5.left=n5.right=NULL;
    n6.left=n6.right=NULL;
    n7.left=n7.right=NULL;
    
    int c=0,k=3;
    kthlarge(&n1,k,c);
    return 0;
}
