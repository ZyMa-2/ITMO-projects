package objects;

import exceptions.NameException;

public abstract class Essence implements Actionable {
    private final String name;

    public Essence(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }


    public void makeAction(String action) {
        System.out.println(this + " " + action);
    }

    public void makeAction(String action, Essence obj) {
        System.out.println(this + " " + action + " " + obj);
    }

    public void makeAction(String action, Essence[] arr) {
        System.out.print(this + " " + action + " ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i != arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public abstract String getFullName();

    @Override
    public int hashCode() {
        return this.getFullName().hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Essence)) {
            return false;
        }
        Essence e = (Essence) obj;

        return e.hashCode() == this.hashCode();
    }

    @Override
    public String toString() {
        return this.getFullName();
    }
}
