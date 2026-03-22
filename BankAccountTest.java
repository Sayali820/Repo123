import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class BankAccountTest {
    private BankAccount acc;
    @BeforeEach
    void setup()
    {
        acc=new BankAccount(1000);
    }
    @Test
    @DisplayName("Checking constructor")
    @Order(2)
    void checkconstructor()
    {
        assertThrows(IllegalArgumentException.class,()->
    {
        new BankAccount(-500);
    });
    System.out.println("Order 2 is constructor");

    }
    @Test
    @DisplayName("checking deposite")
    @Order(1)
    void depositeTest()
    {
        acc.deposit(500);
        assertEquals(1500,acc.getBalance());
        assertThrows(IllegalArgumentException.class,()->{
            acc.deposit(-500);
        });
        System.out.println("Order 1");
    }
    @Test
    @DisplayName("checking withdraw")
    @Order(3)
    void withdrawTest()
    {
        
        assertThrows(IllegalArgumentException.class,()->{
            acc.withdraw(2000);
        });
        acc.withdraw(500);
        assertEquals(500,acc.getBalance());
        assertThrows(IllegalArgumentException.class,()->{
            acc.withdraw(-500);
        });
        assertThrows(IllegalArgumentException.class,()->{
            acc.withdraw(0);
        });
        System.out.println("order 3");

    }
    @Test
    void multioperation()
    {
        acc.withdraw(500);
        acc.deposit(500);
        assertEquals(1000,acc.getBalance());
    }
    @AfterEach
    void cleanup()
    {
        acc=null;
    }
    @AfterAll
    static void print()
    {
        System.out.println("Testing finish");
    }


    
}
