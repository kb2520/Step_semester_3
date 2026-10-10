public class Q2 {
    public static void main(String[] args) {
        String word = "level";
        String reversed = new StringBuilder(word).reverse().toString();
        System.out.println(reversed + (word.equals(reversed)
                ? " - palindrome" : " - not a palindrome"));
    }
}
