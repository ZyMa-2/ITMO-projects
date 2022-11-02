package ponomaryov.mikhail.attacks;

import ru.ifmo.se.pokemon.*;

public class BugBuzz extends SpecialMove {
    public BugBuzz() {
        super(Type.BUG, 90, 100);
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
        return "использует BugBuzz " +((isChance ? "and lowered opponent SPECIAL DEFENCE by -1"  : ""));
    }
}