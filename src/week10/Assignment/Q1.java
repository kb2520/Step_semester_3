import java.util.*;

public class Q1 {
    // Exam Score Band Counter: O(log n), O(1) extra space.
    static int lowerBound(int[] a, int x) {
        int l = 0, r = a.length;
        while (l < r) {
            int m = l + (r - l) / 2;
            if (a[m] < x) l = m + 1;
            else r = m;
        }
        return l;
    }

    static int upperBound(int[] a, int x) {
        int l = 0, r = a.length;
        while (l < r) {
            int m = l + (r - l) / 2;
            if (a[m] <= x) l = m + 1;
            else r = m;
        }
        return l;
    }

    static int countInBand(int[] scores, int low, int high) {
        return upperBound(scores, high) - lowerBound(scores, low);
    }

    public static void main(String[] args) {
        int[] scores = {35, 42, 42, 50, 58, 58, 58, 63, 71, 88};
        System.out.println(countInBand(scores, 42, 58)); // 6
        System.out.println(countInBand(scores, 90, 100)); // 0
    }
}
