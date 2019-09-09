package com.stackroute;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class EvenNumTest {
    private static EvenNum e;
    @BeforeClass
    public static void setup(){
        e=new EvenNum(); }
    @AfterClass
    public static void turnoff(){
        e=null;
    }
    @Test
   public void testAvg(){
        assertEquals(true,e.isEven(32));
        assertTrue(e.isEven(44));
        assertFalse(e.isEven(35));

    }
}
