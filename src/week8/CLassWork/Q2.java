package week8.CLassWork;


import java.util.*;

interface Vehicle {
    double calculateCharge();
}

class Bike implements Vehicle {
    int hours;

    Bike(int hours) {
        this.hours = hours;
    }

    public double calculateCharge() {
        return hours * 10;
    }
}

class Car implements Vehicle {
    int hours;

    Car(int hours) {
        this.hours = hours;
    }

    public double calculateCharge() {
        return 30 + (hours - 1) * 20;
    }
}

class Truck implements Vehicle {
    int hours;

    Truck(int hours) {
        this.hours = hours;
    }

    public double calculateCharge() {
        return Math.max(100, hours * 50);
    }
}

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double total = 0;

        for (int i = 0; i < n; i++) {
            String type = sc.next();
            int hours = sc.nextInt();

            Vehicle vehicle;

            switch (type) {
                case "BIKE":
                    vehicle = new Bike(hours);
                    break;
                case "CAR":
                    vehicle = new Car(hours);
                    break;
                default:
                    vehicle = new Truck(hours);
            }

            double charge = vehicle.calculateCharge();
            total += charge;

            System.out.printf(Locale.US, "%s: %.2f%n",
                    type, charge);
        }

        System.out.printf(Locale.US, "Total: %.2f%n", total);
        sc.close();
    }
}
