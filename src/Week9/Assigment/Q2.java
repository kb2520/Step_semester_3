package Week9.Assigment;

import java.util.*;

abstract class Vehicle {
    int hours;

    Vehicle(int hours) {
        this.hours = hours;
    }

    abstract double charge();
}

class Bike extends Vehicle {
    Bike(int hours) {
        super(hours);
    }

    double charge() {
        return hours * 10.0;
    }
}

class Car extends Vehicle {
    Car(int hours) {
        super(hours);
    }

    double charge() {
        return 30 + (hours - 1) * 20.0;
    }
}

class Truck extends Vehicle {
    Truck(int hours) {
        super(hours);
    }

    double charge() {
        return Math.max(hours * 50.0, 100.0);
    }
}

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Vehicle[] vehicles = new Vehicle[n];
        String[] types = new String[n];

        for (int i = 0; i < n; i++) {
            types[i] = sc.next();
            int hours = sc.nextInt();

            switch (types[i]) {
                case "BIKE":
                    vehicles[i] = new Bike(hours);
                    break;
                case "CAR":
                    vehicles[i] = new Car(hours);
                    break;
                case "TRUCK":
                    vehicles[i] = new Truck(hours);
                    break;
            }
        }

        double total = 0;

        for (int i = 0; i < n; i++) {
            double result = vehicles[i].charge();
            System.out.printf("%s: %.2f%n", types[i], result);
            total += result;
        }

        System.out.printf("Total: %.2f%n", total);
        sc.close();
    }
}


