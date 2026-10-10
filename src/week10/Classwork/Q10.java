import java.util.Locale;

public class Q10 {
    static class Student {
        String name;
        int[] marks;
        Student(String name, int[] marks) { this.name = name; this.marks = marks; }
        double average() {
            int total = 0;
            for (int mark : marks) total += mark;
            return (double) total / marks.length;
        }
        char grade() {
            double a = average();
            if (a >= 75) return 'B';
            if (a >= 60) return 'C';
            if (a >= 40) return 'D';
            return 'F';
        }
        void printResult() {
            System.out.printf(Locale.US, "%s: Average %.1f, Grade %c%n",
                    name.toUpperCase(), average(), grade());
        }
    }
    public static void main(String[] args) {
        new Student("Asha", new int[]{80, 90, 70}).printResult();
        new Student("Ravi", new int[]{60, 55, 50}).printResult();
    }
}
