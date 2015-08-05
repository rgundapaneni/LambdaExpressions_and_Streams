package org.arete.lmbdstrm.lambda;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

/**
 * Created by rgundapaneni on 7/24/15.
 */
public class FunctionExample {

    public static void main(String[] args) {

        BiFunction<Integer, Integer, Integer> biFunction = (a, b) -> a*a + 2*a*b + b*b;
        Function<Integer, Integer> function = (x) -> x/2;

        Function<Integer, Integer> composedFunction = (r) -> r + 2;

        System.out.println(biFunction.andThen(function).andThen(function.compose(composedFunction)).apply(2, 4));

        UnaryOperator<String> unaryOperator = (s) -> s.toLowerCase();
        System.out.println("Unary: " + unaryOperator.apply("LANGUAGE"));

        BinaryOperator<String> binaryOperator = (s1, s2) -> s1.concat(s2);
        System.out.println("Binary: " + binaryOperator.apply("Hello", " World!"));
    }
}