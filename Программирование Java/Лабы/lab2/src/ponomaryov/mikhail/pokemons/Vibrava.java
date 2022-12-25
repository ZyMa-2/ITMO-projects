package ponomaryov.mikhail.pokemons;

import ru.ifmo.se.pokemon.*;
import ponomaryov.mikhail.attacks.*;

public class Vibrava extends Pokemon {
    public Vibrava(String name, int level) {
        super(name, level);
        setStats(50, 70, 50, 50, 50, 70);
        setType(Type.GROUND, Type.DRAGON);
        setMove(new Swagger(), new MudSlap(), new BugBuzz());
    }
}
