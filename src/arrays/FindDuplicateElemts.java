package arrays;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicateElemts {
    public static void main(String[] args) {
        int arr[]={1,2,4,2,5,7,7,8,5,5};

        //thsi i sthe brute force method
//        for (int i=0;i< arr.length;i++){
//            for (int j=i+1;j< arr.length;j++){
//                if (arr[i]==arr[j]){
//                    System.out.println(arr[i]);
//                }
//            }
//        }

//thsi is the netter approach
        Set<Integer> s= new HashSet<>();
        for (int no:arr){
            if (s.add(no)==false){
                System.out.println(no);
            }



        }


    }
}
