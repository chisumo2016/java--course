package forLoops;

import java.util.Scanner;

/**
 * for Loop = execute some code a CERTAIN number/amount of times
    for( statement1 ;statement1 ; statement1){}
    for( initialization (counter)/loop control variable, ;condition (whne do want to stop) ; step ){}
 */
public class Demo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter how many times you want to loop: ");

        int max = sc.nextInt();

        for(int i = 0; i <= max; i++){

            System.out.println(i);
        }

        sc.close();


    }
}
