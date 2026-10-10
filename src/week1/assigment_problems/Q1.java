package main.java.week1.assigment_problems;

public class Q1 {

    public static void checkDuplicateSeats(int[] seatNumbers) {
        boolean duplicateFound = false;

        // Loop through the array to check each seat against subsequent seats
        for (int i = 0; i < seatNumbers.length; i++) {
            boolean alreadyPrinted = false;

            // Check if this duplicate was already reported earlier in the array
            for (int k = 0; k < i; k++) {
                if (seatNumbers[i] == seatNumbers[k]) {
                    alreadyPrinted = true;
                    break;
                }
            }

            if (alreadyPrinted) {
                continue;
            }

            for (int j = i + 1; j < seatNumbers.length; j++) {
                if (seatNumbers[i] == seatNumbers[j]) {
                    System.out.println("Duplicate Seat Number Found: " + seatNumbers[i]);
                    duplicateFound = true;
                    break;
                }
            }
        }

        if (!duplicateFound) {
            System.out.println("No Duplicate Seats Found");
        }
    }

    public static void main(String[] args) {
        int[] test1 = {101, 102, 103, 102, 105};
        int[] test2 = {101, 102, 103, 104, 105};

        checkDuplicateSeats(test1);
        checkDuplicateSeats(test2);
    }
}
