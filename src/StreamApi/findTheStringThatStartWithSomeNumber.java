package StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class findTheStringThatStartWithSomeNumber {
    public static void main(String[] args) {
        List<String> stringsli= Arrays.asList("apple","pineapple","lemon");

        List<String> startWithA= stringsli.stream().filter(s -> s.startsWith("a")).collect(Collectors.toList());
        System.out.println(startWithA);
    }
}
