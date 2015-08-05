package org.arete.lmbdstrm.streams;

import java.io.IOException;
import java.nio.file.FileVisitOption;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.stream.IntStream;

/**
 * Created by rgundapaneni on 7/30/15.
 */
public class StreamSources {

    public static void main(String[] args) throws IOException {

        Collection<String> collection = Arrays.asList("1", "2", "3");
        collection.parallelStream().forEach(System.out::println);

        Arrays.stream(new double[]{ 45.5, 2.8, 5.1 }).forEach(System.out::println);

        System.out.println("Files list method ................");
        Files.list(Paths.get("/Data/Languages")).forEach(System.out::println);

        System.out.println("Files lines method ...............");
        Files.lines(Paths.get("/Data/Languages/Java/Projects/Oracle_Lambda_Streams/src/org/arete/lmbdstrm/streams/GradStudent.java"))
                .forEach(System.out::println);

        System.out.println("Files walk method ................");
        Files.walk(Paths.get("/Data/Middleware/Spring/Spikes/hellospringboot/src/main/resources"), FileVisitOption.FOLLOW_LINKS).forEach(System.out::println);

        IntStream.of(34, 50, 21, 65).forEach(System.out::println);
        IntStream.range(1, 10).forEach(System.out::print);

        Iterator iterator = IntStream.generate(() -> 5).iterator();
        int i = 0;
        while (iterator.hasNext()) {
            System.out.println(iterator.next()); i++;
            if(i > 10) { break; }
        }
    }
}
