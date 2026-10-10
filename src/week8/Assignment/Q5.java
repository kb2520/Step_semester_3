package week8;


import java.util.*;

interface Transport {
    double calculateFare();
}

class Bus implements Transport {
    double distance;

    Bus(double distance) {
        this.distance = distance;
    }

    public double calculateFare() {
        return Math.min(2 + 0.10 * distance, 10);
    }
}

class Train implements Transport {
    double distance;

    Train(double distance) {
        this.distance = distance;
    }

    public double calculateFare() {
        return 3 + 0.15 * distance;
    }
}

class Metro implements Transport {
    double distance, peakHourFactor;

    Metro(double distance, double peakHourFactor) {
        this.distance = distance;
        this.peakHourFactor = peakHourFactor;
    }

    public double calculateFare() {
        return (1.50 + 0.20 * distance) * peakHourFactor;
    }
}

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        double total = 0;

        for (int i = 0; i < n; i++) {
            String[] input = sc.nextLine().trim().split("\\s+");
            String type = input[0];
            double distance = Double.parseDouble(input[1]);

            Transport transport;

            switch (type) {
                case "BUS":
                    transport = new Bus(distance);
                    break;

                case "TRAIN":
                    transport = new Train(distance);
                    break;

                default:
                    double factor = Double.parseDouble(input[2]);
                    transport = new Metro(distance, factor);
            }

            double fare = transport.calculateFare();
            total += fare;

            System.out.printf(Locale.US, "%s: %.2f%n",
                    type, fare);
        }

        System.out.printf(Locale.US, "Total: %.2f%n", total);
        sc.close();
    }
}