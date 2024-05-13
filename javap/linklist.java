// Singly LinkedList DSA in Java
import java.util.*;
public class linklist
{
    class node
    {
        int data;
        node next;
    }
    public node head = null;
    public void append(int x)
    {
        node a = new node();
        a.data = x;
        if(head == null)
        {
            head = a;
        } 
        else
        {
            node p = head;
            while(p.next != null)
            {
                p = p.next;
            }
            p.next = a;
        }
        System.out.println("Inserted");
    }
    public void infirst(int x)
    {
        node a = new node();
        a.data = x;
        if(head==null)
        {
            head = a;
            a.next = null;
        }
        else
        {
            a.next = head;
            head = a;
        }
    }
    public void display()
    {
        node p = head;
        while(p != null)
        {
            System.out.println(p.data);
            p = p.next;
        }
    }
    public int leng()
    {
        node p = head;
        int l = 0;
        while(p!= null)
        {
            l++;
            p = p.next;
        }
        return l;
    }
    public void in_pos(int x,int pos,int l)
    {
        if(l<pos)
        {
            System.out.println("Invalid position");
        }
        else
        {
            node a = new node();
            a.data = x;
            node p1 = head;
            node p2 = head;
            int i=0;
            while(i<pos)
            {
                p2 = p1;
                p1 = p1.next;
                i++;
            }
            a.next = p1;
            p2.next = a;
        }
    }
    public void del_last()
    {
        node p = head;
        if(head == null)
        {
            System.out.println("No element found");
        }
        else
        {
            node p1 = head;
            while(p.next != null)
            {
                p1=p;
                p = p.next;
            }
            p1.next = null;
        }
    }
    public void del_begin()
    {
        if(head==null)
        {
            System.out.println("no element");
        }
        else
        {
            node p =  head;
            head = p.next;
        }
    }
    public static void main(String[] args) 
    {
        linklist o = new linklist();
        Scanner sc = new Scanner(System.in);
        int t = 0;
        while(t ==0)
        {
            int ch;
            System.out.println("Enter your choice\n 1.Insert at last\n 2.Insert at first\n 3.Insert at given position\n 4.Delete at last\n 5.Delete at first\n 6.Length\n 7.Display\n");
            ch = sc.nextInt();
            switch(ch)
            {
                case 1:
                {
                    System.out.println("Enter the value to insert at last");
                    int x = sc.nextInt();
                    o.append(x);
                    System.out.println("Value Inserted");
                    break;
                }
                case 2:
                {
                    System.out.println("Enter the value to insert at first");
                    int x = sc.nextInt();
                    o.infirst(x);
                    System.out.println("Value Inserted");
                    break;
                }
                case 3:
                {
                    System.out.println("Enter the value to insert at given position");
                    int x = sc.nextInt();
                    int pos = sc.nextInt();
                    int l = o.leng();
                    o.in_pos(x,pos,l);
                    System.out.println("Value Inserted");
                    break;
                }
                case 4:
                {
                    o.del_last();
                    System.out.println("Last value deleted");
                    break;
           
                }
                case 5:
                {
                    o.del_begin();
                    System.out.println("first value deleted");
                    break;
                }
                case 6:
                {
                    System.out.println("Length is "+o.leng());
                    break;
                }
                case 7:
                {
                    System.out.println("The element in linked list are");
                    o.display();
                    break;
                }
                default:
                {
                    System.out.println("Invalid choice");
                    t=1;
                }
            }
        }
    }
}
