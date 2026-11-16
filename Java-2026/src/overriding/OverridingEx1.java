package overriding;

/**
     Overriding
        Mechanism to modify/replace an existing function/method of the base class/superclass
        Modification is the form of overriding

        super.print();

        Annotation @Override is used to indicate that a method is overriding a method in the superclass.
        @Override

     message signature of supper class should match to child class.
     @Override
 */

class Person{
    private String name;

    public  void setName(String name) {
        this.name = name;
    }

    public void  print() {
        System.out.println("name is " + name);
    }
    public String getName() {
        return name;
    }
}

class Contact extends Person{
    private  String address;

    public  void setAddress(String address) {
        this.address = address;
    }

    //overring
    @Override
    public void  print() {
        super.print();
        System.out.println("address is " + address);
    }
}

public class OverridingEx1 {
    public static void main(String[] args) {

        Person person = new Person();
        person.setName("John");
        person.print();

        System.out.println();
        Contact contact = new Contact();
        contact.setName("Doe");
        contact.setAddress("123 Roy Road");
        contact.print();
        //contact.printAddress();
    }
}
