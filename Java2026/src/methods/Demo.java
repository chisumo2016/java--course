package methods;
/*
   method - a block od reusable code that is executed when called

   DRY
 */
public class Demo {

    public static void main(String[] args) {
        String name = "John Doe";
        int age = 20;


        //Argument
        happyBirthday(name, age);
        //happyBirthday();
        //happyBirthday();
    }

    //Pass parameters. name of parameters can be anything from Arguments
    static void happyBirthday(String name, int age) {
        System.out.println("Happy Birthday to you!");
        System.out.printf("Happy Birthday dear %s!\n", name);
        System.out.printf("You are %d years old!\n", age);
        System.out.println("Happy Birthday to you!\n");
    }
}
