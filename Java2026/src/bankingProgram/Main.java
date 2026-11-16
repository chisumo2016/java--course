package bankingProgram;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {

        /*declare variables*/
         double balance = 0;
         boolean isRunning = true;
         int choice;

         while(isRunning){

             /* 1: Display Menu*/
             System.out.println("***************************");
             System.out.println("BANKING PROGRAM");
             System.out.println("***************************");
             System.out.println("1 . Show Balance");
             System.out.println("2 . Deposit");
             System.out.println("3 . Withdraw");
             System.out.println("4 . Exit");
             System.out.println("***************************");


             /*Get and process users' choice*/
             System.out.print("Enter your choice: (1 - 4): ");
             choice = scanner.nextInt();

             switch (choice){
                 case 1 -> showBalance(balance);//System.out.println("SHOW BALANCE ");
                 case 2 -> balance = balance + deposit(); //System.out.println("SHOW DEPOSIT "); balance +=deposit()
                 case 3 ->  balance = balance - withdraw(balance); //System.out.println("WITHDRAW "); balance -=withdraw(balance);
                 case 4 -> isRunning = false;
                 default -> System.out.println("INVALID CHOICE ");
             }

         }

         /*exit*/

        System.out.println("***************************");
        System.out.println("Thank you for using our banking system. ");
        System.out.println("***************************");

        scanner.close();
    }

    static void showBalance(double balance){
        /*2: showBalance()*/
        System.out.println("***************************");
        System.out.printf("$%.2f\n", balance);
    }
    static double deposit(){
        /*3: deposit()*/

        double amount;

        System.out.print("Enter an amount to be deposited: ");
        amount = scanner.nextDouble();

        if (amount < 0){
            System.out.println("Amount can't be negative");
            return 0;
        }
        else{
            return amount;
        }

    }

    static double withdraw(double balance) {
        /*4: withdraw()*/
        double amount ;

        System.out.print("Enter amount to be withdrawn : ");
        amount = scanner.nextDouble();

        if (amount > balance){
            System.out.println("Insufficient funds ");
            return 0;
        } else if (amount < 0) {
            System.out.println("Amount can't be negative");
            return  0;

        } else{
            return amount;
        }
    }

}
