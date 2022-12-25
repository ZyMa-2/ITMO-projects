package ponomaryov.mikhail.attacks;

import ru.ifmo.se.pokemon.*;

public class Rest extends StatusMove {
    public Rest() {
        super(Type.PSYCHIC, 0, 0);
    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        Effect e = new Effect();
        e = e.condition(Status.SLEEP);
        e = e.turns(2);
        p.restore();
        p.addEffect(e);
    }

    @Override
    protected String describe() {
        return "использует Rest ";
    }
}