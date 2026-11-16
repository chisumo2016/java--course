package oops.overloadedContsructor;

public class User {

    String username;
    String email;
    int age;

    /*Constructor without parameters*/
    User() {
        this.username = "Guest";
        this.email = "Not provided";
        this.age = 0;
    }

    /*Constructor overloaded*/
    User(String username) {
        this.username = username;

        /*attributes are optionals*/
        this.email = "Not provided";
        this.age= 0;
    }

    User(String username, String email) {
        this.username = username;
        this.email = email;
        this.age= 0;
    }

    User(String username, String email, int age) {
        this.username = username;
        this.email = email;
        this.age = 0;
    }
}
