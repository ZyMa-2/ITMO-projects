public class InanimateObject extends Essence implements State{
    private String state;
    public InanimateObject(String name){
        super(name);
        this.state = "None";
    }
    public void setState(String state){
        this.state = state;
    }
    public String getState(){
        return this.state;
    }
    public void announce_state(){
        System.out.println(this + " " + this.getState());
    }
}
