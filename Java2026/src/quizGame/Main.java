package quizGame;

import java.util.Scanner;

/*
 * Quiz Game
 */
public class Main {

    public static void main(String[] args) {
          /*Questions arrays[]*/
        String[] questions = {
                "What is the main function of a router ?" ,
                "Which part of the computer is considered the brain ?" ,
                "What year was Facebook  lauched ?",
                "who is known as the father of computer ?",
                "What was the first programing language ?"
        };
   /*Options arrays[][]*/
          String[][] options = {
                  {"1. Connects devices to the internet" , "2. Storing data" , "3. Encrypting data" , "4. Show the password"},
                  {"1. CPU" , "2. Hard Drive" , "3. RAM" , "4. GPU"},
                  {"1. 2000" , "2. 2004" , "3. 2006" , "4. 2008"},
                  {"1. Steve Jobs" , "2. Bill Gates" , "3. Alan Turing" , "4. Charles Babbage"},
                  {"1. COBOL" , "2. C" , "3. Fortran" , "4. Assembly"}
          };

    /*Declare variables*/
        int[] answers = {1, 1,  2,  4,  3};
        int score = 0;
        int guess;

        Scanner scanner = new Scanner(System.in);

     /*Welcome Message*/
        System.out.println("*******************************");
        System.out.println("Welcome to the Java Quiz Game!");
        System.out.println("*******************************");


    /*Question (Loop)*/
        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);

            /* print through all the Options)*/
            for (String option: options[i]) {
                System.out.println(option);
            }
            /* Get guess from user input)*/
            System.out.print("Enter your guess (1-4): ");
            guess = scanner.nextInt();

            /* Check our guess)*/
            if (guess == answers[i]) {
                System.out.println("**********");
                System.out.println("Correct answer !");
                System.out.println("**********");
                score++;

            }else{
                System.out.println("**********");
                System.out.println("Wrong answer ! ");
                System.out.println("**********");
            }
        }
          /* Display final score)*/
        System.out.println("Your final score is: " + score + " out of " + questions.length);

        scanner.close();
    }
}
