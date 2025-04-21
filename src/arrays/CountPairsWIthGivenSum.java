package arrays;

import java.util.HashMap;

public class CountPairsWIthGivenSum {
//    static int TwoSum(int arr[], int target){
//        int count =0;
//        for (int i=0 ;i< arr.length;i++){
//            for (int j=i+1;j< arr.length;j++){
//                if (arr[i]+arr[j]== target )
//                    count ++;
//            }
//        }
//        return count;
//    }



    static int TwoSum(int[] arr, int target) {
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        int count = 0;

        for (int num : arr) {
            int complement = target - num;

            // If complement is in map, it means we found a pair
            if (freqMap.containsKey(complement)) {
                count += freqMap.get(complement); // Increment count based on occurrences
            }

            // Store the current element in the map
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        return count;
    }


    public static void main(String[] args) {
       int arr[] = {2, 5, 7, -1,10};

       int target=12;

        System.out.println(TwoSum(arr,target));
    }
}
