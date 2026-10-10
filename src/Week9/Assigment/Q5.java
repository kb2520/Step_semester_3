package Week9.Assigment;


import java.util.*;
import java.time.LocalDate;

abstract class Plan {
    String name;
    LocalDate startDate;

    Plan(String name, LocalDate startDate) {
        this.name = name;
        this.startDate = startDate;
    }

    abstract int validity();

    LocalDate renewalDate() {
        return startDate.plusDays(validity());
    }
}

class Basic extends Plan {
    Basic(String name, LocalDate startDate) {
        super(name, startDate);
    }

    int validity() {
        return 30;
    }
}

class Standard extends Plan {
    Standard(String name, LocalDate startDate) {
        super(name, startDate);
    }

    int validity() {
        return 90;
    }
}

class Premium extends Plan {
    Premium(String name, LocalDate startDate) {
        super(name, startDate);
    }

    int validity() {
        return 365;
    }
}

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Plan[] plans = new Plan[n];

        for (int i = 0; i < n; i++) {
            String type = sc.next();
            String name = sc.next();
            LocalDate date = LocalDate.parse(sc.next());

            switch (type) {
                case "BASIC":
                    plans[i] = new Basic(name, date);
                    break;
                case "STANDARD":
                    plans[i] = new Standard(name, date);
                    break;
                case "PREMIUM":
                    plans[i] = new Premium(name, date);
                    break;
            }
        }

        for (Plan p : plans) {
            System.out.printf("%s: %s%n",
                    p.name, p.renewalDate());
        }

        sc.close();
    }
}

