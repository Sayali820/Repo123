import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.params.provider.ValueSources;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class AreaCalculatorTest {
    private AreaCalculator area;
    @BeforeEach
    void setup()
    {
        area=new AreaCalculator();
    }
    @Test
    @Order(4)
    void squareAreaTest(int no)
    {
        System.out.println("order 4");
        assertEquals(25,area.squareArea(5));
        assertEquals(81,area.squareArea(9));
        assertNotEquals(37,area.squareArea(6));
        assertThrows(IllegalArgumentException.class, ()->{
            area.squareArea(-2);
        });
        assertThrows(IllegalArgumentException.class, ()->{
            area.squareArea(0);
        });
    }
    @Test
    @Order(3)
    void rectangleAreaTest()
    {
        System.out.println("order 3");
        assertEquals(24,area.rectangleArea(6,4));
        assertEquals(35.84,area.rectangleArea(5.6,6.4),0.01);
        assertThrows(IllegalArgumentException.class, ()->{
            area.rectangleArea(-8,-9);
        });
        assertThrows(IllegalArgumentException.class, ()->{
            area.rectangleArea(-8,9);
        });
        assertThrows(IllegalArgumentException.class, ()->{
            area.rectangleArea(8,-9);
        });
        assertThrows(IllegalArgumentException.class, ()->{
            area.rectangleArea(0,-9);
        });
    }
    @Test
    @Order(2)
    void traingleAreaTest()
    {
        System.out.println("order 2");
        assertEquals(12,area.triangleArea(6,4));
        assertEquals(15.575,area.triangleArea(3.5,8.9),0.001);
        assertThrows(IllegalArgumentException.class, ()->{
            area.triangleArea(-6,3);

        });
        assertThrows(IllegalArgumentException.class, ()->{
            area.triangleArea(-6,-3);

        });
        assertThrows(IllegalArgumentException.class, ()->{
            area.triangleArea(0,3);

        });
        assertThrows(IllegalArgumentException.class, ()->{
            area.triangleArea(6,-3);

        });
    }
    @Test
    @Order(1)
    void circleareaTest()
    {
        System.out.println("order 1");
        assertEquals(78.5,area.circleArea(5));
        assertEquals(84.9056,area.circleArea(5.2));
        assertThrows(IllegalArgumentException.class, ()->
    {
        area.circleArea(-2);
    });
    }

}
