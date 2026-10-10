package week8;


import java.util.*;
import java.time.*;
import java.time.format.*;

abstract class LibraryItem {
    String title;

    LibraryItem(String title) {
        this.title = title;
    }

    abstract int getDays();

    LocalDate getDueDate() {
        return LocalDate.of(2023, 10, 26).plusDays(getDays());
    }
}

class Book extends LibraryItem {
    Book(String title) {
        super(title);
    }

    int getDays() {
        return 14;
    }
}

class DVD extends LibraryItem {
    DVD(String title) {
        super(title);
    }

    int getDays() {
        return 7;
    }
}

class Magazine extends LibraryItem {
    Magazine(String title) {
        super(title);
    }

    int getDays() {
        return 3;
    }
}

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("yyyy-MM-dd");

        for (int i = 0; i < n; i++) {
            String line = sc.nextLine().trim();
            String[] parts = line.split("\\s+", 2);

            String type = parts[0];
            String title = parts[1].replaceAll("^\"|\"$", "");

            LibraryItem item;

            switch (type) {
                case "BOOK":
                    item = new Book(title);
                    break;
                case "DVD":
                    item = new DVD(title);
                    break;
                default:
                    item = new Magazine(title);
            }

            System.out.println(item.title + ": "
                    + item.getDueDate().format(formatter));
        }

        sc.close();
    }
}
