import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
//simgle char , empty string , space , numerical 
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class PallindromeCheckerTest {
    private PallindromeChecker pallindrome;
    @BeforeEach
    void setup()
    {
        pallindrome=new PallindromeChecker();
    }
    @Test
    @Order(3)
    void pallinTest()
    {
        assertTrue(pallindrome.isPalindrome("abcba"));
        assertTrue(pallindrome.isPalindrome("madam"));
        assertTrue(pallindrome.isPalindrome("12321"));
        assertTrue(pallindrome.isPalindrome("nursesrun"));
        assertTrue(pallindrome.isPalindrome("racecar"));
        assertTrue(pallindrome.isPalindrome(" "));
        //assertTrue(pallindrome.isPalindrome("nurses run"));
        System.out.println("Order 3");
    }
    @Test
    @Order(2)
    void pallinTest2()
    {
        assertFalse(pallindrome.isPalindrome("sayali"));
        assertFalse(pallindrome.isPalindrome("Anushka"));
        System.out.println("Order 2");
    }
    @Test
    @Order(1)
    void nullTest()
    {
        assertThrows(IllegalArgumentException.class, ()->{
            pallindrome.isPalindrome(null);
        });
        System.out.println("Order 1");
    }
    @AfterEach
    void cleanup()
    {
        pallindrome=null;
    }
    @AfterAll
    static void print()
    {
        System.out.println("testing finished");
    }
    @BeforeAll
    static void print2()
    {
        System.out.println("testing begin..");
    }
}
