package com.stackroute;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import java.security.PublicKey;

import static org.junit.Assert.*;
public class UserTest {
private static User u1,u2,u3;
 @BeforeClass
    public static void setup(){
     u1=new User("Ronald","Raegan",80,3400);
     u2=new User("Barack","Obama",23,5000);
     u3=new User("Narendra","Modi",40,9000);
 }
    @AfterClass
    public static void turnoff(){
     u1=null;
     u2=null;
     u3=null;
    }
    @Test
    public void testAge(){
     assertEquals("Age is invalid",u1.isValidAge());
        assertEquals("Age is valid",u2.isValidAge());
        assertEquals("Age is valid",u3.isValidAge());
     }
     @Test
    public void testName(){
     assertEquals("Ronald Raegan",u1.getFullName());
     assertEquals("Barack Obama",u2.getFullName());
     assertEquals("Narendra Modi",u3.getFullName());
     }
}
