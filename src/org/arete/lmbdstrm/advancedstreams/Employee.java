package org.arete.lmbdstrm.advancedstreams;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;

/**
 * Created by rgundapaneni on 8/4/15.
 */
public class Employee {

    private Long employeeId;
    private String name;
    private LocalDate dateOfBirth;
    private int weight;

    public Employee(Long employeeId, String name, LocalDate dateOfBirth, int weight) {

        this.employeeId = employeeId;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.weight = weight;
    }

    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String toString() {

        return this.employeeId + " - " + this.name + " - " + this.dateOfBirth.format(DateTimeFormatter.ofPattern("MMM dd, yyyy"));
    }

    public static List<Employee> employeeList() {

        Employee emp1 = new Employee(1L, "Phil", LocalDate.of(1980, 6, 15), 160);
        Employee emp2 = new Employee(2L, "Jack", LocalDate.of(1965, 1, 02), 155);
        Employee emp3 = new Employee(3L, "Jill", LocalDate.of(1972, 2, 05), 165);
        Employee emp4 = new Employee(4L, "Joe", LocalDate.of(1984, 4, 9), 145);
        Employee emp5 = new Employee(5L, "John", LocalDate.of(1989, 1, 25), 158);

        return Arrays.asList(emp1, emp2, emp3, emp4, emp5);
    }
}