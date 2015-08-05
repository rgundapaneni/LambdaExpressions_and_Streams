package org.arete.lmbdstrm.streams;

/**
 * Created by rgundapaneni on 7/30/15.
 */
public class GradStudent {

    private long id;
    private String name;
    private int year;
    private int age;

    public GradStudent(long id, String name, int year, int age) {

        this.id = id;
        this.name = name;
        this.year = year;
        this.age = age;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return String.format("%d %s %d %d", id, name, year, age);
    }
}
