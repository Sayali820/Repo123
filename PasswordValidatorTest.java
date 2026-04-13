import static org.junit.Assert.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PasswordValidatorTest {
    private PasswordValidator password;
    @BeforeEach
    void setup()
    {
        password=new PasswordValidator();
    }
    @Test
    void passwordTest()
    {
        assertTrue(password.isValid("Sayalideore08@"));
        assertTrue(password.isValid("pranavPatil98"));
    }
    @Test
    void falsepasswordTest()
    {
        assertFalse(password.isValid("12345"));
        assertFalse(password.isValid("Sayali"));
        assertFalse(password.isValid("Sau87"));
    }
    @Test
    void checkcondition()
    {
        assertFalse(password.isValid(null));

    }

}
