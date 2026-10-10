package week8;


import java.util.*;

interface Payment {
    double calculate(double amount);
}

class Card implements Payment {
    public double calculate(double amount) {
        return amount + amount * 0.02;
    }
}

class Wallet implements Payment {
    public double calculate(double amount) {
        return amount + amount * 0.01;
    }
}

class BankTransfer implements Payment {
    public double calculate(double amount) {
        return amount;
    }
}

public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        double total = 0;

        for (int i = 0; i < n; i++) {
            String[] input = sc.nextLine().trim().split("\\s+");
            String type = input[0];
            double amount = Double.parseDouble(input[1]);

            Payment payment;

            switch (type) {
                case "CARD":
                    payment = new Card();
                    break;
                case "WALLET":
                    payment = new Wallet();
                    break;
                default:
                    payment = new BankTransfer();
            }

            double adjusted = payment.calculate(amount);
            total += adjusted;

            System.out.printf(Locale.US, "%s: %.2f%n",
                    type, adjusted);
        }

        System.out.printf(Locale.US, "Total: %.2f%n", total);
        sc.close();
    }
}
