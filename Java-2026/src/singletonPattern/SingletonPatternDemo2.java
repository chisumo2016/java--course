package singletonPattern;

import java.lang.reflect.Constructor;

class Sample1{

    //lazy loading
    private static Sample1 instance = null; // when is need for the first time

    //factory method
    public static Sample1 getInstance(){
        if(instance == null){
            //lazy loading
            instance = new Sample1();
        }
        return instance;
    }

    private Sample1(){
        if (instance == null){
            instance = this;
        }else {
            throw new IllegalStateException("You cab not create instance of this class");
        }
    }

    // non-static - requires an object
    public void sayHello(String name){
        System.out.println("Hello" + name);
    }

}


public class SingletonPatternDemo2 {

    public  static  void main(String[] args) throws Exception{

        //Using reflection
        Class<Sample1> sampleClass = Sample1.class;
        Constructor<Sample1> constructor = sampleClass.getDeclaredConstructor();
        constructor.trySetAccessible();
        Sample1 obj = constructor.newInstance();


        Sample1 s1 = Sample1.getInstance();
        Sample1 s2 = Sample1.getInstance();

        System.out.println("is s1 == s2 => " + (s1 == s2)); // true

        s1.sayHello("World");
        s2.sayHello("World");

        System.out.println();



        System.out.println("is s1 == obj=> " + (s1 == obj)); //true

        //One problem this s1 can be serilized or deserialized
    }
}

