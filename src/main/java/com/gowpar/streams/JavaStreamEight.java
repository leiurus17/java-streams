package main.java.com.gowpar.streams;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;
import java.io.IOException;

public class JavaStreamEight {

    public static void main(String[] args) throws IOException {

        String path = System.getProperty("user.dir");
        String anotherPath = "/target/production/java-streams/main/java/com/gowpar/streams/";

        // 8. Stream rows from text file, sort, and print

        // WTF with the hacked path...
        Stream<String> bands = Files.lines(Paths.get(path + anotherPath + "bands.txt"));

        bands
                .sorted()
                .filter(x -> x.length() > 5)
                .forEach(System.out::println);
        bands.close();

    }
}
