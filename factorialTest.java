import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class factorialTest {
    private Factorial fac;
    @BeforeEach
    void setup()
    {
        fac=new Factorial();
    }
    @Test
    @Order(3)
    void factorialTest()
    {
        assertEquals(2,fac.factorial(2));
        assertEquals(720,fac.factorial(6));
        System.out.println("order : 3");
    }
    @Test
    @DisplayName("Testing edge case")
    @Order(1)
    void edgecaseTest()
    {
        assertEquals(1,fac.factorial(0));
        assertEquals(1,fac.factorial(1));
        System.out.println("Order : 1");
    }
    @Test
    @Order(2)
    void negativeTest()
    {
        assertThrows(IllegalArgumentException.class,()->{
            fac.factorial(-2);
        });
        System.out.println("order : 2");
    }
    @AfterEach
    void cleanup()
    {
        fac=null;
    }
    @AfterAll
    static void print()
    {
        System.out.println("Testing is done");
    }
    @BeforeAll
    static void firstprint()
    {
        System.out.println("Testing begin...");
    }



}
