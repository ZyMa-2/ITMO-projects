package ponomaryov.mikhail.pokemons;

import ru.ifmo.se.pokemon.*;
import ponomaryov.mikhail.attacks.*;

public class Bouffalant extends Pokemon {
    public Bouffalant(String name, int level) {
        super(name, level);
        setStats(95, 110, 95, 40, 95, 55);
        setType(Type.NORMAL);
        setMove(new HeadCharge(), new Swagger(), new HornAttack(), new Facade());
    }
}
