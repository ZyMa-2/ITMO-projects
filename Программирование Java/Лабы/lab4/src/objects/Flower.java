package objects;

import exceptions.AlreadyBlossomedException;

public class Flower extends Plant implements Bloomable {

    private Color color = Color.NONE;
    private boolean isBloomed = false;

    public Flower(String name, Color color) {
        super(name);
        this.color = color;
    }

    public Flower(String name) {
        super(name);
    }

    public void blossom() throws AlreadyBlossomedException {
        if (this.isBloomed) {
            throw new AlreadyBlossomedException(getFullName());
        } else {
            System.out.println(this + " распускается");
            this.isBloomed = true;
        }
    }

    public Color getColor() {
        return this.color;
    }

    @Override
    public String getFullName() {
        return this.getColor() == Color.NONE ? this.getName() : this.getColor() + " " + this.getName();
    }

    public static class Fruit extends Plant {

        public Fruit(String name) {
            super(name);
        }

        public void ripen() {
            System.out.println(this + " созревает");
        }
    }
}
