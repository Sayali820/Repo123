import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class StringReversalTest {
    private StringReversal reverse;
    @BeforeEach
    void setup()
    {
    reverse=new StringReversal();
    }
    @Test
    @Order(3)
    void reverseTest()
    {
        assertEquals("ilayas",reverse.reverse("sayali"));
        assertEquals("1234",reverse.reverse("4321"));
        System.out.println("order 3");
    }
    @Test
    @Order(1)
    void reverseTest2()
    {
        assertEquals("a",reverse.reverse("a"));
        assertEquals("",reverse.reverse(""));
        System.out.println("order 1");
    }
    @Test
    @Order(2)
    @DisplayName("Exception check")
    void reverseTest3()
    {
        System.out.println("order 2");
        assertThrows(IllegalArgumentException.class, ()->{
            reverse.reverse(null);
            System.out.println("order 2");
        });
    }
    @AfterEach
    void cleanup()
    {
        reverse=null;
    }
    
}
