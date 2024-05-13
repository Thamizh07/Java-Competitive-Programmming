public class stackpoppush{
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(9);
        s.push(10);
        s.pop();
        s.pop();
    }
}
class Stack{
    final int n = 10;
    int arr[] = new int[n];
    int top;
    Stack(){
    top = -1;
    }
 void push(int n){
     if(top==9){
         System.out.println("Stack is full");
     }
     else{
         arr[++top]=n;
         System.out.println("Pushed: " + n);
     }
 }
 void pop(){
     if (top == -1) {
            System.out.println("Stack is empty");
        
        } 
        else {
            System.out.println("Popped: " + arr[top--]);
        }
 }
 }