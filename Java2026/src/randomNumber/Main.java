package randomNumber;

import java.util.Random;

/*Random Number **/
public class Main {

    public static void main(String[] args) {

        Random random = new Random();
        int randomNumber1 ;
        int randomNumber2 ;
        int randomNumber3 ;
        double number;
        boolean  isHeads;

        randomNumber1 = random.nextInt(1,101); // inclusive and exclusives
        randomNumber2 = random.nextInt(1,101);
        randomNumber3 = random.nextInt(1,101);

        number = random.nextDouble();
        isHeads = random.nextBoolean();

        System.out.println("Random number: " + randomNumber1);
        System.out.println("Random number: " + randomNumber2);
        System.out.println("Random number: " + randomNumber3);
        System.out.println("Random number: " + isHeads);

        if (isHeads)
        {
            System.out.println("Heads");
        }else {
            System.out.println("Tails");
        }


    }
}
