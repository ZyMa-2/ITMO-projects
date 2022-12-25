package ponomaryov.mikhail.attacks;

import ru.ifmo.se.pokemon.*;

public class FeintAttack extends StatusMove {
    public FeintAttack() {
        super(Type.DARK, 60, Double.POSITIVE_INFINITY);
    }

    @Override
    protected String describe() {
        return "использует FeintAttack ";
    }
}