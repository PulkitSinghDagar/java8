package arrays;

public class OccuranceOfTheLement {
    public static void main(String[] args) {
        int arr[] = {1, 34, 2, 0, 0, 0};
        int res=0;
        int x=0;
        for (int i =0;i<arr.length;i++){
            if (arr[i]==x){
                res++;
            }
        }
        System.out.println(res);
    }

}
