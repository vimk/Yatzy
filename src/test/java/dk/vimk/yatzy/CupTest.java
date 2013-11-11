/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dk.vimk.yatzy;

import static junit.framework.Assert.assertEquals;
import junit.framework.TestCase;

/**
 *
 * @author Kim Vammen
 */
public class CupTest extends TestCase {
    
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
        System.out.println("shake");
        Cup cup = new Cup();
        cup.shake();
        
        cup.setDiceVar(3);
        instance.getDie2().setDiceVar(3);
        instance.getDie2().setDiceVar(3);
        instance.getDie2().setDiceVar(3);
        instance.getDie2().setDiceVar(3);
        assertEquals(100, cupArray.getDiceVar());
        fail("The test case is a prototype.");
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
