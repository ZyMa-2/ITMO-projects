public interface State {
    void setState(String state);
    String getState();
    void announce_state();
}
