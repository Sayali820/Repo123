public class EvenOdd {
    public String checkNumber(int n) {

        // throw exception for negative
        if (n < 0) {
            throw new IllegalArgumentException("Number cannot be negative");
        }

        // ❗ INTENTIONAL BUG:
        // logic reversed
        if (n % 2 == 0) {
            return "Even";   // ❌ wrong
        } else {
            return "Odd";  // ❌ wrong
        }
    }
}
