import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BankAccountTest {
    private BankAccount bank;
    @BeforeEach
    void setup()
    {
        bank=new BankAccount(1000);
    }
    @Test
    void constructorTest()
    {
        assertThrows(IllegalArgumentException.class, ()->{
            bank=new BankAccount(-1000);

        });
        
    }
    @Test
    void depositeTest()
    {
        bank.deposit(500);
        assertEquals(1500,bank.getBalance());
        bank.deposit(600);
        assertEquals(2100,bank.getBalance());
        assertThrows(IllegalArgumentException.class,()->{
            bank.deposit(-500);
        });
        assertThrows(IllegalArgumentException.class,()->{
            bank.deposit(0);
        });

    }
    @Test
    void withdrawTest()
    {
        bank.withdraw(500);
        assertEquals(500,bank.getBalance());
        bank.withdraw(500);
        assertEquals(0,bank.getBalance());
        assertThrows(IllegalArgumentException.class,()->{
            bank.withdraw(-500);
        });
        assertThrows(IllegalArgumentException.class,()->{
            bank.withdraw(0);
        });
        assertThrows(IllegalArgumentException.class,()->{
            bank.withdraw(1500);
        });
    }
    @Test
    void multioperation()
    {
        bank.deposit(500);
        assertEquals(1500,bank.getBalance());
        bank.withdraw(500);
        assertEquals(1000,bank.getBalance());
    }
    @AfterEach
    void cleanup()
    {
        bank=null;
    }
    @AfterAll
    static void print()
    {
        System.out.println("Testing is completed");
    }
    @BeforeAll
    static void printfirst()
    {
        System.out.println("Testing begin...");
    }


}
