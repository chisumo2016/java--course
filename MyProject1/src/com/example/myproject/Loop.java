package com.example.myproject;
import java.util.Scanner;


public class Loop {
	
	public static void main() {
		try(Scanner sc = new Scanner(System.in)){
			System.out.print("Enter the first number : ");
			int num = sc.nextInt();
			if(num >= 0) {
				System.out.println("Number is positive ");
			}else {
				System.out.println("The number is negative");
			}
		}
	}

}
