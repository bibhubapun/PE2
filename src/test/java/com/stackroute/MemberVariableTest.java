package com.stackroute;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class MemberVariableTest {
    private static MemberVariable m;
    @BeforeClass
    public static void setup(){
        m=new MemberVariable();
    }
    @AfterClass
    public static void turnoff(){
        m=null;
    }
    @Test
    public void testMember(){
        assertEquals("Name: Harry, Age: 30, Salary: 2500.3",m.display("Harry",30,2500.3));
        assertEquals("Name: Ronald, Age: 31, Salary: 350.3",m.display("Ronald",31,350.3));
        assertEquals("Name: Duffy, Age: 40, Salary: 4500.9",m.display("Duffy",40,4500.9));
    }
}
