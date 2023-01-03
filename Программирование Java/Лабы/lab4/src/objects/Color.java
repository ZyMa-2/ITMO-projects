package objects;

public enum Color {
    BLUE("Синяя"),
    YELLOW("Жёлтая"),
    WHITE("Белая"),
    NONE("");
    private String string;

    Color(String name) {
        string = name;
    }

    @Override
    public String toString() {
        return string;
    }
}
