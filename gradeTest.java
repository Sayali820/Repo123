import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class gradeTest {
    private grade gradu;
    @BeforeEach
    void setup()
    {
        gradu=new grade();
    }
    @Test
    @Order(9)
    void testforF()
    {
        assertEquals("F",gradu.grade(38));
        assertEquals("F",gradu.grade(20));
        assertEquals("F",gradu.grade(0));
        System.out.println("Order : 9");
    }
    @Test
    @Order(8)
    void testforD()
    {
        assertEquals("D",gradu.grade(41));
        assertEquals("D",gradu.grade(45));
        assertNotEquals("D",gradu.grade(0));
        System.out.println("Order : 8");
    }
    @Test
    @Order(7)
    void testforC()
    {
        assertEquals("C",gradu.grade(56));
        assertEquals("C",gradu.grade(58));
        assertNotEquals("C",gradu.grade(60));
        System.out.println("Order : 7");
    }
    @Test
    @Order(6)
    void testforB()
    {
        assertEquals("B",gradu.grade(65));
        assertNotEquals("B",gradu.grade(78));
        System.out.println("Order : 6");
    }
    @Test
    @Order(5)
    void testforA()
    {
        assertEquals("A",gradu.grade(78));
        assertNotEquals("A",gradu.grade(91));
        System.out.println("Order : 5");
    }
    @Test
    @Order(4)
    void testforA2()
    {
        assertEquals("A+",gradu.grade(89));
        assertNotEquals("A+",gradu.grade(50));
        System.out.println("Order : 4");
    }
    @Test
    @Order(3)
    void testforO()
    {
        assertEquals("O",gradu.grade(98));
        assertNotEquals("O",gradu.grade(89));
        System.out.println("Order : 3");
    }
    @Test
    @Order(2)
    void negTest()
    {
        assertThrows(IllegalArgumentException.class, ()->{
            gradu.grade(-67);
        });
        System.out.println("Order : 2");
    }
    @Test
    @Order(1)
    void edgecase()
    {
        assertEquals("F",gradu.grade(0));
        assertEquals("D",gradu.grade(40));
        assertEquals("C",gradu.grade(50));
        assertEquals("B",gradu.grade(60));
        assertEquals("A",gradu.grade(70));
        assertEquals("A+",gradu.grade(80));
        assertEquals("O",gradu.grade(90));
        System.out.println("Order : 1");
    }
    @AfterEach
    void cleanup()
    {
        gradu=null;
    }
    @AfterAll
    static void print()
    {
        System.out.println("testing finished..");
    }
    @BeforeAll
    static void printfirst()
    {
        System.out.println("Testing begin..");
    }

}

