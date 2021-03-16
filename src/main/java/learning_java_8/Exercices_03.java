package learning_java_8;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

class Course {
    private String name;
    private int students;

    public Course(String name, int students) {
        this.name = name;
        this.students = students;
    }

    public String getName() {
        return name;
    }

    public int getStudents() {
        return students;
    }
}


public class Exercices_03 {
    public static void main(String[] args) {
        List<Course> courses = new ArrayList<Course>();

        courses.add(new Course("Phython", 45));
        courses.add(new Course("JavaScript", 150));
        courses.add(new Course("Java 8", 113));
        courses.add(new Course("C", 55));

        courses.sort(Comparator.comparing(Course::getStudents));

        courses.stream()
                .filter(c -> c.getStudents() >= 50)
                .forEach(c -> System.out.println(c.getName()));

        courses.stream()
                .map(c -> c.getName())
                .forEach(System.out::println);

       courses.stream()
               .mapToInt(Course::getStudents)
               .average()
               .ifPresent(System.out::println);


        List<Course> collect = courses.stream()
                .filter(c -> c.getStudents() > 50)
                .collect(Collectors.toList());
    }
}