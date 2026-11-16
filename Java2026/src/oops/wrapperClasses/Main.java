package oops.wrapperClasses;

/**
   Wrapper classes: Allow primitive data type/values (e.g., int, double, char , boolean) to be used as objects .
                    "Wrap the item in a object"
                    Generally, dont't wrap primitive unless you need an object .
                    Allows use if Collections Framework and static Utility methods.

                    Taking the primitive and wrap it in a object.

                    AUTOBOXING
                    UNBOXING

 */
public class Main {

    public static void main(String[] args) {

        //Deprecated(since Java 9)
        /* Integer a = new Integer(10);
         Double b = new Double(10.5);
         Character c = new Character('c');
         Boolean d = new Boolean(true);*/

         //a, b , c , d  both are objects

        // AUTOBOXING (New way of creating objects)
        Integer a = 123;
        Double b = 2.233;
        Character c = 'c';
        Boolean d = true;

        //UNBOXING
         int x = a;
         double y = b;

         //UTILTY CLASSES
         String a1 = Integer.toString(123);
         String b1 = Double.toString(2.233);
         String c1 = Character.toString('@');
         String s1 = String.valueOf(123);
         String s2 = Boolean.toString(true);

         String X =  a1 + b1 + c1 + s1 + s2;

        System.out.println(X);

        int d1  = Integer.parseInt("123");
        double e = Double.parseDouble("2.233");
        char f  = 'P';
        boolean g = Boolean.parseBoolean("true");


        char letter = 'b';

        System.out.println(Character.isLetter(letter));
        System.out.println(Character.isUpperCase(letter));

    }
}
