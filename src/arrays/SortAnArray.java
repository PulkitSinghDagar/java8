package arrays;

import java.util.Arrays;

public class SortAnArray {

    public static void main(String[] args) {
        int arr[] = {1, 4, 2, 5, 7, 8, 5, 11, 5, 8};

        // Sorting the array using bubble sort
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    // Swap elements
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        // Printing the sorted array
        System.out.println("Sorted array: " + Arrays.toString(arr));

        // Printing unique values
        System.out.print("Unique values: " + arr[0]); // Print the first element
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                System.out.print(", " + arr[i]);
            }
        }
    }
}
