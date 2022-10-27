package be.intecbrussel.canines;

import java.util.Objects;

public class Dog extends Wolf{

    private  boolean canSkateBoard;

    private static int count;

    {
        count++;
    }

    public Dog() {

    }

    public Dog(String name, int age, boolean canSkateBoard) {
        super(name, age);
        this.canSkateBoard = canSkateBoard;
    }

    public boolean isCanSkateBoard() {
        //Demo for protected property
        //this.name= "Alvin";
        return canSkateBoard;
    }

    public void setCanSkateBoard(boolean canSkateBoard) {
        this.canSkateBoard = canSkateBoard;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Dog.count = count;
    }



    @Override
    public void makeNoise() {
        System.out.println("WAF WAF");
    }

    @Override
    public String toString() {
        return "Dog{" +
                super.toString()+
                "canSkateBoard=" + canSkateBoard +
                '}';
    }
}
