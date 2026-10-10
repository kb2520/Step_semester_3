package main.java.week2.class_problems;

public class W2Q3 {

    static void validfileextension(String file) {

        int dot = file.lastIndexOf(".");

        if (dot == -1) {
            System.out.print("Invalid");
            return;
        }

        String ex = file.substring(dot + 1);
        ex = ex.toLowerCase();

        if (ex.equals("pdf") ||
                ex.equals("zip") ||
                ex.equals("docx")) {

            System.out.print("Valid file");

        } else {
            System.out.print("Invalid");
        }
    }

    public static void main(String[] args) {

        validfileextension("Assignment.pdf");
    }
}
