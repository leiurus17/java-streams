package main.java.com.gowpar.streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Map;
import java.util.HashMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JavaStreamsTwelve {

    public static void main(String[] args) throws IOException {

        String path = System.getProperty("user.dir");
        String anotherPath = "/target/production/java-streams/main/java/com/gowpar/streams/";

        Stream<String> rows3 = Files.lines(Paths.get(path + anotherPath + "data.csv"));



        //12. Stream rows from CSV files, store fields in HashMap
        Map<String, Integer> map = new HashMap<>();
        map = rows3
                .map(x -> x.split(","))
                .filter(x -> x.length == 3)
                .filter(x -> Integer.parseInt(x[1]) > 15)
                .collect(Collectors.toMap(
                        x -> x[0],
                        x -> Integer.parseInt(x[1])
                ));

        rows3.close();

        for (String key : map.keySet()) {
            System.out.println(key + " " + map.get(key));
        }

    }
}
