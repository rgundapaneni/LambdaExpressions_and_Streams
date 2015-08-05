package org.arete.lmbdstrm.lambda;

/**
 * Created by rgundapaneni on 7/24/15.
 */
public class Student {

    public Student(int gradYear, double score) {

        this.gradYear = gradYear;
        this.score = score;
    }

    public int getGradYear() {
        return gradYear;
    }

    public void setGradYear(int gradYear) {
        this.gradYear = gradYear;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    private int gradYear;
    private double score;

    public String toString() {
        return String.format("%d - %.2f", gradYear, score);
    }
}
