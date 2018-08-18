package main.java.com.gowpar.streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class JavaStreamsTen {

    public static void main(String[] args) throws IOException {

        String path = System.getProperty("user.dir");
        String anotherPath = "/target/production/java-streams/main/java/com/gowpar/streams/";

        // 10. Stream rows from CSV file and count
        Stream<String> rows1 = Files.lines(Paths.get(path + anotherPath + "data.csv"));

        int rowCount = (int) rows1
                .map(x -> x.split(","))
                .filter(x -> x.length == 3)
                .count();

        System.out.println(rowCount + " rows.");
        rows1.close();

    }
}
