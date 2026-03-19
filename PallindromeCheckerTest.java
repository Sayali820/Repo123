import static org.junit.Assert.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PallindromeCheckerTest {
    private PallindromeChecker pallindrome;
    @BeforeEach
    void setup()
    {
        pallindrome=new PallindromeChecker();
    }
    @Test
    void pallindromeTest()
    {
        assertTrue(pallindrome.isPalindrome("madam"));
        assertFalse(pallindrome.isPalindrome("Sos"));
        assertTrue(pallindrome.isPalindrome("nursesrun"));
        assertTrue(pallindrome.isPalindrome("a"));
    }
    @Test
    void pallindromeTest2()
    {
        assertFalse(pallindrome.isPalindrome("Hello"));
        assertFalse(pallindrome.isPalindrome("sayali"));
    }
    @Test
    void pallindromeTest3()
    {
        assertThrows(IllegalArgumentException.class,()->{
            pallindrome.isPalindrome(null);
        });
    }
    @AfterEach
    void cleanup()
    {
        pallindrome=null;
    }
}
