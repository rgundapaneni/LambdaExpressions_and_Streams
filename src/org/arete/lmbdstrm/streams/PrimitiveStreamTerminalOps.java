package org.arete.lmbdstrm.streams;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

/**
 * Created by rgundapaneni on 7/31/15.
 */
public class PrimitiveStreamTerminalOps {

    public static void main(String[] args) {

        IntStream intStream = IntStream.of(25, 15, 10, 30, 45);
        DoubleStream doubleStream = DoubleStream.of(64.35, 20.15, 51.23);
        LongStream longStream = LongStream.of(3232, 5454, 7434, 1025);

        System.out.println(intStream.max().getAsInt());
        System.out.println(doubleStream.count());
        System.out.println(longStream.min().getAsLong());

        doubleStream = DoubleStream.of(64.35, 20.15, 51.23);
        longStream = LongStream.of(3232, 5454, 7434, 1025);

        System.out.println(doubleStream.average().getAsDouble());
        System.out.println(longStream.sum());

        intStream = IntStream.of(25, 15, 10, 30, 45);
        System.out.println(intStream.reduce(0, (x, y) -> x + y / 5));
    }
}