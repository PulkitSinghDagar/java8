package strings;

import java.util.ArrayList;
import java.util.List;

public class ReverseAString {
    public static void main(String[] args) {
        String av="puliit is a good guy";
//        String[] arrayOfString = av.split(" ");
//        List<String> reverseArrayOfString = new ArrayList<>();
//
//        for (int i = arrayOfString.length - 1 ; i>= 0; i--) {
//            reverseArrayOfString.add(arrayOfString[i]);
//        }
//
//        System.out.println(reverseArrayOfString.toString());

        String rev ="";

        for (int i=av.length()-1;i>=0;i--){
            rev+=av.charAt(i);
        }
        System.out.println(rev);
    }
}
