import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MaxFinderTest {
    private MaxFinder max;
    @BeforeEach
    void setup()
    {
        max=new MaxFinder();
    }
    @Test
    void alldiffTest()
    {
        assertEquals(5,max.max(5,3,2));
        assertEquals(10,max.max(-1,10,7));
    }
    @Test
    void allsameTest()
    {
        assertEquals(7,max.max(7,7,7));
        assertEquals(9,max.max(0,9,9));
    }
    @AfterEach
    void cleanup()
    {
        max=null;
    }
}
