import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class StringReversalTest {
    private StringReversal reverse;
    @BeforeEach
    void setup()
    {
        reverse=new StringReversal();
    }
    @Test
    void checkreverse()
    {
        assertEquals("ilayas",reverse.reverse("sayali"));
        assertEquals("ilayaS",reverse.reverse("Sayali"));
        assertEquals("yppah ma I",reverse.reverse("I am happy"));

    }
    @Test
    void checknonreverse()
    {
        assertNotEquals("heheh",reverse.reverse("hahah"));

    }
    @Test
    void checkno()
    {
        assertEquals("1234",reverse.reverse("4321"));
    }
    @Test
    void checksymbol()
    {
        assertEquals("Sayali@",reverse.reverse("@ilayaS"));
    }
    @Test
    void checkspace()
    {
        assertEquals(" ",reverse.reverse(" "));
        assertEquals("",reverse.reverse(""));
    }
    @Test
    void checkchar()
    {
        assertEquals("a",reverse.reverse("a"));
    }
    @Test
    void exception()
    {
        assertThrows(IllegalArgumentException.class, ()->{
            reverse.reverse(null);
        });
    }

}
