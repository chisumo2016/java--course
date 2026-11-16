package com.example.myproject;

import java.util.Scanner;

// else if 
public class Loop2 {
	
	public static void main() {
		try(Scanner sc = new Scanner(System.in)){
			System.out.print("Enter your choice , 1 for the Noodles, 2 for Milkshake, 3 for fruits , 4 for Coffee ");
			int choice = sc.nextInt();
			if( choice == 1) {
				System.out.println("Noodles ");
			}else if(choice == 2) {
				System.out.println("Milkshake");
			}else if(choice == 3) {
				System.out.println("fruits");
			}else if(choice == 4) {
				System.out.println("Coffee");
			}else  {
				System.out.println("Invalid input");
			}
			
		}
	}

}
