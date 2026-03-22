import static org.junit.jupiter.api.Assertions.*;

import org.junit.Ignore;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class CalculatorTest {
    private Calculator cal;

    @BeforeEach
    void setup()
    {
        cal=new Calculator();
    }
    @Test
    @Order(6)
    void addTest()
    {
        assertEquals(8,cal.add(4, 4));
        assertEquals(928,cal.add(563, 365));
        assertNotEquals(45,cal.add(15, 25));
        assertEquals(3,cal.add(0, 3));
        assertEquals(-5,cal.add(-10, 5));
        assertEquals(-10,cal.add(-5, -5));
        System.out.println("order 6");
    }
    @Test
    @Order(5)
    void subTest()
    {
        assertEquals(5,cal.subtract(10,5));
        assertEquals(0,cal.subtract(5,5));
        assertEquals(-9,cal.subtract(-5,4));
        assertEquals(-6,cal.subtract(-10,-4));
        assertEquals(5,cal.subtract(5,0));
        assertEquals(-5,cal.subtract(0,5));
        System.out.println("order 5");

    }
    @Test
    @Order(4)
    void multiTest()
    {
        assertEquals(16,cal.multiply(4,4));
        assertEquals(-32,cal.multiply(-8,4));
        assertEquals(72,cal.multiply(-9,-8));
        assertEquals(1,cal.multiply(1,1));
        assertEquals(0,cal.multiply(0,12));
        System.out.println("order 4");
    }
    @Test
    @Order(3)
    void multidivide()
    {
        assertEquals(-4,cal.divide(20,-5));
        assertEquals(6,cal.divide(-36,-6));
        assertEquals(0,cal.divide(0,19));
        assertThrows(ArithmeticException.class, ()->{
            cal.divide(9, 0);
        });
        System.out.println("order 3");
    }
    @Test
    @Order(2)
    @Disabled
    void multiopTest()
    {
        assertEquals(12,cal.add(5, 7));
        assertEquals(2,cal.subtract(9,7));
        assertEquals(40,cal.multiply(8,5));
        assertEquals(3,cal.divide(9,3));
        System.out.println("order 2");
    }
    @ParameterizedTest
    @ValueSource(ints={2,4,6,8})
    @Order(1)
    void evenTest(int no)
    {
        assertTrue(cal.isEven(no));
        System.out.println("order 1");
    }
    @AfterEach
    void claenup()
    {
        cal=null;
    }
    @AfterAll
    static void print()
    {
        System.out.println("Finish testing");
    }
    @BeforeAll
    static void printfirst()
    {
        System.out.println("Testing begin..");
    }



}
