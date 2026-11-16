package oops.composition;

public class Engine {

    String type;

    Engine(String type){
        this.type = type;
    }

    void start(){
        System.out.println("You started the engine " + this.type + ".");
    }
}
