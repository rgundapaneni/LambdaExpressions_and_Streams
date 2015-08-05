package org.arete.lmbdstrm.advancedstreams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Comparator;

/**
 * Created by rgundapaneni on 8/2/15.
 */
public class LongestStringInFile {

    public static void main(String[] args) throws IOException {

        findLengthOfLongestStringInFile();
        findLongestStringInFile();
        findLongestStringInFileSimpler();
    }

    private static void findLengthOfLongestStringInFile() throws IOException {

        int longestLength = Files.lines(Paths.get("src/org/arete/lmbdstrm/advancedstreams/lines.txt"))
                                    .mapToInt(s -> s.length()).max().getAsInt();
        System.out.println(longestLength);
    }

    private static void findLongestStringInFile() throws IOException {

        String longestLine = Files.lines(Paths.get("src/org/arete/lmbdstrm/advancedstreams/lines.txt"))
                                    .reduce((x, y) -> x.length() > y.length() ? x : y).get();
        System.out.println(longestLine);
    }

    private static void findLongestStringInFileSimpler() throws IOException {

        String longestLine = Files.lines(Paths.get("src/org/arete/lmbdstrm/advancedstreams/lines.txt"))
                                .max(Comparator.comparingInt(String::length)).get();
        System.out.println(longestLine);
    }
}