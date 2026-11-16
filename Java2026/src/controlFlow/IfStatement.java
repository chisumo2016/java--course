package controlFlow;
/*
   if statement = perform a block of  code if its condition evaluates to true
* */
public class IfStatement {

    public static void main(String[] args) {
        int age = 70;

        if (age >= 65) {
            System.out.println("Your a senior");
        } else if (age >= 18) {
            System.out.println("You are an adult");
        } else if (age < 0) {
            System.out.println("You haven't been born yet");
        } else if (age == 0) {
            System.out.println("You are a baby");
        } else{
            System.out.println("You are a minor");
        }
    }
}
