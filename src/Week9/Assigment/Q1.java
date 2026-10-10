package Week9.Assigment;


import java.util.*;

abstract class Customer {
    double amount;

    Customer(double amount) {
        this.amount = amount;
    }

    abstract double finalAmount();
}

class Student extends Customer {
    Student(double amount) {
        super(amount);
    }

    double finalAmount() {
        return amount * 0.90;
    }
}

class Staff extends Customer {
    Staff(double amount) {
        super(amount);
    }

    double finalAmount() {
        return amount * 0.95;
    }
}

class Guest extends Customer {
    Guest(double amount) {
        super(amount);
    }

    double finalAmount() {
        return amount + 10;
    }
}

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Customer[] customers = new Customer[n];
        String[] types = new String[n];

        for (int i = 0; i < n; i++) {
            types[i] = sc.next();
            double amount = sc.nextDouble();

            switch (types[i]) {
                case "STUDENT":
                    customers[i] = new Student(amount);
                    break;
                case "STAFF":
                    customers[i] = new Staff(amount);
                    break;
                case "GUEST":
                    customers[i] = new Guest(amount);
                    break;
            }
        }

        double total = 0;

        for (int i = 0; i < n; i++) {
            double result = customers[i].finalAmount();
            System.out.printf("%s: %.2f%n", types[i], result);
            total += result;
        }

        System.out.printf("Total: %.2f%n", total);
        sc.close();
    }
}


