import java.util.*;

class arrays {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a[] = new int[n];
    int c = n;
    int s = 0;

    public void array() {
        if (s == c) {
            increase();
        } else {
            a[s++] = sc.nextInt();
        }
    }

    public void increase() {
        a = Arrays.copyOf(a, c * 2);
        c = c * 2;
    }

    public void display() {
        for (int i = 0; i < s; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public void insert(int pos, int val) {
        if (s == c) {
            increase();
        }
        for (int i = s - 1; i >= pos; i--) {
            a[i + 1] = a[i];
        }
        a[pos] = val;
        s++;
    }

    public void delete(int pos) {
        if (pos < 0 || pos >= s) {
            System.out.println("Invalid position to delete.");
            return;
        }
        for (int i = pos; i < s - 1; i++) {
            a[i] = a[i + 1];
        }
        s--;
    }
}

public class arrayusingmethod{
    public static void main(String[] args) {
        arrays ar = new arrays();
        ar.array();
        ar.array();
        ar.array();
        ar.array();
        ar.display();

        Scanner input = new Scanner(System.in);
        System.out.print("Enter position to insert: ");
        int pos = input.nextInt();
        System.out.print("Enter value to insert: ");
        int val = input.nextInt();
        ar.insert(pos, val);

        System.out.print("Enter position to delete: ");
        pos = input.nextInt();
        ar.delete(pos);

        ar.display();
    }
}

