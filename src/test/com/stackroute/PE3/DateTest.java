package com.stackroute.PE3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.*;

import static org.junit.Assert.*;

import static org.junit.Assert.*;

public class DateTest {
    Date md;
    @Before
    public void setUp() throws Exception {
        md = new Date();
    }

    @After
    public void tearDown() throws Exception {
        md=null;
    }

    @Test
    public void startDate() {
        //Arrange
        boolean expectedValue = true;
        //Act
        boolean actualValue = md.startDate();
        assertEquals(expectedValue, actualValue);
        assertNotNull(actualValue);
    }

    @Test
    public void endDate() {
        //Arrange
        boolean expectedValue1 = true;
        //Act
        boolean actualValue1 = md.endDate();
        assertEquals(expectedValue1, actualValue1);
        assertNotNull(actualValue1);
    }
}