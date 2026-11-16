package oops.abstraction;

public abstract class Shape {

    //abstract method
    abstract double area();

    //concrete method is inherited / we dont need to override it to childre as it inherited.children willa ccess on it
    public void display() {
        System.out.println("This is a shape");
    }
}
