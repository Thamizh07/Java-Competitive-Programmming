import java.util.*;
public class linkedlist3
{
    public static void main(String[] args) 
    {
        SingleLinkedList sll = new SingleLinkedList();
        sll.createnew();
        sll.display();
    }
}
class node 
{
    int data;
    node next;
}
class SingleLinkedList 
{
    node head;
    public void createnew() 
    {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the number of elements (n): ");
        n = sc.nextInt();
        System.out.println("Enter " + n + " elements for the linked list:");
        for (int i = 0; i < n; i++) 
        {
            int d = sc.nextInt();
            insert(d);
        }
        System.out.println("Enter position where value to be inserted");
        int pos = sc.nextInt();
        System.out.println("Enter value to be inserted");
        int val = sc.nextInt();
        insert_position(val,pos,n);
        
        System.out.println("Enter value to be inserted in the beginning");
        int begn = sc.nextInt();
        insert_begin(begn);
        System.out.println("Enter value to be inserted in the last");
        int last = sc.nextInt();
        insert_last(last);
        System.out.println("Enter position where value to be deleted");
        int del = sc.nextInt();
        del_pos(del);
        System.out.println("Delete node in beginning");
        del_beg();
        System.out.println("Delete node in last");
        del_last();
    }
    public void insert(int data) 
    {
        node newNode = new node();
        newNode.data = data;
        newNode.next = null;

        if (head == null) 
        {
            head = newNode;
        } 
        else 
        {
            node temp = head;
            while (temp.next != null) 
            {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }
    public void insert_begin(int x)
    {
        node temp = head;
        node newnode = new node();
        newnode.data=x;
        newnode.next = temp;
        head = newnode;
    }
    public void insert_last(int x)
    {
        node temp = head;
        while(temp.next!=null)
        {
            temp = temp.next;
        }
        node newnode = new node();
        newnode.data = x;
        newnode.next=null;
        temp.next=newnode;
    }
    public void insert_position(int x,int pos,int leng)
    {
        if(leng<pos)
        {
            System.out.println("Invalid position");
        }
        else
        {
            node newnode = new node();
            newnode.data = x;
            node temp1 = head;
            node temp2 = head;
            int i=0;
            while(i<pos)
            {
                temp2 = temp1;
                temp1 = temp1.next;
                i++;
            }
            newnode.next = temp1;
            temp2.next = newnode;
        }
    }
    public void del_beg()
    {
        node temp=head;
        head=head.next;
        temp.next=null;
        temp=null;
    }
    public void del_pos(int pos)
    {
        node temp=head;
        for(int i=1;i<pos-1;i++)
        {
            temp=temp.next;
        }
        temp.next = temp.next.next;
    }
    public void del_last()
    {
        node temp=head;
        while(temp.next.next!=null)
        {
            temp=temp.next;
        }
        temp.next=null;
    }
    public void display() 
    {
        node temp = head;
        System.out.println("Linked List:");
        while (temp != null) 
        {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}