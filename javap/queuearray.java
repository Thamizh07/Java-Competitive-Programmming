import java.util.*;

class queue {
    int a[] = new int[5];
    int f = -1, r = -1; // front //rear

    void endure(int n) {
        if (f == -1) {
            f++;
        }
        a[++r] = n;
    }

    int dequeue() {
        int temp = a[0];
        for(int i=0; i<=r; i++){
            a[i+1] = a[i];
            r--;
        }
        return temp;
    }
}

public class queuearray {
    public static void main(String[] args) {
        queue q = new queue();

        q.endure(10);
        q.endure(20);
        q.endure(30);
        q.endure(40);

        while (q.f <= q.r) {
            int element = q.dequeue();
            System.out.println("Element at index 0: " + element);
        }
    }
}