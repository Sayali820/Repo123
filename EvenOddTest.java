import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

public class EvenOddTest {
    private EvenOdd no;
    @BeforeEach
    void setup()
    {
        no=new EvenOdd();
    }
    @ParameterizedTest
    @ValueSource(ints={4,6,8,10})
    void evenTest(int n)
    {
        assertEquals("Even",no.checkNumber(n));
    }
    @ParameterizedTest
    @ValueSource(ints={1,3,5,17})
    void oddTest(int n)
    {
        assertEquals("Odd",no.checkNumber(n));
    }
    @Test
    void edgeTest()
    {
        assertEquals("Even",no.checkNumber(0));
        assertEquals("Odd",no.checkNumber(9099));
        assertEquals("Even",no.checkNumber(6884));
    }
    @Test
    void multiTest()
    {
        assertEquals("Even",no.checkNumber(0));
        assertEquals("Odd",no.checkNumber(1));
        assertEquals("Even",no.checkNumber(2));
    }
    @Test
    void negTest()
    {
        assertThrows(IllegalArgumentException.class, ()->{
            no.checkNumber(-9);
        });
        assertThrows(IllegalArgumentException.class, ()->{
            no.checkNumber(-10);
        });

    }
    @AfterEach
    void cleanup()
    {
        no=null;
    }
    @AfterAll
    static void print()
    {
        System.out.println("Testing finished");
    }
    @BeforeAll
    static void printfirst()
    {
        System.out.println("Testing begin..");
    }



}
