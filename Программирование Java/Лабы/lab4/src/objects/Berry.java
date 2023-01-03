package objects;

public class Berry extends InanimateObject implements Crushable{
    private Color color = Color.NONE;
    public Berry(String name, Color color)
    {
        super(name);
        this.color = color;
    }
    public Berry(String name)
    {
        super(name);
    }
    public Color getColor(){
        return this.color;
    }
    public void crushInto(Essence obj){
        System.out.println(this + " упал на " + obj);
        this.changeState("разбилась");
        this.announceState();
    }
    @Override
    public String getFullName() {
        return this.getColor() == Color.NONE ? this.getName() : this.getColor() + " " + this.getName();
    }
}
