package ponomaryov.mikhail.pokemons;

import ru.ifmo.se.pokemon.*;
import ponomaryov.mikhail.attacks.*;

public class Carracosta extends Pokemon {
    public Carracosta(String name, int level) {
        super(name, level);
        setStats(74, 108, 133, 83, 65, 32);
        setType(Type.WATER, Type.ROCK);
        setMove(new AquaTail(), new Rest(), new RockTomb(), new FocusBlast());
    }
}
