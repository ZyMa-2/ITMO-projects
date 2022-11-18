public abstract class Essence implements Action {
    private String name;
    public Essence(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void make_action(String action){
        System.out.println(this + " " + action);
    }
    public void make_action(String action, Essence obj){
        System.out.println(this + " " + action + " " + obj);
    }
    @Override
    public int hashCode(){
        return this.getName().hashCode();
    }
    @Override
    public boolean equals(Object obj){
        return obj.hashCode() == this.hashCode();
    }
    @Override
    public String toString(){
        return this.getName();
    }
}
