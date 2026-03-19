import static org.junit.Assert.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PrimeCheckerTest {
    private PrimeChecker prime;
    @BeforeEach
    void setup()
    {
        prime=new PrimeChecker();

    }
    @Test
    void primeTest()
    {
        assertTrue(prime.isPrime(3));
        assertTrue(prime.isPrime(7));
        assertTrue(prime.isPrime(11));
    }
    @Test
    void notprimeTest()
    {
        assertFalse(prime.isPrime(4));
        assertFalse(prime.isPrime(9));
        assertFalse(prime.isPrime(-3));
    }
    @Test
    void testforone()
    {
        assertFalse(prime.isPrime(1));
    }
    @Test
    void testfor0()
    {
        assertFalse(prime.isPrime(0));
    }
    @AfterEach
    void cleanup()
    {
        prime=null;
    }

}
