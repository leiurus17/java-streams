package main.java.com.gowpar.streams;

import java.util.stream.*;

public class JavaStreamsFour {

    public static void main(String[] args) {

        // 4. Stream.of, sorted and findFirst
        Stream.of("Ava", "Aneri", "Alberto")
                .sorted()
                .findFirst()
                .ifPresent(System.out::println);
    }
}
