package GeneralizationUsingInheritance;

/*
    Generalization code through Inheritance (how through inheritance)
    Object
        - The base class for all objects in Java
        - common methods eq
            - toString
            - hashCode
            - clone
            - finalize
 */

class Animal {

}

class WildAnimal extends Animal {}
class DomesticAnimal extends Animal {}
class Lion extends WildAnimal {}
class Tiger extends WildAnimal {}
class Cow extends DomesticAnimal {}
class Dog extends DomesticAnimal {}

class Human  {}

public class InheritanceEx1 {

    public static void main(String[] args) {
        feed(new Animal());
        feed(new WildAnimal());
        feed(new DomesticAnimal());
        feed(new Lion());
        feed(new Tiger());
        feed(new Cow());
        feed(new Dog());

        feed(new Human());
    }

    //its possible to feed any animal of base class Animal
    static void feed(Object a) {
        System.out.println("feeding an animal");
    }
}

class List {
    Dog arr[]; // Cow , Object
}
