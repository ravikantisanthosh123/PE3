package com.stackroute.PE3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GradesTest {
    Grades obj;
    @Before
    public void setUp() throws Exception {
      obj=new Grades();

    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void grades() {
        int n=5;
        int[] array={80,1,50,99,35};
        int[] array1={0,39,-55,-99,100};;
     assertEquals("correct",obj.Grades(array,n));
     assertEquals("exception",obj.Grades(array1,n));
    }

    @Test
    public void grades1() {
        int n=6;
        int[] array={100,19,50,99,35};
        int[] array1={10,39,55,10,100};
        assertNotEquals("exception",obj.Grades(array,n));
        assertNotEquals("exception",obj.Grades(array1,n));
    }
}