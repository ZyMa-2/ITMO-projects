public class AnimateObject extends Essence{
    public AnimateObject(String name){
        super(name);
    }
    public void wants_to_do(String action){
        System.out.println(this + " хочет " + action);
    }
    public void stare_at(Essence obj){
        System.out.println(this + " смотрит на " + obj);
    }
}
