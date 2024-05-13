package StreamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Streamobject {
    public static void main(String[] args) {
        //1blank stream
        Stream<Object> emptyStream = Stream.empty();

//2 creating Streams with array object or anything
        String[] names={"pulkit","DADA","ankita","Abhisheksir"};
        Stream<String> streamofnames = Stream.of(names);
        streamofnames.forEach(s -> {
            System.out.println(s);
        });

        //2 making alist or set
        List<Integer> list = List.of(1, 2, 34, 5, 7, 8, 9);
        List<Integer> ListEven = new ArrayList<>();
        list.stream();
    }
}