import java.util.Arrays;

public class Q4 {
    public static void main(String[] args) {
        int[] arr = {11, 22, 33, 44};
        int l = 0, r = arr.length - 1;
        while (l < r) {
            int temp = arr[l]; arr[l] = arr[r]; arr[r] = temp;
            l++; r--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
