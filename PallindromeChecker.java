public class PallindromeChecker {
    public boolean isPalindrome(String s) {

        // handle null case
        if (s == null) {
            throw new IllegalArgumentException("Input cannot be null");
        }

        // reverse string
        String reversed = new StringBuilder(s).reverse().toString();

        // compare original and reversed
        return s.equals(reversed);
    }
}
