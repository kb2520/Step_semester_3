package Week9.Assigment;


import java.util.*;

abstract class Room {
    double units;

    Room(double units) {
        this.units = units;
    }

    abstract double bill();
}

class Single extends Room {
    Single(double units) {
        super(units);
    }

    double bill() {
        return units * 8.0;
    }
}

class Shared extends Room {
    int occupants;

    Shared(double units, int occupants) {
        super(units);
        this.occupants = occupants;
    }

    double bill() {
        return units * 6.0 / occupants;
    }
}

class AC extends Room {
    AC(double units) {
        super(units);
    }

    double bill() {
        return units * 10.0 + 200;
    }
}

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Room[] rooms = new Room[n];
        String[] types = new String[n];

        for (int i = 0; i < n; i++) {
            types[i] = sc.next();
            double units = sc.nextDouble();

            switch (types[i]) {
                case "SINGLE":
                    rooms[i] = new Single(units);
                    break;
                case "SHARED":
                    int occupants = sc.nextInt();
                    rooms[i] = new Shared(units, occupants);
                    break;
                case "AC":
                    rooms[i] = new AC(units);
                    break;
            }
        }

        double total = 0;

        for (int i = 0; i < n; i++) {
            double result = rooms[i].bill();
            System.out.printf("%s: %.2f%n", types[i], result);
            total += result;
        }

        System.out.printf("Total: %.2f%n", total);
        sc.close();
    }
}


