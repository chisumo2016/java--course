package slotMachine;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

/*

 */
public class Main {

    public static void main(String[] args) {

    /*declare variables*/
        Scanner scanner = new Scanner(System.in);
        int balance = 100;
        int bet;
        int payout;
        String[] row;
        String playAgain;

    /*display welcome message*/
        System.out.println("**************************************");
        System.out.println("    Welcome to the slot machine!    ");
        System.out.println("Symbols: 🍒   🍉  🍋   🔔   ⭐️");
        System.out.println("**************************************");
    /*play if balance > 0*/
        while (balance > 0) {
            /*enter bet amount*/
            System.out.println("Current balance: $" + balance);
            System.out.print("Place your bet amount: ");
            bet = scanner.nextInt();
            scanner.nextLine();

            // verify if bet > balance
            if (bet > balance){
                System.out.println("INSUFFICIENT FUNDS");
                continue;
            } else if (bet <= 0) {  // verify if bet > 0
                System.out.println("Bet must be greater than 0");
                continue; //sikp current iteration
            }else {
                // subtract bet from 🔔
                balance -= bet; //balance = balance -bet
                //System.out.println("$" + balance);
            }
            /* spin row*/
            System.out.println("Spinning....");
            row = spinRow();
            printRow(row);
            payout = getPayOut(row, bet);

            if (payout > 0){
                balance += payout;
                System.out.println("You won $" + payout);
            }else {
                System.out.println("Sorry you lost this round " );
                //System.out.println("Sorry you lost this round $" + bet);
            }

            /*ask to play again*/
            System.out.println("Do you want to play again? (Y/N)");
            playAgain = scanner.nextLine().toUpperCase();

            if (!playAgain.equals("Y")){
                break;
            }
        }

    /* display goodbye message*/
        System.out.println("GAME OVER ! Your final balance is $" + balance);

        scanner.close();
    }

    /* spin row*/
    static String[] spinRow(){
        String[] symbols = { "🍒" , " 🍉" , "🍋 ",  "🔔 " , "⭐️" };
        String[] row = new String[3];
        Random random = new Random();

        //System.out.println(symbols[random.nextInt(symbols.length)]); //(0,5)

        for (int i = 0; i < row.length; i++) {
            row[i] = symbols[random.nextInt(symbols.length)];
        }
        //System.out.println(row[0] + " " + row[1] + " " + row[2]);
        return  row;
    }

    /* print row*/
    static void printRow(String[] row){
        System.out.println("**************");
        System.out.println(" " + String.join(" |  ", row));
        System.out.println("**************");
        //System.out.println(row[0] + " " + row[1] + " " + row[2]);
    }

    /* get payout*/
    static  int getPayOut(String[] row, int bet){
        if (row[0].equals(row[1]) && row[1].equals(row[2])){
            return switch (row[0]){
                case "🍒" -> bet * 3;
                case "🍉" -> bet * 4;
                case "🍋" -> bet * 5;
                case "🔔" -> bet * 10;
                case "⭐️" -> bet * 20;
                default -> 0;
            };

        }
        else if(row[0].equals(row[1])){
            return switch (row[0]){
                case "🍒" -> bet * 2;
                case "🍉" -> bet * 3;
                case "🍋" -> bet * 4;
                case "🔔" -> bet * 5;
                case "⭐️" -> bet * 10;
                default -> 0;
            };
        }
        else if(row[1].equals(row[2])){
            return switch (row[1]){
                case "🍒" -> bet * 2;
                case "🍉" -> bet * 3;
                case "🍋" -> bet * 4;
                case "🔔" -> bet * 5;
                case "⭐️" -> bet * 10;
                default -> 0;
            };
        }
        return 0;
    }
}
