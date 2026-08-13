#include <stdio.h>
#include <stdlib.h>
struct node{
    int data;
    struct node* nextl
};
void Reverse(struct node * head){
    struct node * temp,prev = NULL,*next_node:
    if(head==NULL){
        printf("Empty List!");
    }
    else{
        temp = head;
        while(temp!=NULL){
            next_node = temp->next;
            temp->next = prev;
            prev=  temp;
            temp = next_node;
        }
    }
    printf("Reversed Linked list\n");
    while(prev!=NULL){
        printf("%d -> "prev->data);
        prev = prev->next;
    }
    printf("NULL");
}
int main(){
    int ele,i,n;
    struct node * head = NULL;
    printf("Enter no of nodes:");
    scanf("%d",&n);
    for(i=0;i<n;i++){
        struct node * newnode = (struct node* )malloc(sizeof(struct node));
        printf("Enter element part of the node:");
        scanf("%d",&ele);
        newnode->data = ele;
        newnode ->next = head;
        head = newnode;
    }
    Reverse(head);
    return 0;
}