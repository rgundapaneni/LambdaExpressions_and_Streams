package org.arete.lmbdstrm.lambda;

import java.util.function.Supplier;

/**
 * Created by rgundapaneni on 7/24/15.
 */
public class SupplierExample {

    public static void main(String[] args) {

        Supplier<Student> studentSupplier = () -> new Student(2015, 90.84);
        System.out.println(studentSupplier.get());
    }
}
