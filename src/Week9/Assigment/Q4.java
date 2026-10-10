package Week9.Assigment;


import java.util.*;

abstract class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    abstract double bonus();
}

class FullTime extends Employee {
    FullTime(String name, double salary) {
        super(name, salary);
    }

    double bonus() {
        return salary * 0.10;
    }
}

class PartTime extends Employee {
    PartTime(String name, double salary) {
        super(name, salary);
    }

    double bonus() {
        return salary * 0.05;
    }
}

class Intern extends Employee {
    Intern(String name, double salary) {
        super(name, salary);
    }

    double bonus() {
        return 2000.0;
    }
}

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Employee[] employees = new Employee[n];

        for (int i = 0; i < n; i++) {
            String type = sc.next();
            String name = sc.next();
            double salary = sc.nextDouble();

            switch (type) {
                case "FULLTIME":
                    employees[i] = new FullTime(name, salary);
                    break;
                case "PARTTIME":
                    employees[i] = new PartTime(name, salary);
                    break;
                case "INTERN":
                    employees[i] = new Intern(name, salary);
                    break;
            }
        }

        double total = 0;

        for (Employee e : employees) {
            double result = e.bonus();
            System.out.printf("%s: %.2f%n", e.name, result);
            total += result;
        }

        System.out.printf("Total Bonus: %.2f%n", total);
        sc.close();
    }
}
