package singletonPattern;

import java.io.*;
import java.lang.reflect.Constructor;

/**
 * Singleton pattern - lazy loading and multithreading
 *
 * HIGH LEVEL DESIGN
 */
class Sample4 implements Serializable { // mark as Serializable

    //lazy loading and multithreading
    private static volatile Sample4 instance = null; // when volatile no cached , one copy is maintained

    //factory method
    public static Sample4 getInstance(){
        //double-checking concurrency
        if(instance == null){
            //synchronized the operation, will lock one object
            synchronized (Sample4.class){
                if (instance == null){
                    //lazy loading
                    instance = new Sample4();
                }
            }
        }
        return instance;
    }

    private Sample4(){
        if (instance == null){
            instance = this;
        }else {
            throw new IllegalStateException("You cab not create instance of this class");
        }
    }

    // to fix deserialization  issue- wont create a new object
    private Object readResolve(){
        return instance;
    }

    // non-static - requires an object
    public void sayHello(String name){
        System.out.println("Hello" + name);
    }

}

public class SingletonPatternDemo2BC {

    public  static  void main(String[] args) throws Exception{

        //Using reflection
        Class<Sample4> sampleClass = Sample4.class;
        Constructor<Sample4> constructor = sampleClass.getDeclaredConstructor();
        constructor.trySetAccessible();
        Sample4 obj = constructor.newInstance();


        Sample4 s1 = Sample4.getInstance();
        Sample4 s2 = Sample4.getInstance();

        System.out.println("is s1 == s2 => " + (s1 == s2)); // true

        s1.sayHello("World");
        s2.sayHello("World");

        System.out.println();


        System.out.println("is s1 == obj=> " + (s1 == obj)); //true

        System.out.println();


        //serialization
        ByteArrayOutputStream byteArrOut = new ByteArrayOutputStream(); //kept in memory
        ObjectOutputStream objectOut = new ObjectOutputStream(byteArrOut);
        objectOut.writeObject(obj);
        byteArrOut.close();

        //collect the bytes written
        byte [] objBytes = byteArrOut.toByteArray(); // give all the bytes

        //deserialization
        ObjectInputStream objIn = new ObjectInputStream(new ByteArrayInputStream(objBytes));
        Sample4 obj2 = (Sample4)objIn.readObject();

        System.out.println("is obj == obj2=> " + (obj == obj2)); //true
        objIn.close();

        //One problem this s1 can be serilized or deserialized
    }
}
