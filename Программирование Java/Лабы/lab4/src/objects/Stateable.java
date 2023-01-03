package objects;

public interface Stateable {
    void changeState(String newState);
    void announceState();
}
