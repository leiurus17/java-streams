package main.java.com.gowpar.streams;

import java.util.stream.IntStream;

public class JavaStreamsThree {

    public static void main(String[] args) {

        // 3. Print the sum
        // Note: Not including the end range i.e. 5 in the summation
        System.out.println(
                IntStream
                        .range(1, 5)
                        .sum());
        System.out.println();
    }
}
