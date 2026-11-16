package oops.superMethod;

import java.lang.classfile.attribute.SourceDebugExtensionAttribute;

/***
 *  Supper : Refers to the parent class (subclass(child) <---superclass(parent)
            Used in constructor and method overriding
            Calls the parent class constructor to initialize the parent class
            Calls the parent class method to override the parent class method

        keyword : super()
 */
public class Main {

    public static void main(String[] args) {

        Person person = new Person("John", "Doe");
        Student student = new Student("Jane", "Doe", 3.5);
        Employee employee = new Employee("John", "Doe", 50000);

        System.out.println();
        person.showName();
        student.showName();

        System.out.println();
        System.out.println(student.gpa);

        System.out.println();
        student.showGpa();

        System.out.println();
        employee.showSalary();
    }
}
