package arrays;

import java.util.HashSet;

public class RemoveDuplicateElementsFromArray {
    public static void main(String[] args) {
        HashSet<Integer > hs = new HashSet<>();
        int[] arr = {1, 2, 2, 3, 4, 5, 9};
       for (int i =0; i< arr.length;i++){
           hs.add(arr[i]);
       }
       for (int no :hs){
           System.out.println(no);
       }
    }
}
