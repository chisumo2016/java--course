package variables;

/**Variables  are reusable container for a value
 * variable behaves as it was value it contains
 * Type of variables
     Primitive  = simple value stored directly in memory(stack)
     Reference  = memery address (stack) that points to object in heap

      Primitive vs Reference
      ---------    ------------
      int           string
      double        array
      char          object
      boolean

    2 : Steps to creating a variable
      1. Declare
      2. Initialize/assigment
      3. Use
  * */
public class Demo {

    public static void main(String[] args) {
          int age  = 21;
          int year  = 2025;
          int quantity = 100;

          double price = 10.5;
          double gpa = 3.5;
          double temperature = -12.5;

          char grade = 'A';
          char symbol = '!';
          char currency = '$';

         boolean isStudent = true;
         boolean forSale = false;
         boolean isOnline = true;


         //String name = "Bro Code";
         int gta = 6;
         double pi = 3.14;
         char gender = 'M';
         boolean isAdmin = false;


         String name = "John";
         String food = "Pizza";
         String email = "fake1233@gmail.com";
         String car = "Suzuki";
         String color = "red";

        System.out.println("The year is " + year);
        System.out.println("My grade is  " + grade);
        System.out.println("symbol " + symbol);
        System.out.println("$ " + currency);

        if (isStudent) {
            System.out.println("I am a student");
        }else {
            System.out.println("I am not a student");
        }

        System.out.println("My name is " + name);
        System.out.println("My favorite  is " + food);
        System.out.println("My email is " + email);
        System.out.println("My  car is " + car);
        System.out.println("You are " + age + " years old");
        System.out.println("Your gpa is " + gpa );
        System.out.println("Your avarage gpa is " + gpa );

        System.out.println("Your choice is " + color + " " + year + " " + car);
        System.out.println("The price is : " + currency + " " + price);

        if (forSale){
            System.out.println("The car is a " + car +  "for sale");
        }else {
            System.out.println("The  " + car +  " is not for sale");
        }
    }
}
