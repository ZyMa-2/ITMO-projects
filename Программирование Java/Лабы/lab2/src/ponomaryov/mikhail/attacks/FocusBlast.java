package ponomaryov.mikhail.attacks;

import ru.ifmo.se.pokemon.*;

public class FocusBlast extends StatusMove {
    public FocusBlast() {
        super(Type.FIGHTING, 120, 70);
    }
    private boolean isChance = false;
    @Override
    protected void applyOppEffects(Pokemon p) {
        if(Math.random() < 0.1)
        {
            p.setMod(Stat.SPECIAL_DEFENSE, -1);
            isChance = true;
        }
    }

    @Override
    protected String describe() {
        return "использует FocusBlast " +((isChance ? "and lowered opponent SPECIAL DEFENCE by -1"  : ""));
    }
}