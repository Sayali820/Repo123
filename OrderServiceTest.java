import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class OrderServiceTest {
    private OrderService service;
    @BeforeEach
    void setup()
    {
        service=new OrderService(1000);
    }
    
    @Test
    void constructorTest()
    {
        assertThrows(IllegalArgumentException.class,()->{
            service=new OrderService(-1000);
        });
    }
    @Test
    void itemTest()
    {
        service.addItem(100);
        service.addItem(200);
        assertEquals(2,service.getItemCount());
        assertThrows(IllegalArgumentException.class,()->{
            service.addItem(-100);
        });
        assertThrows(IllegalArgumentException.class,()->{
            service.addItem(0);
        });

    }
    @Test
    void gettotalTest()
    {
        service.addItem(100);
        service.addItem(200);
        assertEquals(300,service.getTotal());
    }
    @Test
    void discountTest1()
    {
        service.addItem(100);
        service.addItem(200);
        service.getTotal();
        assertEquals(300,service.applyDiscount());
        service.addItem(300);
        service.getTotal();
        assertEquals(540,service.applyDiscount());

    }
    @Test
    void placeTest()
    {
        service.addItem(100);
        service.addItem(200);
        service.getTotal();
        service.applyDiscount();
        service.placeOrder();
        assertEquals(700,service.getBalance());
        assertEquals(0,service.getItemCount());
        assertTrue(service.isOrderPlaced());
    }
    @Test
    void placeTest2()
    {
    assertNull(service.placeOrder());
    }
    @Test
    void placeTest3()
    {
        service.addItem(400);
        service.addItem(800);
        service.getTotal();
        service.applyDiscount();
        assertThrows(IllegalArgumentException.class,()->{
            service.placeOrder();
        });
    }
    
    @AfterEach
    void cleanup()
    {
        service=null;
    }
    @AfterAll
    static void print()
    {
        System.out.println("Testing completed");
    }
    @BeforeAll
    static void printfirst()
    {
        System.out.println("Testing started");
    }



}
