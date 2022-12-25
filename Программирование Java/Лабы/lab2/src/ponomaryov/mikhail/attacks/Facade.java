package ponomaryov.mikhail.attacks;

import ru.ifmo.se.pokemon.*;

public class Facade extends PhysicalMove {
    public Facade() {
        super(Type.NORMAL, 70, 100);
    }

    protected double calcBaseDamage(Pokemon p1, Pokemon p2) {
        Status cond = p1.getCondition();
        if (cond == Status.BURN || cond == Status.POISON || cond == Status.PARALYZE) {
            return (0.4 * (double) p1.getLevel() + 2.0) * (this.power * 2) / 150.0;
        } else {
            return super.calcBaseDamage(p1, p2);
        }
    }


    @Override
    protected String describe() {
        return "использует Facade ";
    }
}