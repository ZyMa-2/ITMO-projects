package objects;

public class Plant extends InanimateObject implements Growable{
    public Plant(String name) {
        super(name);
    }

    public void grow() {
        System.out.println(this + " растут");
    }
}
