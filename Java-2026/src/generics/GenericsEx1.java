package generics;
/*
   Important - high level
   Generics Classes - (A kind of Template class in C++)
   Classes with  parameters so that they provide a way re-use  the same code for different types.
   Allows a stronger type checking at compile time.

   Problem : //This code is applicable for  integer , i cant use float , student object , collection , string
     class Sample{
            private int value ;

            public  void setValue(int value){
                this.value = value;
            }

            public int getValue(){
                return this.value;
            }
}

  Problem 2 java.lang.ClassCastException
    class Sample{
    private  Object value;

    public  void setValue(Object value){ // ACCEPT OBJETC
        this.value = value;
    }

    public Object getValue(){ // RETURN OBJECT
        return this.value;
    }
}

  Sample sample4 = new Sample();
        sample4.setValue("xyz");
        Integer a = (Integer) sample4.getValue();
        System.out.println(a);

        AVOID
        To design a template
        class Sample <T>{}

        public class GenericsEx1 {

    public static void main(String[] args) {

        Sample<Integer> sample = new Sample<Integer>();
        sample.setValue(10);
        System.out.println(sample.getValue());

            }
}

 */


class Sample <T>{
    private  T value;

    public  void setValue(T value){ // ACCEPT OBJETC
        this.value = value;
    }

    public Object getValue(){ // RETURN OBJECT
        return this.value;
    }
}
public class GenericsEx1 {

    public static void main(String[] args) {

        Sample<Integer> sample = new Sample<Integer>();
        sample.setValue(10);
        System.out.println(sample.getValue());

        Sample<Double> sample2 = new Sample<Double>();
        sample2.setValue(10.90);
        System.out.println(sample2.getValue());

        Sample<String> sample3 = new Sample<String>();
        sample3.setValue("abc");
        System.out.println(sample3.getValue());

        /*Sample<String> sample4 = new Sample<String>();
        sample4.setValue("xyz");
        Integer a = (Integer) sample4.getValue();
        System.out.println(a);*/

    }
}
