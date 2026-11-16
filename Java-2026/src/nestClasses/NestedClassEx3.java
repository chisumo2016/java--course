package nestClasses;
/*
    static nested class (all static members)

    use the Builder
 */

class Person{
    private String firstName;
    private String lastName;

    private Person() {}

    private Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public  void print(){
        System.out.println(firstName + " " + lastName);
    }

    //non static inner class
    static  class Builder{ // belong to a class
        Person internalState = new Person("", "");

        public  void withFirstName(String firstName){
            internalState.firstName = firstName;
        }

        public void withLastName(String lastName){
            internalState.lastName = lastName;
        }

        public Person build(){
            return internalState;
        }

    }
}
public class NestedClassEx3 {

    public static  void main(String[] args) {

//        Person person1 = new Person("John", "Doe");
//        person1.print();


        Person.Builder personBuilder = new Person.Builder();
        personBuilder.withFirstName("John");
        personBuilder.withLastName("Doe");
        Person person = personBuilder.build();
        person.print();



        person.print();
    }
}
