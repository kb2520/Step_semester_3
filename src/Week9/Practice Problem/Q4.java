package Week9;


import java.util.*;

abstract class Connection {
    double units;

    Connection(double units) {
        this.units = units;
    }

    abstract double bill();
}

class Home extends Connection {
    Home(double units) {
        super(units);
    }

    double bill() {
        if (units <= 100) {
            return units * 5;
        } else {
            return 100 * 5 + (units - 100) * 7;
        }
    }
}

class Shop extends Connection {
    Shop(double units) {
        super(units);
    }

    double bill() {
        return units * 8 + 100;
    }
}

class Factory extends Connection {
    Factory(double units) {
        super(units);
    }

    double bill() {
        return Math.max(units * 6, 1000);
    }
}

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Connection[] connections = new Connection[n];
        double total = 0;

        for (int i = 0; i < n; i++) {
            String type = sc.next();
            double units = sc.nextDouble();

            switch (type) {
                case "HOME":
                    connections[i] = new Home(units);
                    break;

                case "SHOP":
                    connections[i] = new Shop(units);
                    break;

                case "FACTORY":
                    connections[i] = new Factory(units);
                    break;
            }
        }

        for (int i = 0; i < n; i++) {
            double amount = connections[i].bill();

            String type;
            if (connections[i] instanceof Home) {
                type = "HOME";
            } else if (connections[i] instanceof Shop) {
                type = "SHOP";
            } else {
                type = "FACTORY";
            }

            System.out.printf("%s: %.2f%n", type, amount);
            total += amount;
        }

        System.out.printf("Total: %.2f%n", total);
        sc.close();
    }
}


