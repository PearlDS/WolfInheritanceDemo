package be.intecbrussel;

import be.intecbrussel.canines.*;

public class Main {

    public static void main(String[] args) {

        Wolf wolf = new Wolf("Silver", 4 );
        //Demo for protected property
        //wolf.name = "Fido;";
        Dog dog = new Dog();
        dog.setName("Fido");
        Wolf wolfDog = new Dog();
        Wolf labrador = new Labrador();
        labrador.setName("Chica");

        Animal animal = new Fox();

        int ageOfWolf = wolf.getAge();

        System.out.println(wolf);
        System.out.println(dog);
        System.out.println(labrador);
        //wolf.makeNoise();
        //dog.makeNoise();
        //labrador.makeNoise();


        Wolf[] wolves = {wolf, wolfDog, labrador, dog};

        for (Wolf w: wolves){
            if(w instanceof Dog) {
                System.out.println("Who let the dogs out");
                w.makeNoise();
            } else   {
                System.out.println("There's a she wolf in your closet");
            w.makeNoise();
            }

        }

        System.out.println(Wolf.getCount());
        System.out.println(Dog.getCount());

        Fox fox = new Fox();
        Fox fox1 = new Fox();
        System.out.println(dog instanceof Wolf);
        System.out.println(dog instanceof Dog);
        //gives an error
        //System.out.println(fox instanceof Wolf);

        System.out.println("foxtest");
        System.out.println(fox.hashCode());
        System.out.println(fox.name);
        System.out.println(fox1.hashCode());
        System.out.println(fox1.name);
        System.out.println(fox.equals(fox1));






    }


}