package arrays;

public class FindTheFirstRepeatElemt {
    public static void main(String[] args) {
        boolean found = false; // Flag to break out of the outer loop

        int ar[]={1,2,4,5,2,5};
        for (int i=0;i<ar.length;i++){
            for (int j=i+1;j<ar.length;j++){
                if (ar[i]==ar[j]){
                    System.out.println(ar[i]);
                    found=true;
                    break;



                }
            }
            if (found) {
                break; // Break the outer loop
            }
        }

    }
}
