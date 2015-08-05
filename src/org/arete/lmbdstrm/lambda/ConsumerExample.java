package org.arete.lmbdstrm.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerExample {

    public static void main(String[] args) {

        List<Student> students = Arrays.asList(new Student(2011, 45.25), new Student(2012, 60.45),
                new Student(2011, 51.25));

        Consumer<Student> consumer = (s) -> System.out.println(
                                        String.format("%d - %.2f", s.getGradYear(), s.getScore()));
        for(Student student : students) {
            consumer.accept(student);
        }

        BiConsumer<String, String> biConsumer = (A, B) -> System.out.println(String.format("Pair: %s - %s", A, B));
        biConsumer.accept("Hello", "World!");

        BiConsumer<String, String> newConsumer = (A, B) -> System.out.println(String.format("Mix: %s - %s", A, B));
        biConsumer.andThen(newConsumer).accept("Hello", "World!");
    }
}