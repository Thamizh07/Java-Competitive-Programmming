import java.util.*;
public class maxnodeoflinkedlist{
    public static void main(String[] args){
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.create();
    }
}
class node{
    int data;
    node next;
}
class SinglyLinkedList{
    node head;
    Scanner sc = new Scanner(System.in);
    public void create(){
        System.out.println("Enter the number of nodes");
        int n = sc.nextInt();
        System.out.println("Enter " + n + " elements for the linked list:");
        for (int i = 0; i < n; i++) 
        {
            int d = sc.nextInt();
            insert(d);
        }
        System.out.println("Greatest node value");
        greatest(n);
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
    public void greatest(int leng){
        node temp1  = head;
        int max = 0;
        for(int i=0;i<leng;i++)
        {
            if(max<temp1.data)
            {
                max = temp1.data;
            }
            temp1 = temp1.next;
        }
        System.out.println(max);
    }
}