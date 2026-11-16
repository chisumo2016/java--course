package printf;
/*
   Printf() is a method used to format output.
   %[flags][width][.precision][specifier-character]
   %[format_specifier][width][.precision][flags][length]
 */
public class Main {

    public static void main(String[] args) {

        String name = "John Do";
        char firstLetter = 'S';
        int age = 30;
        double height = 60.5;
        boolean isEmployed = true;


        System.out.printf("Hello %s\n", name);
        System.out.printf("Your name starts with a %c\n", firstLetter);
        System.out.printf("You are %d years old\n", age);
        System.out.printf("Your height is %.1f inches\n", height);
        System.out.printf("You are employed: %b\n", isEmployed);

        System.out.printf("%s is %d years old\n", name, age);
        System.out.printf("%s is %.1f inches tall\n", name, height);




    }
}
