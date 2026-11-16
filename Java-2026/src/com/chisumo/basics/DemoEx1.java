package com.chisumo.basics;

import java.util.Scanner;

/*
        Data Types
            integral types : byte, short, int, long
            floating point types : float, double
            boolean types : boolean
            character types : char
            String types : String

            eg SI= P*T*R/100

            Standard Streams

            System.in   - Standard input stream (connected to keyboard)
            System.out  - Standard output stream (connected to monitor)
            System.err  - Standard error stream  (connected to monitor)

         Scanner METHOD
            nextInt()       - for reading integer values
            nextDouble()   - for reading double
            nextLine()     - forreading one line text
  */
public class DemoEx1 {

    public static void main(String[] args) {
        double si, p, t, r;

        // Read from keyboard
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter Principal amount :");
        p = scanner.nextDouble();

        System.out.println("Enter Tenure :");
        t = scanner.nextDouble();

        System.out.println("Enter rate :");
        r = scanner.nextDouble();

        si = (p * t * r) / 100;

        System.out.println("Simple Interest is :" + si);
       // System.out.printf("Simple Interest - %lf \n", si);

    }
}
