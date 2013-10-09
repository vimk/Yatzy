package dk.vimk.yatzy;

/**
 *
 * @author vimk
 */
public class Cup {

    private Dice[] diceVar;

    public Cup() {

        diceVar = new Dice[5];
        for (int i = 0; i < diceVar.length; i++) {
            diceVar[i] = new Dice();
        }
    }

    public void shake() {

        for (int i = 0; i < diceVar.length; i++) {
            diceVar[i].roll();
        }
    }

    public void hold() {
        
    }
}

