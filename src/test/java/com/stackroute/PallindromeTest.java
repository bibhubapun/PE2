package com.stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class PallindromeTest{

   private static Pallindrome p;

    @BeforeClass
    public static void setup(){
       p=new Pallindrome();
    }
    @AfterClass
    public static void turnoff(){
        p=null;
    }
    @Test
    public void isPallindrome(){
        assertEquals("Yes",p.checkP("locol"));
        assertNull(p.checkP("welcome"));
        assertEquals("Yes",p.checkP("12321"));
    }
}