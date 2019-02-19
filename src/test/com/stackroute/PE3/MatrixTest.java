package com.stackroute.PE3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MatrixTest {
 Matrix obj;
    @Before
    public void setUp() throws Exception {
        obj=new Matrix();
    }

    @After
    public void tearDown() throws Exception {
        obj=null;
    }

    @Test
    public void addMatrix() {
        int m=3;
        int n=2;
        int first[][] = {{1,2},{3,4},{5,6}};
        int second[][] = {{9,8},{7,6},{5,4}};
       int[][] expected={{10,10},{10,10},{10,10}};
       assertEquals(expected,obj.addMatrix(3,2,first,second));


    }

    @Test
    public void addMatrix1() {
        int m=3;
        int n=2;
        int first[][] = {{1,2},{3,4},{5,6}};
        int second[][] = {{9,8},{7,6},{5,4}};
        int[][] expected={{10,10},{8,10},{10,10}};
        assertNotEquals(expected,obj.addMatrix(3,2,first,second));


    }
}