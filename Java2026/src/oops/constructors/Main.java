package oops.constructors;

/**
 * Constructor: A special method within the class, it used to initialize objects
                 You can pass parameters/arguments to a constructor
                 and set up initial values for object attributes

 */
public class Main {

    public static void main(String[] args) {

        Student student1 = new Student("Ben" , 30 , 3.2);
        Student student2 = new Student("Doe" , 34, 1.5);
        Student student3 = new Student("Sandy" , 40, 4.0);

        System.out.println(student1.name);
        System.out.println(student1.age);
        System.out.println(student1.gpa);
        System.out.println(student1.isEnrolled);

        System.out.println();

        System.out.println(student2.name);
        System.out.println(student2.age);
        System.out.println(student2.age);
        System.out.println(student2.isEnrolled);

        System.out.println();

        System.out.println(student3.name);
        System.out.println(student3.age);
        System.out.println(student3.age);
        System.out.println(student3.isEnrolled);

        System.out.println();
        //call method
        student1.study();
        student2.study();
        student3.study();


    }
}
