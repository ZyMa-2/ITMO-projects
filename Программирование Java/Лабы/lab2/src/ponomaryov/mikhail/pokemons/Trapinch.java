package ponomaryov.mikhail.pokemons;

import ru.ifmo.se.pokemon.*;
import ponomaryov.mikhail.attacks.*;

public class Trapinch extends Pokemon {
    public Trapinch(String name, int level) {
        super(name, level);
        setStats(45, 100, 45, 45, 45, 10);
        setType(Type.GROUND);
        setMove(new Swagger(), new MudSlap());
    }
}
