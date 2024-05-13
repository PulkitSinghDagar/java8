package Lambdaexpression;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class UnitExcersiceUnit2 {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("charles","dickens",23),
                new Person("Lewis","Carrol",25),
                new Person("Thomas","Caraleyn",24),
                new Person("Matthew","Arnold",23)
        );

        //print all the element in list
        Printc(people,person -> true);

        //sort the person with last name
        System.out.println(people);
        Collections.sort(people,(o1, o2) -> o1.getLastName().compareTo(o2.getLastName()));
        System.out.println("printallpeople");
        System.out.println(people);


        //all people starting with last name with c
        System.out.println("print all person woith C");
        Printc(people,person -> person.getLastName().startsWith("C"));

    }
    public static void Printc(List<Person> people, Predicate<Person> predicate){
        for (Person p: people){
            if (predicate.test(p)){
                System.out.println(p);
            }
        }
    }
}
