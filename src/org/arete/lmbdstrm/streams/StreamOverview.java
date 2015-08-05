package org.arete.lmbdstrm.streams;

import java.util.Arrays;
import java.util.List;

/**
 * Created by rgundapaneni on 7/30/15.
 */
public class StreamOverview {

    public static void main(String[] args) {

        List<GradStudent> students = Arrays.asList(new GradStudent(1, "Jack", 2011, 21), new GradStudent(1, "Jill", 2014, 24),
                new GradStudent(1, "McDonald", 2012, 20));

        students.stream().filter(gs -> gs.getYear() > 2010).forEach(gs -> System.out.println(gs));

        System.out.println(
                students.stream().filter(gs -> gs.getYear() > 2011).mapToInt(gs -> gs.getAge()).sum() );

        System.out.println(students.stream().filter(gs -> gs.getYear() > 2010).
                map(gs -> gs.getAge()).max((x, y) -> x > y? 1:-1).get());
    }

}