public class ArraySearch {

    public static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i; // Element found, return its index
            }
        }
        return -1; // Element not found
    }

    public static void main(String[] args) {
        int[] myArray = {10, 20, 30, 40, 50};
        int searchKey = 30;
        
        int index = linearSearch(myArray, searchKey);

        if (index != -1) {
            System.out.println("Element " + searchKey + " found at index: " + index);
        } else {
            System.out.println("Element " + searchKey + " not found in the array.");
        }
    }
}