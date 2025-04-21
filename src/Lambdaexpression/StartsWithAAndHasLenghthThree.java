package Lambdaexpression;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StartsWithAAndHasLenghthThree {
//
//    Predicate<T> is a functional interface in the java.util.function package.
//    It represents a single-argument function that returns a boolean value (true or false).
//    Essentially, it is used to evaluate a condition on an input of type T.
    public static void main(String[] args) {

        Predicate<String> startsWithA=(s -> s.startsWith("A"));
        Predicate<String> hasLengththree=(s -> s.length()==4);

        Predicate<String> combinedPredicate=startsWithA.and(hasLengththree);

        List<String> names = Arrays.asList("Ann", "Bob", "Amyy", "Alex", "John");

            List<String> filternames = names.stream().filter(combinedPredicate).collect(Collectors.toList());
        System.out.println(filternames);

    }
}
