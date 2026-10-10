public class Q9 {
    static boolean isLeapYear(int year) {
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }
    public static void main(String[] args) {
        int[] years = {2024, 1900, 2000};
        for (int year : years)
            System.out.println(isLeapYear(year) ? "Leap year" : "Not a leap year");
    }
}
