package ponomaryov.mikhail;

import ru.ifmo.se.pokemon.*;
import ponomaryov.mikhail.attacks.*;
import ponomaryov.mikhail.pokemons.*;

public class Lab2 {
    public static void main(String[] args) {
        Battle b = new Battle();
        Bouffalant p1 = new Bouffalant("Бычок",1);
        Tirtouga p2 = new Tirtouga("Черепашка",1);
        Carracosta   p3 = new Carracosta("Черепашка мутант",1);
        Trapinch p4 = new Trapinch("Большеголовая черепашка",3);
        Vibrava p5 = new Vibrava("Стрекоза", 3);
        Flygon p6 = new Flygon("Мини дракон",3);

        b.addAlly(p1);
        b.addAlly(p2);
        b.addAlly(p3);

        b.addFoe(p4);
        b.addFoe(p5);
        b.addFoe(p6);
        b.go();
    }
}
