package oops.superMethod;

/*Parent class*/

public class Person {

    String firstName;
    String lastName;

    /*Construtor*/
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    void showName() {
        System.out.println("Name : " + firstName + " " + lastName);
    }
}
