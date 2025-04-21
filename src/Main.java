public class Main {


    public static void main(String[] args) {
        System.out.println("Hello world!");
        int arr[]={1,4,2,5,8,5,2};
        for (int i=0;i< arr.length;i++){
            for (int j=i+1;j< arr.length;j++){
                int temp = 0;
                if (arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }


            }
            System.out.print(arr[i]);

                }
        for (int i = 1 ; i<arr.length;i++){
            if (arr[i]!=arr[i-1]){
                System.out.println(""+arr[i]);
            }
        }
    }
}