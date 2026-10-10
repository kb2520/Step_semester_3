package week8.CLassWork;


import java.util.*;

interface Room {
    double calculateBill();
}

class Single implements Room {
    int units;

    Single(int units) {
        this.units = units;
    }

    public double calculateBill() {
        return units * 8.0;
    }
}

class Shared implements Room {
    int units, occupants;

    Shared(int units, int occupants) {
        this.units = units;
        this.occupants = occupants;
    }

    public double calculateBill() {
        return (units * 6.0) / occupants;
    }
}

class AC implements Room {
    int units;

    AC(int units) {
        this.units = units;
    }

    public double calculateBill() {
        return units * 10.0 + 200;
    }
}

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double total = 0;

        for (int i = 0; i < n; i++) {
            String type = sc.next();
            int units = sc.nextInt();

            Room room;

            switch (type) {
                case "SINGLE":
                    room = new Single(units);
                    break;
                case "SHARED":
                    int occupants = sc.nextInt();
                    room = new Shared(units, occupants);
                    break;
                default:
                    room = new AC(units);
            }

            double bill = room.calculateBill();
            total += bill;

            System.out.printf(Locale.US, "%s: %.2f%n",
                    type, bill);
        }

        System.out.printf(Locale.US, "Total: %.2f%n", total);
        sc.close();
    }
}
