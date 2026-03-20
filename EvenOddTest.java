import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.RepeatedTest;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class EvenOddTest {
    private EvenOdd test;
    @BeforeEach
    void setup()
    {
        test=new EvenOdd();
    }
    @RepeatedTest(2)
    void evenoddTest()
    {
        assertEquals("Even",test.checkNumber(2));
        assertEquals("Even",test.checkNumber(42));
        assertEquals("Odd",test.checkNumber(9));
        assertEquals("Odd",test.checkNumber(71));
    }
    @Test
    @Order(1)
    void evenoddTest2()
    {
        assertEquals("Even",test.checkNumber(0));
        assertEquals("Odd",test.checkNumber(1));
        System.out.println("order 1");
    }
    @Test
    void evenoddTest3()
    {
        assertThrows(IllegalArgumentException.class, ()->{
            test.checkNumber(-2);
        });
        assertThrows(IllegalArgumentException.class,()->{
            test.checkNumber(-100);
        });
    }
    @Test
    void evenoddTest4()
    {
        assertEquals("Odd",test.checkNumber(99999));
        assertEquals("Even",test.checkNumber(293847650));
    }
    
}
