package org.arete.lmbdstrm.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * Created by rgundapaneni on 7/24/15.
 */
public class HighestScoreImperative {

    public static void main(String[] args) {

        List<Student> students = Arrays.asList(new Student(2011, 45.25), new Student(2012, 60.45),
                                                                    new Student(2011, 51.25));

        double highestScore = 0.0;
        for (Student student : students) {

            if (highestScore < student.getScore() && student.getGradYear() == 2011) {
                highestScore = student.getScore();
            }
        }

        System.out.println("Highest score using imperative method is: " + highestScore);

        System.out.println(
                students.stream().filter(new Predicate<Student>() {

                    public boolean test(Student student) {
                        return student.getGradYear() == 2011;
                    }
                }).map(new Function<Student, Object>() {

                    public Object apply(Student student) {
                        return student.getScore();
                    }
                }).reduce(new BinaryOperator<Object>() {

                    public Object apply(Object o, Object o2) {
                        return o.toString() + " - " + o2.toString();
                    }
                })
        );
    }
}
