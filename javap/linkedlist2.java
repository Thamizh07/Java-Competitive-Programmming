import java.util.*;
public class linkedlist2 {
    public static void main(String[] args){
        SingleLinkedList sll = new SingleLinkedList();
        sll.createnew();
        sll.display();
    }
}
class node{
    int data;
    node next;
}
class SingleLinkedList{
    node head;
    public void createnew(){
        head = new node();
        
        head.data = 5;
        head.next = null;
        node newnode = new node();
       
        newnode.data = 6;
        newnode.next = null;
        head.next = newnode;
    }
    public void display(){
        node temp=head;
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}


