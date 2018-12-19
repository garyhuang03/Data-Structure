
#include <iostream>
using namespace std;
//107交大
struct node
{
    int data;
    struct node *next;
} n1,n2,n3,n4,n5,*f;

//比大小
void compare(struct node *p)
{
    for(;p!=NULL && p->next!=NULL;p=p->next)
    {
        if (p->data > p->next->data)
        {
            int temp=p->data;
            p->data=p->next->data;
            p->next->data=temp;
        }
    }
}

//反轉串列
void invert(struct node *s)
{
    
    if(s!=NULL)
    {
        struct node *q=NULL,*r,*p=s;
        while(p!=NULL)
        {
        r=q;
        q=p;
        p=p->next;
        q->next=r;
        }
         f=q;
    }
}
//串列相加
int sum(struct node *p)
{
    int sum;
    for(sum=0;p!=NULL;p=p->next)
    sum+=p->data;
    return sum;
}

//印出串列
void print(struct node *p)
{
    while(p!=NULL)
    {
        cout<<p->data<<" ";
        p=p->next;
    }
}

int main()
{  //6 3 8 10 1
    f=&n1;
   n1.data=6; n2.data=3; n3.data=8; n4.data=10; n5.data=1;
   n1.next=&n2; n2.next=&n3; n3.next=&n4; n4.next=&n5; n5.next=NULL;
   
   compare(f);
   print(f);//印出:3 6 8 1 10 
   cout<<"\n";
   
   invert(f);
   print(f);//印出:10 1 8 6 3 
   cout<<"\n";
   
   cout<<sum(f);//印出:28
   return 0;
}



