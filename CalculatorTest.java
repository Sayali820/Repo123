import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

public class CalculatorTest {
    private Calculator cal;
    @BeforeEach
    void setObject()
    {
        cal=new Calculator();

    }
    @Test
    @DisplayName("addition test")
    void addTest()
    {
        assertEquals(5,cal.add(2,3));
        assertNotEquals(6,cal.add(2,2));
        assertEquals(-5,cal.add(-10, 5));

    }
    @Test
    void subTest()
    {
        int res=cal.subtract(10, 5);
        assertEquals(5,res);
        assertTrue(res>0);


    }
    @Test
    void multiTest()
    {
        assertEquals(6,cal.multiply(3, 2));
        assertEquals(-8,cal.multiply(-4, 2));
        assertEquals(9,cal.multiply(-3, -3));
    }
    @Test
    public void divideTest()
    {
        assertThrows(ArithmeticException.class, ()->{
            cal.divide(6,0);
        });
        assertEquals(3,cal.divide(6, 2));
    }
    @Test
    void evenTest()
    {
        assertTrue(cal.isEven(-2));
        assertFalse(cal.isEven(5));
        assertTrue(cal.isEven(8),"write even no");
    }
    @Test
    void multipleassertion()
    {
        assertEquals(5,cal.add(5,0));
        assertEquals(0,cal.multiply(5, 0));
        assertEquals(-2, cal.divide(-10, 5));
    }
    @AfterAll
    static void endmsg()
    {
        System.out.println("Test cases finished");
    }


    
}
