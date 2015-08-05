package org.arete.lmbdstrm.lambda;

import java.util.Arrays;
import java.util.List;

/**
 * Created by rgundapaneni on 7/24/15.
 */
public class HighestScoreWithLambdaExpr {

    public static void main(String[] args) {

        List<Student> students = Arrays.asList(new Student(2011, 45.25),
                            new Student(2012, 60.45), new Student(2011, 51.25));

        double max = students.stream().filter(s -> s.getGradYear() == 2012).
                            mapToDouble(s -> s.getScore()).max().getAsDouble();

        System.out.println("Max value with stream is: " + max);
    }
}
