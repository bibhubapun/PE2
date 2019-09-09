package com.stackroute;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class FactorialLimitTest {
    private static FactorialLimit f;
    @AfterClass
    public static void turnoff(){
        f=null;
    }
    @BeforeClass
    public static void setup(){
        f=new FactorialLimit();
    }
    @Test
    public void testFact(){
        assertEquals("Factorial out of Range",f.factorial(35));
        assertEquals("Factorial of 10 is 3628800",f.factorial(10));
        assertEquals("Factorial of 5 is 120",f.factorial(5));
    }
    @Test
    public  void testLongFact(){
        assertEquals("Factorial out of Range",f.Longfactorial(21));
        assertEquals("Factorial out of Range",f.Longfactorial(32));
        assertEquals("Factorial of 6 is 720",f.Longfactorial(6));
    }
}
