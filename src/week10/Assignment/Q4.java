import java.util.*;

public class Q4 {
    // Duty Roster Rotation: O(n) time and O(n) extra space.
    static String[] rotateRoster(String[] names, long k) {
        int n = names.length;
        String[] result = new String[n];
        int shift = (int) (k % n);
        for (int i = 0; i < n; i++) {
            result[(i + shift) % n] = names[i];
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(
            rotateRoster(new String[]{"A", "B", "C", "D", "E"}, 2)));
        System.out.println(Arrays.toString(
            rotateRoster(new String[]{"A", "B", "C", "D", "E"}, 7)));
    }
}
