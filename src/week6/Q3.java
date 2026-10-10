package main.java.week6;


class Course {

    private String code;
    private String title;
    private int credits;
    private int labCredits;

    // Four-argument constructor
    public Course(String code, String title, int credits, int labCredits) {
        this.code = code;
        this.title = title;
        this.credits = credits;
        this.labCredits = labCredits;
    }

    // Three-argument constructor
    // Calls the four-argument constructor using this()
    public Course(String code, String title, int credits) {
        this(code, title, credits, 0);
    }

    // Method to calculate total credits
    public int totalCredits() {
        return credits + labCredits;
    }
}

public class Q3 {

    public static void main(String[] args) {

        // Theory-only course
        Course c1 = new Course("21CSC201J", "Data Structures", 4);

        // Course with lab
        Course c2 = new Course("21CSC205L", "DSA Lab", 3, 1);

        System.out.println("21CSC201J total credits: " + c1.totalCredits());
        System.out.println("21CSC205L total credits: " + c2.totalCredits());
    }
}


