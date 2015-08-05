package org.arete.lmbdstrm.streams;

import java.util.Optional;
import java.util.stream.Stream;

/**
 * Created by rgundapaneni on 7/31/15.
 */
public class OptionalExample {

    public static void main(String[] args) {

        Optional<String> optional = Stream.of("Hello").findFirst();

        optional.ifPresent(System.out::println);
        optional.filter(x -> x.startsWith("R")).ifPresent(System.out::println);
        optional.map(String::trim).filter(x -> x.length() > 0).ifPresent(System.out::println);

        Optional<Optional<String>> nested = optional.map(OptionalExample::tryFindSimilar);
        System.out.println(nested.get().get());

        Optional<String> flattened = optional.flatMap(OptionalExample::tryFindSimilar);
        System.out.println(flattened.get());

        String value = "Sample";
        System.out.println("ofNullable: ");
        Optional.ofNullable(value).ifPresent(System.out::println);
    }

    private static Optional<String> tryFindSimilar(String s) {

        return Stream.of("Similar").findFirst();
    }
}