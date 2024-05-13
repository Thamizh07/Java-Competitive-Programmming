import java.util.*;
class node{
    int data;
    node next;
    node pre;
}
class CircularDoubleLinkedlist{
    node head;
    Scanner sc=new Scanner(System.in);
    void Create(){
        node temp;
        head=new node();
        System.out.print("Enter the head Node value: ");
        head.data=sc.nextInt();
        head.next=null;
        head.pre=null;
        temp=head;
        System.out.print("Enter the node Length: ");
        int n=sc.nextInt();
        for(int i=2;i<=n;i++){
        node newnode=new node();
        System.out.print("\nEnter the node values:"+i+"-> ");
        newnode.data=sc.nextInt();
        newnode.pre=temp;
        temp.next=newnode;
        temp=temp.next;
        }
        temp.next=head;
        head.pre=temp;
    }
    void display(){
        node temp=head;
        do{
            System.out.println(temp.data);
            temp=temp.next;
        }while(temp!=head);
    }
    void insert(){
        node newnode=new node();
        node temp =head;
        System.out.println("Enter the position");
        int pos=sc.nextInt();
        System.out.println("Enter the node value");
        newnode.data=sc.nextInt();
        if (pos==1){
            while(temp.next!=head){
                temp=temp.next;
            }
            temp.next=newnode;
            newnode.pre=temp;
            newnode.next=head;
            head.pre=newnode;
            head=newnode;
        }
        else{
            for(int i=1;i<pos-1;i++){
                temp=temp.next;
            }
            newnode.next=temp.next.next;
            temp.next.pre=newnode;
            temp.next=newnode;
            newnode.pre=temp;
        }
    }
    void delete(){
        node temp=head;
        System.out.println("Enter the position:");
        int pos=sc.nextInt();
        if(pos==1){
            while(temp.next!=head){
                temp=temp.next;
            }
            temp.next=head.next;
            head.next.pre=temp;
            head=head.next;
        }
        else{
            for(int i=1;i<pos-1;i++){
                temp=temp.next;
            }
            temp.next=temp.next.next;
            temp.next.pre=temp;
        }
    }
}
public class circulardoublelinkedlist{
    public static void main (String[] args) {
        CircularDoubleLinkedlist CD=new CircularDoubleLinkedlist();
        CD.Create();
        CD.display();
        System.out.println("\n");
        CD.insert();
        CD.display();
        System.out.println("\n");
        CD.delete();
        CD.display();
    }
}