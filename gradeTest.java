import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;


public class gradeTest {
    private grade gradu;
    @BeforeEach
    void setobject()
    {
        gradu=new grade();
        System.out.println("setting the obj");
    }
    @Test
    @DisplayName("Testing the code")
    void TestforF()
    {
        assertEquals("F",gradu.grade(35));
        System.out.println("F grade expected");
        assertNotEquals("A",gradu.grade(0),"Error msg");
    }
    @RepeatedTest(2)
    void repeatedTest()
    {
        System.out.println("Running");
    }

    @Test
    void TestforD()
    {
        assertEquals("D",gradu.grade(45));
        System.out.println("Grade is D");
        assertNotEquals("A",gradu.grade(46));
        System.out.println("grade should be D");
    }
    @Disabled("not raedy")
    @Test
    void TestforC()
    {
        assertEquals("C",gradu.grade(58));
        assertNotEquals("A",gradu.grade(58));
    }
    @Test
    void TestforB()
    {
        assertEquals("B",gradu.grade(68));
        assertNotEquals("A",gradu.grade(68));
    }
    @Test
    void TestforA()
    {
        assertEquals("A",gradu.grade(79));
        assertNotEquals("C",gradu.grade(89));
    }
    @Test
    void TestforO()
    {
        assertEquals("O",gradu.grade(99));
        assertNotEquals("A",gradu.grade(98));
    }
    @Test
    void Testforneg()
    {
        assertThrows(IllegalArgumentException.class,()->{
            gradu.grade(-11);
        });

    }
    @AfterEach
    void tearDown()
    {
        gradu=null;
    }


}
