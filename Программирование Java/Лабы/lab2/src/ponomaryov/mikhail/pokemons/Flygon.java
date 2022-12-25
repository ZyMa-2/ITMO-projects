package ponomaryov.mikhail.pokemons;

import ru.ifmo.se.pokemon.*;
import ponomaryov.mikhail.attacks.*;

public class Flygon extends Pokemon {
    public Flygon(String name, int level) {
        super(name, level);
        setStats(80, 100, 80, 80, 80, 100);
        setType(Type.GROUND, Type.DRAGON);
        setMove(new Swagger(), new MudSlap(), new BugBuzz(), new FeintAttack());
    }
}
