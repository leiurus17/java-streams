package main.java.com.gowpar.streams;

import java.util.Arrays;

public class JavaStreamsSix {

    public static void main(String[] args) {

        // 6. Average of squares of an int array
        Arrays.stream(new int[]{2, 4, 6, 8, 10})
                .map(x -> x * x)
                .average()
                .ifPresent(System.out::println);
    }
}
