package arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ReverseAnArray {

    public void reverseANArrayWithIndex(int []arr,int start,int end){
        while (start<=end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]= temp;
            start++;
            end--;

        }
    }

    public void reverseAnArray(int []arr){
        for (int i=arr.length-1;i>=0;i--){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        int arr[] = {1, 4, 2,7,9};
ReverseAnArray rv=new ReverseAnArray();
//rv.reverseAnArray(arr);
rv.reverseANArrayWithIndex(arr,0, arr.length-1);
        System.out.println(Arrays.toString(arr));

    }
}
