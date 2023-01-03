package objects;

public class Bush extends Plant {
    public Bush(String name) {
        super(name);
    }

    public void filledWith(Essence obj) {
        System.out.println(this + " обсыпаны " + obj);
    }
}
