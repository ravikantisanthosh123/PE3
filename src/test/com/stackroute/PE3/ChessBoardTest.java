package com.stackroute.PE3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ChessBoardTest {
    ChessBoard cb;
    @Before
    public void setUp() throws Exception {
        cb=new ChessBoard();
    }

    @After
    public void tearDown() throws Exception {
        cb=null;
    }

    @Test
    public void colouredBoxes() {
        String expected[][]={{"WW","BB","WW","BB","WW","BB","WW","BB"},{"BB","WW","BB","WW","BB","WW","BB","WW"},{"WW","BB","WW","BB","WW","BB","WW","BB"},{"BB","WW","BB","WW","BB","WW","BB","WW"},{"WW","BB","WW","BB","WW","BB","WW","BB"},{"BB","WW","BB","WW","BB","WW","BB","WW"},{"WW","BB","WW","BB","WW","BB","WW","BB"},{"BB","WW","BB","WW","BB","WW","BB","WW"}};
        String actualValue[][]=cb.ColouredBoxes();
        assertArrayEquals(expected,actualValue);
        assertNotNull(cb);
    }
    @Test
    public void colouredBoxesFailure() {


        String expected[][]={{"BB","BB","BB","BB","BB","BB","BB","BB"},{"BB","WW","BB","WW","BB","WW","BB","WW"},{"WW","BB","WW","BB","WW","BB","WW","BB"},{"BB","WW","BB","WW","BB","WW","BB","WW"},{"WW","BB","WW","BB","WW","BB","WW","BB"},{"BB","WW","BB","WW","BB","WW","BB","WW"},{"WW","BB","WW","BB","WW","BB","WW","BB"},{"BB","WW","BB","WW","BB","WW","BB","WW"}};
        String actualValue[][]=cb.ColouredBoxes();
        assertNotEquals(expected,actualValue);
        assertNotNull(cb);

    }

}