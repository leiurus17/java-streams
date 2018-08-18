package main.java.com.gowpar.streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JavaStreamsNine {

    public static void main(String[] args) throws IOException {

        String path = System.getProperty("user.dir");
        String anotherPath = "/target/production/java-streams/main/java/com/gowpar/streams/";

        // 9. Stream rows from text file and save to List
        // WTF with the hacked path...
        List<String> bands = Files.lines(Paths.get(path + anotherPath + "bands.txt"))
                .filter(x -> x.contains("lo"))
                .collect(Collectors.toList());

        bands.forEach(x -> System.out.println(x));
    }
}
