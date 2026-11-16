package methods;

/*
 * Return the value ; Will return the value after function is called
 */
public class ReturnTheValue {

    public static void main(String[] args) {


        //System.out.println(square(3));
        System.out.println(cube(3));

        String fullName = getFullName("John", "Doe");
        System.out.println(fullName);

        int age = 7;

        if (ageCheck(age)){
            System.out.println("You are an adult");
        }else {
            System.out.println("You must be 18+ ro sign up");
        }

    }

    static double square(double number){

        return number * number;
    }

    static double cube(double number){

        return number * number * number;
    }

    static  String getFullName(String first, String last){

        return first + " " + last;
    }

    static boolean ageCheck(int age){

       // return  age >= 18;
        if (age >= 18)
            return true;
        else
            return false;
    }
}
