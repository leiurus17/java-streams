package main.java.com.gowpar.streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class JavaStreamsEleven {

    public static void main(String[] args) throws IOException {

        String path = System.getProperty("user.dir");
        String anotherPath = "/target/production/java-streams/main/java/com/gowpar/streams/";

        // 11. Stream rows from CSV, parse data from rows
        Stream<String> rows = Files.lines(Paths.get(path + anotherPath + "data.csv"));

        rows
                .map(x -> x.split(","))
                .filter(x -> x.length ==3)
                .filter(x -> Integer.parseInt(x[1]) > 15)
                .forEach(x -> System.out.println(x[0] + " " + x[1] + " " + x[2]));

        rows.close();
    }
}
