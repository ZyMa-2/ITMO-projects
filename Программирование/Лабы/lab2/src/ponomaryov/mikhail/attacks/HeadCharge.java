package ponomaryov.mikhail.attacks;

import ru.ifmo.se.pokemon.*;

public class HeadCharge extends PhysicalMove {
    public HeadCharge() {
        super(Type.NORMAL, 120, 100);
    }

    @Override
    protected void applySelfDamage(Pokemon att, double damage) {
        att.setMod(Stat.HP, (int) Math.round(damage / 4));
    }


    @Override
    protected String describe() {
        return "использует HeadCharge ";
    }
}