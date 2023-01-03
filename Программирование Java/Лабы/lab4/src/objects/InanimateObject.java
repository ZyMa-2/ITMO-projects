package objects;

public class InanimateObject extends Essence implements Stateable {
    private String state;

    public InanimateObject(String name) {
        super(name);
        this.state = "None";
    }

    @Override
    public String getFullName() {
        return this.getName();
    }

    private String getState() {
        return this.state;
    }

    public void changeState(String newState) {
        this.state = newState;
    }

    public void announceState() {
        System.out.println(this + " " + this.getState());
    }

}
