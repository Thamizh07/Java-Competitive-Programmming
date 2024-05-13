import java.util.Scanner;
import java.util.Stack;

class QueueUsingTwoStacks {
    private Stack<Integer> stack1 = new Stack<>();
    private Stack<Integer> stack2 = new Stack<>();

    public void enqueue(int value) {
        stack1.push(value);
    }

    public int dequeue() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        if (!stack2.isEmpty()) {
            return stack2.pop();
        } else {
            return -1; 
        }
    }

    public int front() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        if (!stack2.isEmpty()) {
            return stack2.peek();
        } else {
            return -1; 
        }
    }
}

public class Queue_Using_two_stacks{
    public static void main(String[] args) {
        QueueUsingTwoStacks queue = new QueueUsingTwoStacks();

        Scanner scanner = new Scanner(System.in);

        int q = scanner.nextInt();

        for (int i = 0; i < q; i++) {
            int queryType = scanner.nextInt();
            switch (queryType) {
                case 1:
                    int value = scanner.nextInt();
                    queue.enqueue(value);
                    break;
                case 2:
                    queue.dequeue();
                    break;
                case 3:
                    int frontElement = queue.front();
                    System.out.println(frontElement);
                    break;
            }
        }
        scanner.close();
    }
}   