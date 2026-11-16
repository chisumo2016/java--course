package oops.superMethod;

public class Employee  extends  Person{

    int salary;

    Employee(String firstName,String lastName , int salary) {
        /*call the constructor of the parent class*/
        super(firstName,lastName);
        this.salary = salary;
    }

    void showSalary() {
        System.out.println(this.firstName + "'s salary is  $ " + this.salary);
    }
}
