package org.arete.lmbdstrm.advancedstreams;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by rgundapaneni on 8/4/15.
 */
public class StreamDebugging {

    private static final String WORD_REGEXP = "[- .:,]+";

    public static void main(String[] args) throws IOException {

        BufferedReader reader = Files.newBufferedReader(
                Paths.get("src/org/arete/lmbdstrm/advancedstreams/lines.txt"), StandardCharsets.UTF_8);

        List<String> words = reader.lines()
                .peek(System.out::println)
                .flatMap(line -> Stream.of(line.split(WORD_REGEXP)))
                .peek(s -> { return; })
                .map(String::toLowerCase)
                .distinct()
                .sorted((x, y) -> x.length() - y.length())
                .collect(Collectors.toList());

        System.out.println(words);
    }
}