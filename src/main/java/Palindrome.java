public class Palindrome {

    public Palindrome(String str) {
        String str1 = str, rev = ""; // Get user input
        int length = str1.length(); // Get input string's length
        for (int i = length - 1; i >= 0; i--) {
            rev = rev + str1.charAt(i); // Checking palindrome by reversing order
        }
        if (str.equals(rev)) {
            System.out.println("\nPalindrome Output: " + str + " is a palindrome\n");
        } else {
            System.out.println("\nPalindrome Output: " + str + " is not a palindrome\n");
        }

    }
}
