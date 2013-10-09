
package dk.vimk.yatzy;

import java.util.Random;

/**
 * @author vimk
 */
public class Dice {

    public final static int MAX_VALUE = 6;
    private int value;

    public Dice() {
        roll();
    }

    public int getValue() {
        return value;
    }

    public void roll() {
        Random ran = new Random();
        value = ran.nextInt(MAX_VALUE) + 1;
    }
}
