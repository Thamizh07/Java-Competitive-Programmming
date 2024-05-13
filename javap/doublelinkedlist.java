import java.util.*;
class node{
    int data;
    node next;
    node pre;
}
class DoublelyLinkedlist{
    node head;
    public void Create(){
         Scanner sc=new Scanner(System.in); 
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
        newnode.next=null;
        newnode.pre=null;
        temp.next=newnode;
        newnode.pre=temp;
        temp=temp.next;
        }
    }
    void insbeg(int n){
         node temp=head;
        node newnode=new node();
        newnode.data=n;
        newnode.pre=null;
        newnode.next=temp;
        temp.pre=newnode;
        head=newnode;
    }
    public void insatpos(int n){
        node temp=head;
        node newnode=new node();
        int pos=3;
        for(int i=1;i<pos-1;i++)
        temp=temp.next;
        newnode.data=n;
        newnode.pre=null;
        newnode.next=null;
        newnode.next=temp.next;
        newnode.pre=temp;
        temp.next=newnode;
        newnode.next.pre=newnode;
        
    }
    public void insend(int n){
        node temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        node newnode=new node();
        newnode.data=n;
        newnode.pre=temp;
        newnode.next=null;
        temp.next=newnode;
        
    }
    public void delbeg(){
        node temp=head;
        
        head=head.next;
        head.pre=null;
        temp.next=null;
        temp=null;
    }
    public void delpos(){
        node temp=head;
        int pos=3;
        for(int i=1;i<pos-1;i++)
        temp=temp.next;
        
        temp.next=temp.next.next;
        temp.next.pre=null;
        temp.next.next.pre=temp;
    }
    public void delend(){
        node temp=head;
        while(temp.next.next!=null)     
        temp=temp.next;
        temp.next.pre=null;
        temp.next=null;
    }
    void display(){
                node temp=head;
        int k=0;
        while(temp!=null){
            k=k+1;
            System.out.print("\n This is "+ k +" Node value:");
        System.out.println(temp.data);
        temp=temp.next;
        }
    }
    }
public class doublelinkedlist{
    public static void main (String[] args) {
        DoublelyLinkedlist Dll=new DoublelyLinkedlist();
        Dll.Create();

       
        
    //     Dll.insbeg(45);
    //     Dll.insend(90);
        
    //   Dll.insatpos(39);
       // Dll.delbeg();
         Dll.delpos();
            Dll.delend();
       
               Dll.display();
    }
    
}  
