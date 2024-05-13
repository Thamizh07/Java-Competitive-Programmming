import java.util.Scanner;
public class circularsinglelinkedlist2 {
    public static void main(String[] args) {
        CircularSingle cs = new CircularSingle();
        cs.create();
        System.out.println("\n");
        cs.display();
    }
}

class node {
    int data;
    node next;
}

class CircularSingle {
    node head;

    public void create() {
        Scanner sc = new Scanner(System.in);
        System.out.print("number of nodes:");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("node-" +(i+1)+ ":");
            int d = sc.nextInt();
            insert(d);
        }
        System.out.println("\nenter  pos and value\n");
        int pos = sc.nextInt();
        int d1 = sc.nextInt();
        insert_pos(pos,d1);
    }

    public void display() {
        node temp = head;
        do {
            System.out.println(temp.data);
            temp = temp.next;
        } while (temp != head);
    }

    public void insert(int data) {
        node newnode = new node();
        newnode.data = data;
        newnode.next = null;

        if (head == null) {
            head = newnode;
            newnode.next = head;
        } else {
            node temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newnode;
            newnode.next = head;
        }
    }
    public void insert_pos(int pos, int d1){
        node temp = head;
        node newnode = new node();
        newnode.data = d1;
        if(pos!=1){
            for(int i=0;i<pos-1;i++){
                temp=temp.next;
            }
            newnode.next = temp.next;
            temp.next = newnode;
        }
        else{
            while(temp.next!=head){
                temp=temp.next;
            }
            temp.next= newnode;
            newnode.next=head;
            head = newnode;
        }
    }
}