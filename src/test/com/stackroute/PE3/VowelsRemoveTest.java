package com.stackroute.PE3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class VowelsRemoveTest {
    VowelsRemove vr;
    @Before
    public void setUp() throws Exception {
        vr = new VowelsRemove();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void removeVowels() {
        String[] input={"INDIA","EGYPT"};
        String[] output={"IND","EGYPT"};
        assertArrayEquals(output,vr.removeVowels(input));
    }
}