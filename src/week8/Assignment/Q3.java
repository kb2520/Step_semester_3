package week8;

import java.util.*;

interface Delivery {
    double calculateFee();
}

class Standard implements Delivery {
    double weight, distance;

    Standard(double weight, double distance) {
        this.weight = weight;
        this.distance = distance;
    }

    public double calculateFee() {
        return 5 + 0.50 * weight + 0.10 * distance;
    }
}

class Express implements Delivery {
    double weight, distance;

    Express(double weight, double distance) {
        this.weight = weight;
        this.distance = distance;
    }

    public double calculateFee() {
        return 15 + 1.00 * weight + 0.20 * distance;
    }
}

class International implements Delivery {
    double weight, distance, customsFee;

    International(double weight, double distance,
                  double customsFee) {
        this.weight = weight;
        this.distance = distance;
        this.customsFee = customsFee;
    }

    public double calculateFee() {
        return 25 + 2.00 * weight
                + 0.50 * distance + customsFee;
    }
}

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        double total = 0;

        for (int i = 0; i < n; i++) {
            String[] input = sc.nextLine().trim().split("\\s+");
            String type = input[0];

            double weight = Double.parseDouble(input[1]);
            double distance = Double.parseDouble(input[2]);

            Delivery delivery;

            switch (type) {
                case "STANDARD":
                    delivery = new Standard(weight, distance);
                    break;

                case "EXPRESS":
                    delivery = new Express(weight, distance);
                    break;

                default:
                    double customs = Double.parseDouble(input[3]);
                    delivery = new International(
                            weight, distance, customs);
            }

            double fee = delivery.calculateFee();
            total += fee;

            System.out.printf(Locale.US, "%s: %.2f%n",
                    type, fee);
        }

        System.out.printf(Locale.US, "Total: %.2f%n", total);
        sc.close();
    }
}
