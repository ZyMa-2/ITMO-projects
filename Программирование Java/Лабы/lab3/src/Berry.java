public class Berry extends InanimateObject{
    private Color color;
    public Berry(String name, Color color)
    {
        super(name);
        this.color = color;
    }
    public Berry(String name)
    {
        super(name);
        this.color = Color.NONE;
    }
    public Color getColor(){
        return this.color;
    }
    public void crush_into(Essence obj){
        System.out.println(this + " упал на " + obj);
        this.setState("разбилась");
        this.announce_state();
    }
    @Override
    public int hashCode(){
        return this.getName().hashCode() * this.color.hashCode();
    }
    @Override
    public String toString(){
        return this.getColor() + " " + this.getName();
    }
}
