package main.java.com.gowpar.streams;

import java.util.stream.Stream;

public class JavaStreamsThirteen {

    public static void main(String[] args) {

        // 13. Reduction - sum
        double total = Stream.of(7.3, 1.5, 4.8)
                .reduce(0.0, (Double a, Double b) -> a + b);

        System.out.println("Total = " + total);
    }
}
