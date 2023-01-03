package objects;

import exceptions.NameException;

public class Person extends Essence implements Thinkable, Rememberable, Visualizeable, Feelable {
    private String mood = "нейтральный";

    public Person(String name) throws NameException {
        super(name);
        int digitNum = 0;
        for(int i = 0; i < name.length(); i++){
            if(Character.isDigit(name.charAt(i))){
                digitNum++;
            }
        }
        if(digitNum != 0)   throw new NameException(name);
    }

    public void wantsToDo(String action) {
        System.out.println(this + " хочет " + action);
    }

    public void stareAt(Essence obj) {
        System.out.println(this + " смотрит на " + obj);
    }

    public void think(String thought) {
        System.out.println(this + " думает что " + thought);
    }

    public void remember(String something) {
        System.out.println(this + " вспоминает что " + something);
    }

    public void visualize(String something) {
        System.out.println(this + " представляет как " + something);
    }

    public String getMood() {
        return this.mood;
    }

    public void changeMood(String newMood) {
        this.mood = newMood;
    }

    public void announceMood() {
        System.out.println(this + " имеет " + this.getMood() + " настроение");
    }

    @Override
    public String getFullName() {
        return this.getName();
    }
}
