package singletonPattern;
/**
   SingletonPatternDemo
     - Only one object/instance per container (here it is JVM for now)
     - Used when instance creation is costly
     - Example usages
          - Runtime.getRuntime()
          - System.getSecurityManager()

  No multiple instances

    Spring Boot use singleton pattern and framework components are singleton by default.
 */

class Sample{

    private static Sample instance = new Sample(); // single copy is maintain in memory . hold the refrence of object

    private Sample(){}

    //factory method
    public static Sample getInstance(){
        return instance;
    }

    // non-static - requires an object
    public void sayHello(String name){
        System.out.println("Hello" + name);
    }

}
public class SingletonPatternDemo {

    public  static  void main(String[] args) {
        //Sample sample1 = new Sample(); // not allowed , bs the constructor is private
        //Sample sample2 = new Sample();

        //
        Sample sample1 = Sample.getInstance();
        Sample sample2 = Sample.getInstance();

        System.out.println("is s1 == s2 => " + (sample1 == sample2)); // compare the reference
        sample1.sayHello("World");
        sample2.sayHello("World");
    }
}
