package main.java.Week7;
class Scorecard {
    private boolean[] results;
    private final int totalQuestions;
    private int answersRecorded;
    private int score;

    // Constructor
    public Scorecard(int totalQuestions) {
        this.totalQuestions = totalQuestions;
        this.results = new boolean[totalQuestions];
        this.answersRecorded = 0;
        this.score = 0;
    }

    // Record the next answer
    public void recordAnswer(boolean correct) {
        if (answersRecorded < totalQuestions) {
            results[answersRecorded] = correct;

            if (correct) {
                score++;
            }

            answersRecorded++;
        } else {
            System.out.println("Cannot record more answers.");
        }
    }

    // Return only the score
    public int getScore() {
        return score;
    }
}

public class Q2 {
    public static void main(String[] args) {
        Scorecard sc = new Scorecard(4);

        sc.recordAnswer(true);
        sc.recordAnswer(true);
        sc.recordAnswer(false);
        sc.recordAnswer(true);

        System.out.println("Score: " + sc.getScore());
    }
}
