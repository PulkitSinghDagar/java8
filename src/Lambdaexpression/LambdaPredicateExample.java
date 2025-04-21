package Lambdaexpression;

import java.util.function.Predicate;

public class LambdaPredicateExample {
    public static void main(String[] args) {
        Predicate<Integer> isEven = num -> num % 2 == 0;
        System.out.println(isEven.test(2)); // true
        System.out.println(isEven.test(7));  // false
    }
}
