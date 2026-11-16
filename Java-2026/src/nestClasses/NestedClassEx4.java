package nestClasses;
/*
   Associated with Object  - Non Static
   Associated with CLASS  - Static
 */
class PersonB{
    private String firstName;
    private String lastName;

    private PersonB() {}

    private PersonB(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public  void print(){
        System.out.println(firstName + " " + lastName);
    }

    //non static inner class , Builder is design pattern , complex object can be handled via builder pattern
    static  class Builder{ // belong to a class
        PersonB internalState = new PersonB("", "");

        //FLUENT INTERFACE
        public  Builder withFirstName(String firstName){
            internalState.firstName = firstName;
            return this; //return the current builder object
        }

        public Builder withLastName(String lastName){
            internalState.lastName = lastName;
            return this;
        }

        public PersonB build(){
            return internalState; // return build object
        }

    }
}
public class NestedClassEx4 {

    public static void main(String[] args) {

        PersonB.Builder personBuilder = new PersonB.Builder();

        PersonB p = personBuilder
                .withFirstName("John")
                .withLastName("Doe")
                .build();
        p.print();
        //test().length();
    }
}

//    public  static String test(){
//        return "test";
//    }
//}
