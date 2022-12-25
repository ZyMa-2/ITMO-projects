public class Bush extends InanimateObject{
    public Bush(String name){
        super(name);
    }
    public void grow(){
        System.out.println(this + " растут");
    }
    public void filledWith(Essence obj){
        System.out.println(this + " обсыпаны " + obj);
    }
}
