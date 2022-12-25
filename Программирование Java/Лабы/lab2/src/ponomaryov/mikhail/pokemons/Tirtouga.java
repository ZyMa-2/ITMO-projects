package ponomaryov.mikhail.pokemons;

import ru.ifmo.se.pokemon.*;
import ponomaryov.mikhail.attacks.*;

public class Tirtouga extends Pokemon {
    public Tirtouga(String name, int level) {
        super(name, level);
        setStats(54, 78, 103, 53, 45, 22);
        setType(Type.WATER, Type.ROCK);
        setMove(new AquaTail(), new Rest(), new RockTomb());
    }
}
