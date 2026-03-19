import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class demoTest {
    @DisplayName("what saying")
    @Test
    public void addTest()
    {
        demo d=new demo();
        int res=d.add(30, 40);
        assertEquals(70,res);
    }

    @Test
    public void addTest3()
    {
        demo d=new demo();
        int res=d.add(30, 40);
        assertNotEquals(70,res);
    }
    @Test
    public void addTest2()
    {
        demo d=new demo();
        int res=d.add(-3, 20);
        assertEquals(17,res);

    }
    @Test
    void testpositive()
    {
        int num=-5;
        boolean ans=num>0;
        assertTrue(()->ans);
    }
    @Test
    protected void testnegative()
    {
        int num=-9;
        assertTrue(num<0,()->"negative no expected");
    }
    @Test
    void getnameTest1()
    {
        demo d=new demo();
        assertNotNull(d.getname(),"obj should not be null");
    }
    @Test
    void getnameTest2()
    {
        demo d=new demo();
        assertNull(d.getname(),"obj should not be null");
    }
    @Test
    void getnameTest3()
    {
        demo d=new demo();
        assertNotNull(d.getname(),()->"obj should not be null");
    }
    @Test
    void divideTest()
    {
        demo d=new demo();
        assertThrows(ArithmeticException.class, ()->{d.divide(5, 2);});
    }


}