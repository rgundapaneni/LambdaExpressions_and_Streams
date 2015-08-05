package org.arete.lmbdstrm.streams;

import java.util.Arrays;
import java.util.List;

/**
 * Created by rgundapaneni on 7/31/15.
 */
public class SortingStream {

    public static void main(String[] args) {

        List<Long> numbers = Arrays.asList(4L, 10L, 6L, 6L, 6L, 2L, 15L);
        numbers.stream().sorted((x, y) -> x > y? 1: -1).unordered().forEach(System.out::println);

        numbers.stream().peek( l -> System.out.println(l) );
    }
}
