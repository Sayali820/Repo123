import static org.junit.jupiter.api.Assertions.*;

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
    void additemTest()
    {
        service.addItem(100);
        service.addItem(300);
        service.addItem(500);
        assertEquals(3,service.getItemCount());
        assertThrows(IllegalArgumentException.class, ()->{
            service.addItem(-100);
        });
        assertThrows(IllegalArgumentException.class, ()->{
            service.addItem(0);
        });

    }
    @Test
    void discountTest()
    {
        service.addItem(100);
        service.addItem(500);
        service.getTotal();
        assertEquals(540,service.applyDiscount());
        
    }
    @Test
    void notdiscountTest()
    {
        service.addItem(200);
        service.addItem(100);
        assertEquals(300,service.applyDiscount());
    }
    @Test
    void emptyitemTest()
    {
        assertNull(service.placeOrder());
    }
    @Test
    void placedTest()
    {
        service.addItem(100);
        service.addItem(500);
        service.getTotal();
        service.applyDiscount();
        assertNotNull(service);
        assertNotNull(service.placeOrder());
        assertEquals(460,service.getBalance());
        assertTrue(service.isOrderPlaced());
        assertEquals(0,service.getItemCount());

    }
    @Test
    void exceptionTest()
    {
        service.addItem(500);
        service.addItem(800);
        service.getTotal();
        service.applyDiscount();
        assertThrows(IllegalArgumentException.class, ()->
    {
        service.placeOrder();
    });
    }


}
