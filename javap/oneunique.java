import java.util.Scanner;
public class oneunique {

    static int findDistinctElement(int[] inputArray) {
        int[] frequencyArray = new int[1001]; 

        for (int i = 0; i < inputArray.length; i++) {
            int element = inputArray[i];
            frequencyArray[element]++;
        }
        for (int i = 0; i < frequencyArray.length; i++) {
            if (frequencyArray[i] == 1) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] inputArray = new int[size];
        for (int i = 0; i < size; i++) {
            inputArray[i] = sc.nextInt();
        }
        int distinctElement = findDistinctElement(inputArray);
        System.out.println(distinctElement);
        sc.close();
    }
}
