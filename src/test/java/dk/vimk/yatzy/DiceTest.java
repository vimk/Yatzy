/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dk.vimk.yatzy;

import static junit.framework.Assert.assertEquals;
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

    public void testGetValue() {
        
        Dice die1 = new Dice();
        
        die1.setValue(4);
        
        assertEquals(4, die1.getValue());
    }
}
