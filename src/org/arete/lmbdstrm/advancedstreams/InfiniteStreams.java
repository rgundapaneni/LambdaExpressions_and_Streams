package org.arete.lmbdstrm.advancedstreams;

import java.util.OptionalInt;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by rgundapaneni on 8/4/15.
 */
public class InfiniteStreams {

    public static void main(String[] args) {

        OptionalInt randomNum = (new Random()).ints().filter(i -> i < 256 && i > 0).findFirst();
        System.out.println(randomNum.getAsInt());

        IntStream.iterate(0, i -> i + 2).limit(2).forEach(System.out::println);
        Stream.of(25, 15, 20, 45).filter(e -> e > 20).peek(e -> System.out.println(e)).collect(Collectors.toList());
    }
}
