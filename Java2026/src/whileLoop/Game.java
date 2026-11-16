package whileLoop;


import java.util.Scanner;

public class Game {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String response = "";

        while(!response.equals("Q")){
            System.out.println("You are playing a game ");

            System.out.print("YPress Q to quit");
            response = scanner.next().toUpperCase();
        }

        System.out.println("You have quit the game");

        scanner.close();

    }
}
