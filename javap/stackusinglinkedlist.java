class stack{
    node top;
    class node{
        int data;
        node next;
        node(int d){
            data=d;
            next=null;
        }
    }
    stack(){
        top=null;
       
    }
    void push(int d){
        node newnode=new node(d);
        if(top==null)
        top=newnode;
        else{
        newnode.next=top; 
        top=newnode;
        }
    }
    void pop(){
        if(top==null){
            System.out.print("empty");
        }
        else{
            System.out.print(top.data);
            top=top.next;
        }
    }
}
public class stackusinglinkedlist{
    public static void main (String[] args) {
        stack s=new stack();
        s.push(12);
        s.push(89);
        s.push(95);
         s.pop();
         System.out.println("\n");
         s.push(5);
         s.push(9);
         s.pop();
         System.out.println("\n");
        
    }
}