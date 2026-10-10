public class Q5 {
    public static void main(String[] args) {
        int n = 4721, temp = n, sum = 0, reverse = 0;
        while (temp > 0) {
            int digit = temp % 10;
            sum += digit;
            reverse = reverse * 10 + digit;
            temp /= 10;
        }
        System.out.println("Sum of digits: " + sum);
        System.out.println("Reverse: " + reverse);
    }
}
