package arrays;

import java.util.Arrays;

public class RotateAnArrayByOne {
    public static void main(String[] args) {
        int arr[]={1,22,323,24,5};
        int last_element=arr[arr.length-1];
        for (int i= arr.length-1;i>0;i--){
            arr[i]=arr[i-1];

        }
        arr[0]=last_element;
        System.out.println(Arrays.toString(arr));
    }
}
