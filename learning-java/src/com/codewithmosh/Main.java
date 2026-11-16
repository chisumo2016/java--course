package com.codewithmosh;
import java.text.NumberFormat;
import java.util.Scanner;


public class Main {
    // loops 1: for each - collection or arrays ()
    public static void main(String[] args) {

        // Mortgage calculator

        final int MONTHS_IN_YEAR = 12;
        final int PERCENT = 100;

        int   principal = 0;
        float monthlyInterestRate = 0;
        int   numberOfPayments = 0;

        Scanner scanner = new Scanner(System.in);

       while(true){
           System.out.print("Principal: ");
           principal = scanner.nextInt();
           if (principal >= 1000 && principal <= 1_000_000)
               break;
           System.out.println("Enter a value between 1,000 and 1,000,000");
       }

       while(true){
           System.out.print("Annual Interest Rate: ");
           float annualInterestRate = scanner.nextFloat();

           if (annualInterestRate >= 1  && annualInterestRate <= 30) {
               monthlyInterestRate =
                       annualInterestRate / PERCENT / MONTHS_IN_YEAR;
               break;
           }
           System.out.println("Enter a value between 1 and 30");
       }

      while(true){
          System.out.print("Period (Years): ");
          int years = scanner.nextInt();
          if (years >= 1 && years <= 30){
               numberOfPayments = years * MONTHS_IN_YEAR;
              break;
          }
          System.out.println("Enter a value between 1 and 30");
      }

        double monthlyPayment =
                principal * monthlyInterestRate /
                        (1 - Math.pow(1 + monthlyInterestRate, -numberOfPayments));

        String mortgageFormatted =
                NumberFormat.getCurrencyInstance().format(monthlyPayment);

        System.out.println("Mortgage: " + mortgageFormatted);
    }
}