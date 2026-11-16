package whileLoop;

import java.util.Scanner;

/**
     while loop = repeat some code forever while some condition remain true
 */
public class Demo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String name = "";

        while (name.isEmpty()){
            //continue forever
            System.out.print("Please enter your name");
            name = scanner.nextLine();
        }
        System.out.println("Helow" + name);
        scanner.close();
    }

}
