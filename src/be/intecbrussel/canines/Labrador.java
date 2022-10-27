package be.intecbrussel.canines;

public final class Labrador extends Dog{



    public Labrador(){

    }

    public Labrador(String name, int age, boolean canSkateBoard) {
        super(name, age, canSkateBoard);
    }

    @Override
    public String toString() {
        return "Labrador{}"+super.toString();
    }
}
