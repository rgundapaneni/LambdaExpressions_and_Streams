package org.arete.lmbdstrm.advancedstreams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by rgundapaneni on 8/4/15.
 */
public class CollectorsExample {

    public static void main(String[] args) {

        System.out.println(Stream.of(35, 15, 28, 90).collect(Collectors.toList()));

        List<Employee> list = Employee.employeeList().stream().filter(e -> e.getDateOfBirth().getYear() > 1975)
                .collect(Collectors.toCollection(ArrayList::new));
        System.out.println(list);

        System.out.println(Stream.of(35, 15, 28, 90, 15, 28).collect(Collectors.toSet()));

        Map<Long, String> employeeMap = Employee.employeeList().stream().
                            collect(Collectors.toMap(e -> e.getEmployeeId(), e -> e.getName()));
        System.out.println(employeeMap);

        List<String> words = Arrays.asList("Get", "Put", "Carry", "Baggage", "Sit", "Done", "Read");
        Map map1 = words.stream().collect(Collectors.groupingBy(String::length));
        System.out.println(map1);
        Map map2 = words.stream().collect(Collectors.groupingBy(String::length, Collectors.counting()));
        System.out.println(map2);

        String wordConcat = words.stream().collect(Collectors.joining(", ", "-> :: ", " ::"));
        System.out.println(wordConcat);

        double averageWeight = Employee.employeeList().stream().collect(Collectors.averagingInt(e -> e.getWeight()));
        System.out.println(averageWeight);

        IntSummaryStatistics intSummaryStatistics = Employee.employeeList().stream()
                                    .collect(Collectors.summarizingInt(e -> e.getWeight()));
        System.out.println(intSummaryStatistics);

        Map<Boolean, List<Employee>> partition = Employee.employeeList().stream()
                        .collect(Collectors.partitioningBy(e -> e.getName().endsWith("l")));
        System.out.println(partition);

        Map map = Employee.employeeList().stream().collect(Collectors.groupingBy(
                e -> e.getName().charAt(e.getName().length() - 1),
                Collectors.mapping(em -> em.getDateOfBirth().getYear(), Collectors.toSet())
        ));
        System.out.println(map);

        Optional value = Stream.of(35, 15, 28, 90).collect(Collectors.reducing( (x, y) -> y));
        System.out.println(value.get());
    }
}
