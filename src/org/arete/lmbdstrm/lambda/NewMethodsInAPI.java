package org.arete.lmbdstrm.lambda;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by rgundapaneni on 7/27/15.
 */
public class NewMethodsInAPI {

    public static void main(String[] args) {

        //Iterable interface
        List<String> items = new LinkedList<String>(Arrays.asList("One", "Two", "Three"));
        items.forEach(System.out::println);

        //Collection interface
        items.removeIf(s -> s.startsWith("O"));
        items.forEach(System.out::println);

        //List interface
        items.replaceAll(String::toUpperCase);
        items.forEach(System.out::println);

        //List interface
        items.sort((s1, s2) -> s1.compareTo(s2));
        items.forEach(System.out::println);
    }
}
