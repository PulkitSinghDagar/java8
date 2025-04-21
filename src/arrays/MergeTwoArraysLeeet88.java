package arrays;

import java.util.Arrays;

public class MergeTwoArraysLeeet88 {


    public static void main(String[] args) {
        int arr[] = {1, 34, 2, 0, 0, 0};  // 'arr' has space for 'k'
        int k[] = {12, 43, 13};
        int startIndex = 0;


        for (int i=0;i< arr.length;i++){
            if (arr[i]==0){
                 startIndex=i;
                    break;

            }

        }

        for (int i=0;i<k.length;i++){
            arr[startIndex+i]=k[i];
        }

        System.out.println("Merged array: " + Arrays.toString(arr));

    }
}
