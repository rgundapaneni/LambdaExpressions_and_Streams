package org.arete.lmbdstrm.streams;

import java.util.Arrays;
import java.util.List;

/**
 * Created by rgundapaneni on 7/31/15.
 */
public class MatchingElementsExample {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("John", "Philip", "Peter", "Turner");

        System.out.println("Find First: " + names.stream().findFirst().get());
        System.out.println("Find Any: " + names.stream().findAny().get());
        System.out.println("All Match: " + names.stream().allMatch(s -> s instanceof String));
        System.out.println("Any Match: " + names.stream().anyMatch(s -> s.startsWith("T")));
        System.out.println("None Match: " + names.stream().noneMatch(s -> s.startsWith("R")));
        System.out.println(names.stream().toArray().length);
    }
}
