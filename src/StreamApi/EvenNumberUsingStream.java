package StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumberUsingStream {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,543,23,22,34,4,4);

        List<Integer> evenNumber = numbers.stream().filter(n-> n%2==0).collect(Collectors.toList());
        System.out.println(evenNumber);
    }
}
