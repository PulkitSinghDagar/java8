package arrays;

public class FindTheKthSmallest {

    // Method to sort the array and return the K'th smallest element
    public static int returnTheKthSmallest(int[] arr, int k) {
        // Sort the array using bubble sort
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                // Proper swapping logic
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        // Return the K'th smallest element (arr[k-1] because array is 0-indexed)
        return arr[ k-1];
    }

    public static void main(String[] args) {
        int[] arr = {12, 3, 5, 7, 19};  // Our list of numbers
        int k = 3;  // We want the second smallest number

        // Call the function to find the K'th smallest and print the answer
        System.out.println(k + "th smallest element is " + returnTheKthSmallest(arr, k));
    }
}
