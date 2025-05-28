public class LargestElement {

    public static void main(String[] args) {
        int[] arr = {10, 5, 25, 8, 15};
        int largest = findLargest(arr);
        System.out.println("The largest element in the array is: " + largest);
    }

    public static int findLargest(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty");
        }

        int largest = arr[0]; 

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i]; 
            }
        }
        return largest;
    }
}