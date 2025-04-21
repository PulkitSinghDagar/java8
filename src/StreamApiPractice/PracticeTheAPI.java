package StreamApiPractice;

import java.util.*;
import java.util.stream.Collectors;

public class PracticeTheAPI {
    public static void main(String[] args) {
        List<Student> list=Arrays.asList(new Student(1, "Aditya", "Mall", 30, "Male", "Mechanical Engineering", 2014, "Mumbai", 122),
                new Student(2, "Pulkith", "Singh", 26, "Male", "Computer Engineering", 2018, "Delhi", 67),
                new Student(3, "Ankita", "Patil", 25, "Female", "Computer Engineering", 2019, "Kerala", 164),
                new Student(4, "Satish", "Malaghan", 30, "Male", "Mechanical Engineering", 2014, "Kerala", 26),
                new Student(5, "Darshan", "Mukd", 23, "Male", "Instrumentation Engineering", 2022, "Mumbai", 12),
                new Student(6, "Chetan", "Star", 24, "Male", "Mechanical Engineering", 2023, "Karnataka", 90),
                new Student(7, "Arun", "Vittal", 26, "Male", "Electronics Engineering", 2014, "Karnataka", 324),
                new Student(8, "Nam", "Dev", 31, "Male", "Computer Engineering", 2014, "Karnataka", 433),
                new Student(9, "Sonu", "Shankar", 27, "Female", "Computer Engineering", 2018, "Karnataka", 7),
                new Student(10, "Satyam", "Pandey", 26, "Male", "Biotech Engineering", 2017, "Mumbai", 98));






                        //collect the studentwith department nake

        Map<String,List<Student>> departmentcollect = list.stream().collect(Collectors.groupingBy(Student::getDepartmantName));
        System.out.println("ollect the studentwith department nake"+departmentcollect);

                //cont the student by department name
        Map<String,Long> countByDepartmentName=list.stream().collect(Collectors.groupingBy(Student::getDepartmantName,Collectors.counting()));
        System.out.println("cont the student by department name"+countByDepartmentName);

        //Find all departments names.
        List<String> alldepartmentName=list.stream().map(t->t.getDepartmantName()).collect(Collectors.toList());
        System.out.println("Find all departments names"+alldepartmentName);
//Find the list of students whose age is less than 25.
        List<Student> ageverifu=list.stream().filter(a->a.getAge()>25).collect(Collectors.toList());
        System.out.println("Find the list of students whose age is less than 25."+ageverifu);
        //Find the max age of students.
        OptionalInt maxage=list.stream().mapToInt(t->t.getAge()).max();
        System.out.println("Find the max age of students."+maxage);


        //6Find the average age of male and female students.
        Map<String,Double> avgage=list.stream().collect(Collectors.groupingBy(Student::getGender,Collectors.averagingInt(Student::getAge)));
        System.out.println("Find the average age of male and female students."+avgage);

       // 7. Find the young student in all departments.

        int min = list.stream().mapToInt(Student::getAge)
                .min()
                .getAsInt();
        System.out.println("Minimum age of student is " + min);
        Student student = list.stream()
                .min(Comparator.comparing(Student::getAge))
                .get();
        System.out.println("Young student is " + student);

        //9 student rank between 50 and 100
        List<Student> some= list.stream().filter(t -> t.getRank() > 50 && t.getRank() < 100).collect(Collectors.toList());
        System.out.println("student rank between 50 and 100"+some);

        //Find the department who is having maximum number of students

        Map.Entry<String,Long> entry= list.stream()
                        .collect(Collectors.groupingBy(Student::getDepartmantName,Collectors.counting()))
                                .entrySet().stream().max(Map.Entry.comparingByValue()).get();

        System.out.println("Department having maximum number of students " + entry);

        //11.Find the Students who stays in Mumbai and sort them by their names.
        List<Student> collect = list.stream()
                .filter(t -> t.getCity().equals("Mumbai"))
                .sorted(Comparator.comparing(Student::getFirstName))
                .collect(Collectors.toList());

        System.out.println(collect);

        //12. Find the total count of students.
        long count = list.stream().count();

        System.out.println("Total count " + count);
        //Find the average rank in all departments.
        Map<String, Double> collecte = list.stream()
                .collect(Collectors.groupingBy(Student::getDepartmantName, Collectors.averagingInt(Student::getRank)));

        System.out.println("Average ranks " + collecte);
        //Find the highest rank in each department.
        Map<String, Optional<Student>> collectw = list.stream()
                .collect(Collectors.groupingBy(Student::getDepartmantName,Collectors.minBy(Comparator.comparing(Student::getRank))));

        System.out.println(collectw);


       // Find the list of students , which are sorted by their rank.

                List<Student> collected = list.stream()
                .sorted(Comparator.comparing(Student::getRank))
                .collect(Collectors.toList());

        System.out.println(collected);
       // Find the second highest rank student.

        Student students = list.stream()
                .sorted(Comparator.comparing(Student::getRank))
                .skip(1).findFirst()
                .get();

        System.out.println("Student "  + students);


       // Find the ranks of students in all department in ascending order.

//                Map<String, List<Student>> collects = list.stream()
//                .collect(Collectors.groupingBy(Student::getDepartmantName,Collectors.collectingAndThen(Collectors.toList(), list -> list.stream()
//                        .sorted(Comparator.comparing(Student::getRank))
//                        .collect(Collectors.toList()))));
//        System.out.println(collects);

    }
}
