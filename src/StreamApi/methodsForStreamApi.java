package StreamApi;

import java.util.List;
import java.util.stream.Collectors;

public class methodsForStreamApi {
//    public static int cube(int x) {
//        return x * x * x;
//    }
    public static void main(String[] args) {


        List<String> names =List.of("pulkit","DADA","Ankita","Abhisheksir");
//in this we use fileter
        List<String> NewNames = names.stream().filter(s -> s.startsWith("A")).collect(Collectors.toList());
        System.out.println(NewNames
        );
        //in this we will use map
        List<Integer> newNumber=List.of(1,3,4,6);
        List<Integer> collect = newNumber.stream().map(integer -> integer * integer).collect(Collectors.toList());
        List<Integer> collects = newNumber.stream().map(StreaamApipractice::cube).collect(Collectors.toList());
        System.out.println(collects);
        System.out.println(collect);
    }
}
