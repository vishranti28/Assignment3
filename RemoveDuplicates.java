import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDuplicates {

    public static void main(String[] args) {
        int[] originalArray = {1, 2, 2, 3, 4, 4, 5};
        int[] uniqueArray = RemoveDuplicate(originalArray);

        System.out.println("Original Array: " + Arrays.toString(originalArray));
        System.out.println("Array with Duplicates Removed: " + Arrays.toString(uniqueArray));
    }

    public static int[] RemoveDuplicate(int[] array) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for (int element : array) {
            set.add(element);
        }

        int[] result = new int[set.size()];
        int i = 0;
        for (Integer element : set) {
            result[i++] = element;
        }

        return result;
    }
}