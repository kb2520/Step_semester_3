package week8.CLassWork;


import java.util.*;

interface Customer {
    double calculateAmount(double amount);
}

class Student implements Customer {
    public double calculateAmount(double amount) {
        return amount * 0.90;
    }
}

class Staff implements Customer {
    public double calculateAmount(double amount) {
        return amount * 0.95;
    }
}

class Guest implements Customer {
    public double calculateAmount(double amount) {
        return amount + 10;
    }
}

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double total = 0;

        for (int i = 0; i < n; i++) {
            String type = sc.next();
            double amount = sc.nextDouble();

            Customer customer;

            switch (type) {
                case "STUDENT":
                    customer = new Student();
                    break;
                case "STAFF":
                    customer = new Staff();
                    break;
                default:
                    customer = new Guest();
            }

            double result = customer.calculateAmount(amount);
            total += result;

            System.out.printf(Locale.US, "%s: %.2f%n", type, result);
        }

        System.out.printf(Locale.US, "Total: %.2f%n", total);
        sc.close();
    }
}
