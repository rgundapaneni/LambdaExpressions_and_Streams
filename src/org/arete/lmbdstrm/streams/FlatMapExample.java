package org.arete.lmbdstrm.streams;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by rgundapaneni on 7/31/15.
 */
public class FlatMapExample {

    public static void main(String[] args) throws IOException {

        //URL resource = (new FlatMapExample()).getClass().getClassLoader().getResource("org/arete/lmbdstrm/lambda/ConsumerExample.class");
        BufferedReader reader = Files.newBufferedReader(Paths.get("/Data/Languages/Java/Projects/Oracle_Lambda_Streams/src/org/arete/lmbdstrm/streams/RegExSource.txt"));

        System.out.println(
                reader.lines().skip(2).limit(2).flatMap(line -> Stream.of(line.split("\\s"))).filter(s -> !s.toLowerCase().contains("this"))
                        .collect(Collectors.joining()));
    }
}