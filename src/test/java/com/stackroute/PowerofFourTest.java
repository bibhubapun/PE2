package com.stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;


public class PowerofFourTest {
    private  static PowerofFour p;

    @BeforeClass
    public static void setup(){
        p=new PowerofFour();
    }
    @AfterClass
    public static void turnoff(){
        p=null;
    }
    @Test
    public void testPower(){
        assertEquals(0,p.checkPower(34));
        assertEquals(0,p.checkPower(12));
        assertEquals(1,p.checkPower(64));
    }
}
