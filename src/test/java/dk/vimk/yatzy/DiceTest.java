/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dk.vimk.yatzy;

import junit.framework.TestCase;

/**
 *
 * @author vimk
 */
public class DiceTest extends TestCase {

    public DiceTest(String testName) {
        super(testName);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    public void testDiceRoll() {

        Dice d1 = new Dice();
        d1.roll();
        //få den til at roll fx 10 gange for at se om den holder sig inde for værdierne 
    }
}
