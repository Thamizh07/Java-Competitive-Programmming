import java.util.*;
class node{
    int data;
    node next;
}
class CircularSingle {
    node head;
      Scanner sc=new Scanner(System.in);
    void Create(){
        
        
        node temp;
        head=new node();
        System.out.print("Enter the head Node value: ");
        head.data=sc.nextInt();
        head.next=null;
        temp=head;
        System.out.print("Enter the node Length: ");
        int n=sc.nextInt();
        for(int i=2;i<=n;i++){
        node newnode=new node();
        System.out.print("\nEnter the node values:"+i+"-> ");
        newnode.data=sc.nextInt();
        newnode.next=null;
        temp.next=newnode;
        temp=temp.next;
        }
        temp.next=head;
        
    }
    void display(){
        node temp=head;
       do{
            System.out.println(temp.data);
            temp=temp.next;
        } while(temp!=head);
    }
    void inspos(){
        node temp=head;
        int pos =sc.nextInt();
        node newnode=new node();
        newnode.data=sc.nextInt();
        if(pos!=1)
        {
            
            for(int i=1;i<pos-1;i++)
            {
                temp=temp.next;
            }
            newnode.next=temp.next;
            temp.next=newnode;
        }
        else{
            while(temp.next!=head)
            {
                temp=temp.next;
            }
            temp.next=newnode;
            newnode.next=head;
            head=newnode;
        }
    }
    void delpos(){
        node temp=head;
        int pos=sc.nextInt();
        if(pos!=1)
        {
            for(int i=1;i<pos-1;i++)
            {
                temp=temp.next;
            }
            temp.next=temp.next.next;
        }
        else{
            while(temp.next!=head)
            temp=temp.next;
            head=head.next;
            temp.next=head;
            
        }
    }
}  
public class circularsinglelinkedlist3{
    public static void main (String[] args) {
        CircularSingle CS=new CircularSingle();
        CS.Create();
        CS.display();
        System.out.print("Insercet");
        CS.inspos();
         CS.display();
         System.out.print("deletion");
         CS.delpos();
         CS.display();
    }
}
