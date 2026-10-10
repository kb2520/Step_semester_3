package main.java.week5.class_problems;
import java.util.Arrays;

class Candidate implements Comparable<Candidate> {

    String name;
    double cgpa;
    int codingScore;

    // Constructor
    Candidate(String name, double cgpa, int codingScore) {
        this.name = name;
        this.cgpa = cgpa;
        this.codingScore = codingScore;
    }

    // Eligibility using only CGPA
    static boolean isEligible(double cgpa) {
        return cgpa >= 7.5;
    }

    // Eligibility using CGPA + coding score
    static boolean isEligible(double cgpa, int codingScore) {
        return cgpa >= 6.5 && codingScore >= 60;
    }

    // Composite score
    double getScore() {
        return cgpa * 10 + codingScore;
    }

    // Sort in descending order
    public int compareTo(Candidate other) {
        return Double.compare(other.getScore(), this.getScore());
    }
}

public class Q5 {

    static String shortlistAndRank(Candidate[] candidates) {

        Candidate[] selected = new Candidate[candidates.length];
        int count = 0;

        // Shortlisting
        for (int i = 0; i < candidates.length; i++) {

            if (Candidate.isEligible(candidates[i].cgpa) ||
                    Candidate.isEligible(
                            candidates[i].cgpa,
                            candidates[i].codingScore
                    )) {

                selected[count] = candidates[i];
                count++;
            }
        }

        // Sort shortlisted candidates
        Arrays.sort(selected, 0, count);

        // Create output
        String result = "";

        for (int i = 0; i < count; i++) {

            result = result
                    + (i + 1)
                    + ". "
                    + selected[i].name
                    + " ("
                    + selected[i].getScore()
                    + ")";

            if (i < count - 1) {
                result = result + " | ";
            }
        }

        return result;
    }

    public static void main(String[] args) {

        Candidate[] candidates = {
                new Candidate("Aisha", 8.2, 40),
                new Candidate("Rohit", 6.8, 65),
                new Candidate("Meena", 6.0, 90),
                new Candidate("Karan", 7.5, 20)
        };

        System.out.println(shortlistAndRank(candidates));
    }
}
