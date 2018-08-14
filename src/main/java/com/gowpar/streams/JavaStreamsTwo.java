package main.java.com.gowpar.streams;

import java.util.stream.IntStream;

public class JavaStreamsTwo {

    public static void main(String[] args) {

        // 2. Integer Stream with skip
        IntStream
                .range(1, 10)
                .skip(5)
                .forEach(x -> System.out.println(x));
        System.out.println();
    }
}
