public class PrimeChecker {
    public boolean isPrime(int n) {

        // handle edge cases
        if (n <= 1) {
            return false;
        }

        // check divisibility
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
    
}
