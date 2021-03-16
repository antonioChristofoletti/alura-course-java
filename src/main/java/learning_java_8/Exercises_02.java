package learning_java_8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

import static java.util.Comparator.comparing;

public class Exercises_02 {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();

        words.add("AA");
        words.add("BBB");
        words.add("C");

        words.sort(String.CASE_INSENSITIVE_ORDER);
    }
}