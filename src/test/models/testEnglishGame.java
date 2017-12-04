package models;

import org.junit.Test;

import static org.junit.Assert.*;
public class testGame {
    @Test

    public void testReset() {
        Game g = new Game();
        g.score = 50;
        g.resetGame();
        assertEquals(0, g.score);
    }

    @Test
    public void testDealFour() {
        Game g = new Game();
        g.dealFour();
        assertEquals(1, g.cols.columnSize(1));
    }
}
