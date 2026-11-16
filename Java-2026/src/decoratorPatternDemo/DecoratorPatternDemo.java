package decoratorPatternDemo;



/*
     Decorator Pattern Demo
       Need
        - We should allow behaviour to be extended without the need to MODIFY existing code

        Pros
          1) Works as an alternative to subclassing, it extends the behaviour of an existing object class without modifying the original code.
          2)It mirrors the type component that it decorates.
          3)You can wrap the component with any number if decorators.

       Cons
          1)It can result in many small objects in the design, and overuse can become complex


       Example Decorator Pattern in High level in Java

                ObjectOutputStream objectOut =
                new ObjectOutputStream( //object serialization based on ObjectOutputStream
                    new BufferedOutputStream( // buffer
                        new FileOutputStream("student.txt") //read and writing bytes(not capable of holding the buffer)
                  )
            );
             Decorator Design  Pattern
                                   Pizza (Abstract base component - base) |
                                             |                      |
                                             |                      |
                                             |                      |
                                             |                      |
                                             |                      |
                                             |                      |
                                                                    |
                             core components- class                 |
             VegExtravaganza            PeppyPaneer                 |
                                                                    |
                         Concrete components                       |
                                                          Topping (Abstract decorator)
                                                                 |               |
                                                        ExtraCheese       BlackOlive
                                                                Decorator

  */

/**base component*/
abstract class Pizza{

   public abstract double cost();
   public abstract String description();
}

/**Concrete components Implementation*/

class VegExtravaganza extends Pizza{

    @Override
   public double cost(){
       return 100;
   }

   public String description(){
       return "Veg Extravaganza";
   }
}

class PeppyPaneer extends Pizza{

    @Override
    public double cost(){
        return 200;
    }

    public String description(){
        return "Peppy Paneer";
    }
}


/**Abstract decorator*/
abstract class Topping extends Pizza{

}


/**concrete decorator  ExtraCheese isn't complete independent, need to be applied in PIZA ,ExtraCheese cant instantiated */

class ExtraCheese extends Topping{
     Pizza pizza;

    public ExtraCheese(Pizza pizza){
        this.pizza = pizza;
    }

    @Override
    public double cost() {
        return 50 + pizza.cost();
    }

    public String description(){
        return pizza.description() + ", Extra Cheese";
    }
}


class BlackOlive extends Topping{
    Pizza pizza;

    public BlackOlive(Pizza pizza){  // Pizza pizza base class
        this.pizza = pizza;
    }

    @Override
    public double cost() {
        return 29 + pizza.cost();
    }

    public String description(){
        return pizza.description() + ", Black Olive";
    }
}

public class DecoratorPatternDemo {

    public static void main(String[] args) {

        //Decorator
        Pizza pizza  =   new BlackOlive(new ExtraCheese(new VegExtravaganza()) ); // VegExtravaganza is core component
        System.out.println(pizza.cost()); // 100 + 50 + 29
        System.out.println();

        System.out.println("Pizza -" + pizza.description() + "; cost - " + pizza.cost());

        System.out.println();

        Pizza pizza1  =   new BlackOlive(new VegExtravaganza()) ;


        System.out.println("Pizza -" + pizza1.description() + "; cost - " + pizza1.cost());
        /*VegExtravaganza vegExtravaganza = new VegExtravaganza();
        System.out.println(vegExtravaganza.cost()); //100
        ExtraCheese extraCheese = new ExtraCheese(vegExtravaganza);
        BlackOlive blackOlive = new BlackOlive(extraCheese);
        System.out.println("Total cost of pizza: " + blackOlive.cost());*/
    }
}
