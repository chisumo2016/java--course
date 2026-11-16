package oops.constructors;

/**
     Student(String name , int age , double gpa){}

     word this is a constructor mean - refer to the object we're currently working on it

     Student(String name , int age , double gpa){
         student1.name = name;
         student1.age = age;
         student1.gpa = gpa;
        }

 */
public class Student {

    String name;
    int age;
    double gpa ;
    boolean isEnrolled;


    /*constructor*/
    Student(String name , int age , double gpa){
        /*Assign attribute*/
        this.name = name;
        this.age = age;
        this.gpa = gpa;
        this.isEnrolled = true; // not necessary
    }

    /*method*/
    void study(){
        System.out.println(this.name + " is  studying");
    }
}
