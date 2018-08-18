package main.java.com.gowpar.streams;

import java.util.Arrays;
import java.util.List;

public class JavaStreamsSeven {

    public static void main(String[] args) {

        // 7. Stream from List, filter and print
        List<String> people = Arrays.asList("Al", "Ankit", "Brent", "Sarika", "Amanda", "Hans");

        people
                .stream()
                .map(String::toLowerCase)
                .filter((x -> x.startsWith("a")))
                .forEach(System.out::println);

    }
}
