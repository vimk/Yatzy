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

    public Dice[] getDiceVar() {
        return diceVar;
    }

    public void setDiceVar(Dice[] diceVar) {
        this.diceVar = diceVar;
    }

    public void hold() {
        
    }
}

