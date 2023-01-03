package objects;

public interface Actionable {
    void makeAction(String action, Essence obj);

    void makeAction(String action);
    void makeAction(String action, Essence[] arr);
}
