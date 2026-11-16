package oops.overloadedContsructor;

/**
 *  Overloaded constructor : Allow a class to have multiple constructors with different parameters
 *  Enable objects to initialize with different parameters/variaous way
 */
public class Main {
    public static void main(String[] args) {

        User user1 = new User("John Doe");
        User user2 = new User("Partrice" ,"patric@aol.com");
        User user3 = new User("dorice" ,"dorice@gmail.com", 25);
        User user4 = new User();

        System.out.println(user1.username);
        System.out.println(user1.email);
        System.out.println(user1.age);

        System.out.println();

        System.out.println(user2.username);
        System.out.println(user2.email);
        System.out.println(user2.age);

        System.out.println();

        System.out.println(user3.username);
        System.out.println(user3.email);
        System.out.println(user3.age);

        System.out.println();

        System.out.println(user4.username);
        System.out.println(user4.email);
        System.out.println(user4.age);


    }
}
