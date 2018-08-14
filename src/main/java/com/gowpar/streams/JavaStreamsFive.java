package main.java.com.gowpar.streams;

import java.util.Arrays;

public class JavaStreamsFive {

    public static void main(String[] args) {

        // 5. Streams from Array, sort, filter and print
        String[] names = {"Al", "Ankit", "Kushal", "Brent", "Sarika", "Sam", "Amanda",
                "Shirley", "Sunny", "Robert", "Samantha", "Sana", "Tzuyu", "Mina"};
        Arrays.stream(names)
                .filter(x -> x.startsWith("S"))
                .sorted()
                .forEach(System.out::println);
    }
}
