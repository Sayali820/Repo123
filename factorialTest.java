import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class factorialTest {
    private static Factorial facto;
    @BeforeEach
    void setupObj()
    {
        facto=new Factorial();
    }
    @Test
    void factorialTest()
    {
        assertEquals(720,facto.factorial(6));
        assertEquals(1,facto.factorial(1));
        assertEquals(1,facto.factorial(0));
        assertThrows(IllegalArgumentException.class, ()->{
            facto.factorial(-11);
        });
        assertEquals(39916800,facto.factorial(11));
    }
    @AfterAll
    static void clean()
    {
        facto=null;
    }

    
}
