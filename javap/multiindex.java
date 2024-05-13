import java.util.ArrayList;
import java.util.Arrays;

public class multiindex
{
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 4, 5, 1};
        int element = 1;
        ArrayList<Integer> indexes = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                indexes.add(i);
            }
        }
        System.out.println("The indexes of " + element + " in the array are: " + Arrays.toString(indexes.toArray()));
    }
}