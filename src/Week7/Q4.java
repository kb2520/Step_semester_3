package main.java.Week7;

class Locker {
    private String code;
    private final int lockerNumber;

    // Constructor
    public Locker(int lockerNumber, String code) {
        this.lockerNumber = lockerNumber;
        this.code = code;
    }

    // Change code only if current code is correct
    public void changeCode(String currentCode, String newCode) {
        if (code.equals(currentCode)) {
            code = newCode;
            System.out.println("Code changed successfully.");
        } else {
            System.out.println("Wrong current code. Change rejected.");
        }
    }

    // Locker number can be read
    public int getLockerNumber() {
        return lockerNumber;
    }
}

public class Q4 {
    public static void main(String[] args) {
        Locker l = new Locker(101, "1234");

        l.changeCode("1234", "5678");
        l.changeCode("0000", "9999");
    }
}
