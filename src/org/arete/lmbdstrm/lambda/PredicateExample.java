package org.arete.lmbdstrm.lambda;

import java.io.IOException;
import java.nio.file.*;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

/**
 * Created by rgundapaneni on 7/26/15.
 */
public class PredicateExample {

    public static void main(String[] args) throws IOException {

        BiPredicate<Integer, Integer> greaterThan = (i1, i2) -> i1.intValue() > i2.intValue();
        System.out.println(greaterThan.test(20, 25));

        Predicate<String> isAllLower = (s) -> s.toLowerCase().equals(s);
        System.out.println(isAllLower.test("rama"));

        System.out.println("Files find method ................");
        Files.find(Paths.get("/Data"), 10, (path, attr) -> String.valueOf(path).endsWith(".java"), FileVisitOption.FOLLOW_LINKS)
                .forEach(System.out::println);
    }
}
