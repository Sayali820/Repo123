import static org.junit.Assert.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class PrimeCheckerTest {
    private PrimeChecker prime;
    @BeforeEach
    void setup()
    {
        prime=new PrimeChecker();
    }
    @ParameterizedTest
    @ValueSource(ints={3,5,7,11})
    void primeTest(int no)
    {
        assertTrue(prime.isPrime(no));
    }
    @Test
    void repeatedTest()
    {
        assertFalse(prime.isPrime(12));
        assertFalse(prime.isPrime(12));
    }
    @Test
    void notprimeTest()
    {
        assertFalse(prime.isPrime(8));
        assertFalse(prime.isPrime(9));
        assertFalse(prime.isPrime(12));
    }
    @Test
    void prime2()
    {
        assertTrue(prime.isPrime(2));
    }
    @Test
    void prime1()
    {
        assertFalse(prime.isPrime(1));
    }
    @Test
    void prime0()
    {
        assertFalse(prime.isPrime(0));
    }
    @Test
    void negprime()
    {
        assertFalse(prime.isPrime(-3));
    }


}
