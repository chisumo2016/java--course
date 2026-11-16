package singletonPattern;

import java.io.*;
import java.lang.reflect.Constructor;

class Sample3 implements Serializable { // mark as Serializable

    //lazy loading
    private static Sample3 instance = null; // when is need for the first time

    //factory method
    public static Sample3 getInstance(){
        if(instance == null){
            //lazy loading
            instance = new Sample3();
        }
        return instance;
    }

    private Sample3(){
        if (instance == null){
            instance = this;
        }else {
            throw new IllegalStateException("You cab not create instance of this class");
        }
    }

    // to fix deserialization - wont create a new object
    private Object readResolve(){
        return instance;
    }

    // non-static - requires an object
    public void sayHello(String name){
        System.out.println("Hello" + name);
    }

}

public class SingletonPatternDemo2B {

    public  static  void main(String[] args) throws Exception{

        //Using reflection
        Class<Sample3> sampleClass = Sample3.class;
        Constructor<Sample3> constructor = sampleClass.getDeclaredConstructor();
        constructor.trySetAccessible();
        Sample3 obj = constructor.newInstance();


        Sample3 s1 = Sample3.getInstance();
        Sample3 s2 = Sample3.getInstance();

        System.out.println("is s1 == s2 => " + (s1 == s2)); // true

        s1.sayHello("World");
        s2.sayHello("World");

        System.out.println();


        System.out.println("is s1 == obj=> " + (s1 == obj)); //true

        System.out.println();


        //serialization
        ByteArrayOutputStream  byteArrOut = new ByteArrayOutputStream(); //kept in memory
        ObjectOutputStream objectOut = new ObjectOutputStream(byteArrOut);
        objectOut.writeObject(obj);
        byteArrOut.close();

        //collect the bytes written
        byte [] objBytes = byteArrOut.toByteArray(); // give all the bytes

        //deserialization
        ObjectInputStream objIn = new ObjectInputStream(new ByteArrayInputStream(objBytes));
        Sample3 obj2 = (Sample3)objIn.readObject();

        System.out.println("is obj == obj2=> " + (obj == obj2)); //true
        objIn.close();

        //One problem this s1 can be serilized or deserialized
    }
}
