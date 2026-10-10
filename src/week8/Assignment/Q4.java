package week8;


import java.util.*;
import java.util.regex.*;

abstract class Question {
    String correctAnswer;
    String studentAnswer;
    double points;

    Question(String correctAnswer, String studentAnswer,
             double points) {
        this.correctAnswer = correctAnswer;
        this.studentAnswer = studentAnswer;
        this.points = points;
    }

    abstract double grade();
}

class MCQ extends Question {
    MCQ(String correct, String student, double points) {
        super(correct, student, points);
    }

    double grade() {
        return correctAnswer.equals(studentAnswer) ? points : 0;
    }
}

class TF extends Question {
    TF(String correct, String student, double points) {
        super(correct, student, points);
    }

    double grade() {
        return correctAnswer.equals(studentAnswer) ? points : 0;
    }
}

class Essay extends Question {
    Essay(String correct, String student, double points) {
        super(correct, student, points);
    }

    double grade() {
        String[] keywords = correctAnswer.split(",");
        String answer = studentAnswer.toLowerCase();
        int count = 0;

        for (String keyword : keywords) {
            if (answer.contains(keyword.trim().toLowerCase())) {
                count++;
            }
        }

        if (count >= 2) {
            return points * 0.75;
        } else if (count == 1) {
            return points * 0.50;
        } else {
            return 0;
        }
    }
}

public class Q4 {
    static String[] parseLine(String line) {
        Matcher matcher = Pattern.compile(
                "\"([^\"]*)\"|(\\S+)"
        ).matcher(line);

        ArrayList<String> tokens = new ArrayList<>();

        while (matcher.find()) {
            if (matcher.group(1) != null) {
                tokens.add(matcher.group(1));
            } else {
                tokens.add(matcher.group(2));
            }
        }

        return tokens.toArray(new String[0]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        double total = 0;

        for (int i = 0; i < n; i++) {
            String[] input = parseLine(sc.nextLine());

            String type = input[0];
            String correct = input[2];
            String student = input[3];
            double points = Double.parseDouble(input[4]);

            Question question;

            switch (type) {
                case "MCQ":
                    question = new MCQ(correct, student, points);
                    break;

                case "TF":
                    question = new TF(correct, student, points);
                    break;

                default:
                    question = new Essay(correct, student, points);
            }

            double score = question.grade();
            total += score;

            System.out.printf(Locale.US, "%s: %.2f%n",
                    type, score);
        }

        System.out.printf(Locale.US,
                "Total Score: %.2f%n", total);

        sc.close();
    }
}
