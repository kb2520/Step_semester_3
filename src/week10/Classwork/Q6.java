public class Q6 {
    static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= n / i; i++)
            if (n % i == 0) return false;
        return true;
    }
    public static void main(String[] args) {
        int n = 29;
        System.out.println(n + (isPrime(n) ? " is prime" : " is not prime"));
    }
}
