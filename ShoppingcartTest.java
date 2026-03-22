import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.RepeatedTest;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class ShoppingcartTest {
    private ShoppingCart cart;
    @BeforeEach
    void setup()
    {
        cart=new ShoppingCart(1000);
    }
    @Test
    void constructorTest()
    {
        assertThrows(IllegalArgumentException.class,()->{
            cart=new ShoppingCart(-1000);
        });
    }
    @Test
    void itemTest()
    {
        cart.addItem(100);
        cart.addItem(200);
        assertEquals(2,cart.getItemCount());
        assertThrows(IllegalArgumentException.class,()->{
            cart.addItem(-100);
        });

    }
    @Test
    void itemsum()
    {
        cart.addItem(100);
        cart.addItem(200);
        assertEquals(300,cart.getTotal());
    }
    @Test
    @DisplayName("Testing checkout functionality")
    @Order(3)
    void checkoutTest()
    {
        cart.addItem(100);
        cart.addItem(200);
        cart.checkout();
        assertEquals(700,cart.getBalance());
        assertEquals(0,cart.getItemCount());
        System.out.println("Order 3");

    }
    @RepeatedTest(2)
    @Order(2)
    void checkoutTest2()
    {
        cart.addItem(1200);
        assertThrows(IllegalArgumentException.class,()->{
            cart.checkout();
        });
        System.out.println("Order 2");
    }
    @Test
    @Order(1)
    void checkoutTest3()
    {
        cart.addItem(1000);
        cart.checkout();
        assertEquals(0,cart.getBalance());
        assertEquals(0,cart.getItemCount());
        System.out.println("Order 1");
    }
    @AfterEach
    void cleanup()
    {
        cart=null;
    }
    @AfterAll
    static void last()
    {
        System.out.println("Finish testing");
    }
    @BeforeAll
    static void first()
    {
        System.out.println("started testing");
    }

}
