package learning_java_8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class Exercises_01 {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();

        words.add("AA");
        words.add("BBB");
        words.add("C");
        words.forEach(System.out::println);

        words.sort(Comparator.comparingInt(String::length));

        words.replaceAll( s -> s + "**");

        words.forEach(System.out::println);

        Function<String, String> eba = s -> {
            String eba1 = s+"*";
            return eba1;
        };

        words.replaceAll(s -> s + "10");
    }
}

@FunctionalInterface
interface myInterface {
    abstract Integer teste(String myString);
}