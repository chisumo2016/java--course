package oops.interfaces;

/**
 *   Interface : A blueprint of a class that defines a set of methods that a class must implement.
 *              A blueprint for a class that specifies a set of abstract methods that a class must implement. (MUST DEFINE)
 *              support multiple inheritance-like behavior
 *              Very similar to abstract classes, but with a key difference: interfaces cannot have instance variables or constructors.
 *              Class can have multiple parents
 *              CONTRACT - YOU MUST IMPLEMENT ALL THE METHODS DEFINED IN THE INTERFACE
 *
 *              KEYWORD : implements
 */
public class Main {

    public static void main(String[] args) {
        Rabbit rabbit = new Rabbit();
        Hawk hawk = new Hawk();
        Fish fish = new Fish();

        System.out.println();
        rabbit.flee();
        hawk.hunt();
        System.out.println();
        fish.flee();
        fish.hunt();
    }
}
