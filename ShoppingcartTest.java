import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class ShoppingcartTest {
    private ShoppingCart cart;
    @BeforeEach
    void setup()
    {
        cart=new ShoppingCart(1000);
    }
    @Test
    @Order(6)
    @DisplayName("constructor checking")
    void constructorcheck()
    {
        assertThrows(IllegalArgumentException.class,()->{
            cart=new ShoppingCart(-1000);
        });
        System.out.println("Order 6");
    }
    @Test
    @Order(5)
    void itremcheck()
    {
        cart.addItem(100);
        cart.addItem(200);
        assertEquals(2,cart.getItemCount());
        assertThrows(IllegalArgumentException.class,()->{
            cart.addItem(-100);
        });
        System.out.println("Order 5");

    }
    @Test
    @Order(4)
    void totalTest()
    {
        cart.addItem(100);
        cart.addItem(200);
        assertEquals(300,cart.getTotal());
        cart.addItem(200);
        assertEquals(500,cart.getTotal());
        System.out.println("Order 4");

    }
    @Test
    void empty()
    {
        assertThrows((IllegalArgumentException.class),()->{
            cart.checkout();
        });
    }
    
    @Test
    @Order(3)
    void checkoutTest()
    {
        cart.addItem(100);
        cart.addItem(200);
        cart.getTotal();
        cart.checkout();
        assertEquals(700,cart.getBalance());
        assertEquals(0,cart.getItemCount());
        System.out.println("Order 3");
    }
    @Test
    @Order(2)
    void checkoutTest2()
    {
        cart.addItem(500);
        cart.addItem(500);
        cart.getTotal();
        cart.checkout();
        assertEquals(0,cart.getBalance());
        assertEquals(0,cart.getItemCount());
        System.out.println("Order 2");
    }
    @Test
    @Order(1)
    void checkoutTest3()
    {
        cart.addItem(500);
        cart.addItem(600);
        double total=cart.getTotal();
        assertTrue(total>cart.getBalance());
        assertThrows(IllegalArgumentException.class, ()->{
            cart.checkout();
        });
        System.out.println("Order 1");
    }
    @AfterEach
    void cleanup()
    {
        cart=null;
    }
    @AfterAll
    static void print()
    {
        System.out.println("Testing finished..");
    }
    @BeforeAll
    static void printfirst()
    {
        System.out.println("Testing begin..");
    }





    
}
