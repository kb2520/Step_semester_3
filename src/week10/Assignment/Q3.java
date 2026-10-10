import java.util.*;

public class Q3 {
    // Class Attendance Tracker: O(n) time, O(1) extra space.
    static int[] attendanceSummary(int[] days) {
        int present = 0, streak = 0, longest = 0;
        for (int day : days) {
            if (day == 1) {
                present++;
                streak++;
                longest = Math.max(longest, streak);
            } else {
                streak = 0;
            }
        }
        return new int[]{present, longest};
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(
            attendanceSummary(new int[]{1, 1, 0, 1, 1, 1, 0, 1}))); // [6, 3]
        System.out.println(Arrays.toString(
            attendanceSummary(new int[]{0, 0, 0}))); // [0, 0]
    }
}
