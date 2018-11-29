#include <iostream>
using namespace std;
//Linked list��@ 107��j
struct node
{
    int data;
    struct node *next;
} n1,n2,n3,n4,n5,*f;

//��j�p
void foo1(struct node *p)
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

//�����C
void foo2(struct node *p)
{
    struct node *q,*r;
    if(p==NULL) return;
    q=p->next; p->next=NULL;
    for(;q!=NULL;p=q,q=r)
    {
        r=q->next;
        q->next=p;
    }
    f=p;
}

//��C�ۥ[
int bar(struct node *p)
{
    int flag,sum;
    for(flag=0,sum=0;p!=NULL;p=p->next,flag++)
    //���flag���_��
    if(flag&1==1) sum+=p->data;
    return sum;
}

//�L�X��C
void bar2(struct node *p)
{
    while(p!=NULL)
    {
        cout<<p->data<<" ";
        p=p->next;
    }
}

int main()
{
    f=&n1;
   n1.data=6; n2.data=3; n3.data=8; n4.data=10; n5.data=1;
   n1.next=&n2; n2.next=&n3; n3.next=&n4; n4.next=&n5; n5.next=NULL;
   foo1(f);
   bar2(f);
   cout<<"\n";
   foo2(f);
   bar2(f);
   cout<<"\n";
   cout<<bar(f);
   return 0;
}
