package oops.methodOverring;
/*
    Method overriding ♻️ When a subclass provides a specific implementation of a method that is already provided by its parent class,
                            this process is called method overriding.
                            Always for code reusability abd give specific implementations.
    God practice to add  @Override anotation
 */
public class Main {

    public static void main(String[] args) {

        Dog dog = new Dog();
        Cat cat = new Cat();
        Fish fish = new Fish();

        dog.move();
        cat.move();
        fish.move();
    }
}
