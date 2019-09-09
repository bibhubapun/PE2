package com.stackroute;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class StudentMarksTest {
    private static StudentMarks s;
    @BeforeClass
    public static void setup(){
        s=new StudentMarks();
    }
    @AfterClass
    public static void turnoff(){
        s=null;
    }
    @Test
    public void testAvg(){
        int[] arr1={88,69,32,21};
        int[] arr2={90,34,23,12,67};
        int[] arr3={89,55,67};
        assertEquals(52.5,s.Average(arr1),0);
        assertEquals(45.2,s.Average(arr2),0);
        assertEquals(70.33,s.Average(arr3),0.03);
    }
    @Test
    public void testMax(){
        int[] arr1={88,69,32,21};
        int[] arr2={90,34,23,12,67};
        int[] arr3={89,55,67};
        assertEquals(88,s.Max(arr1));
        assertEquals(90,s.Max(arr2));
        assertEquals(89,s.Max(arr3));
    }
    @Test
    public void testMin(){
        int[] arr1={88,69,32,21};
        int[] arr2={90,34,23,12,67};
        int[] arr3={89,55,67};
        assertEquals(21,s.Min(arr1));
        assertEquals(12,s.Min(arr2));
        assertEquals(55,s.Min(arr3));
    }

}
