public class SmallestElement {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 8, 1, 9, 4};
        int smallest = findSmallest(numbers);
        System.out.println("The smallest element is: " + smallest);
    }

    public static int findSmallest(int[] arr) {
        if (arr == null || arr.length == 0) {
             throw new IllegalArgumentException("Array cannot be null or empty");
        }
        int smallest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }
        return smallest;
    }
}