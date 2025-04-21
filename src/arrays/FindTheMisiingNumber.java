package arrays;

public class FindTheMisiingNumber {
    public static void main(String[] args) {
        int arr[]={1,2,4,3,5,7};
        int expected_Number_of_Elemtent=arr.length+1;
        int total_Sum= expected_Number_of_Elemtent*(expected_Number_of_Elemtent+1)/2;
        int Sum=0;

        for (int i=0;i<arr.length;i++){
            Sum +=arr[i];
        }
        System.out.println(total_Sum-Sum);

    }
}
