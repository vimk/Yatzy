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
public class CupTest extends TestCase {

    private Dice[] diceVar;

    public CupTest(String testName) {
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

    /**
     * Test of shake method, of class Cup.
     */
    public void testShake() {

        diceVar = new Dice[5];
        for (int i = 0; i < diceVar.length; i++) {
            diceVar[i].roll();

            System.out.println(diceVar[0]);
            System.out.println(diceVar[1]);
            System.out.println(diceVar[2]);
            System.out.println(diceVar[3]);
            System.out.println(diceVar[4]);

            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of hold method, of class Cup.
     */
    public void testHold() {
        System.out.println("hold");
        Cup instance = new Cup();
        instance.hold();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
