import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class PasswordValidatorTest {
    private PasswordValidator password;
    @BeforeEach
    void setup()
    {
        password=new PasswordValidator();

    }
    @Test
    @Order(4)
    void validpasswordTest()
    {
        assertTrue(password.isValid("Sayali08"));
        assertTrue(password.isValid("pranavPatil9"));
        assertTrue(password.isValid("Sayalideore08@"));
        System.out.println("order 4");
    }
    @Test
    @Order(3)
    void validpasswordTest2()
    {
        assertTrue(password.isValid("SAYALIDEORE08@"));
        System.out.println("order 3");

    }
    @Test
    @Order(2)
    void validpasswordTest3()
    {
        assertFalse(password.isValid("56789643"));
        System.out.println("order 2");

    }
    @Test
    @Order(1)
    void validpasswordTest4()
    {
        assertFalse(password.isValid("Sau08"));
        assertFalse(password.isValid("Sayalideore"));
        assertFalse(password.isValid("sayalideore08"));
        assertFalse(password.isValid(""));
        assertFalse(password.isValid(null));
        System.out.println("order 1");
    }
    @AfterEach
    void cleanup()
    {
        password=null;
    }


}
