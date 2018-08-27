package com.fortuneteller;

import java.util.Scanner;

public class FortuneTellerApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		String Help = "Red, orange, yellow, green, blue, indigo, violet.";
		System.out.println("A new vision befalls me. Tell me your first name!");
		String firstName = input.nextLine();

		System.out.println("Good, good. Now, your last name");
		String lastName = input.nextLine();

		System.out.println("Quickly, I don't have all day. Now don't be shy, how old are you?");
		int userAge = input.nextInt();
		input.nextLine();

		System.out.println(
				"So, your name is " + firstName + " " + lastName + ", and you're " + userAge + " years old? Excellent");

		System.out.println(
				"Excellent! Now, I need just a bit more information from you. What number is your birth month?");
		int birthMonth = input.nextInt();
		input.nextLine();
		
		String roygbiv = "Red, orange, yellow, green, blue, indigo, violet";
		
		while (true) {

		System.out.println("If you'll be so kind, tell me you're favorite ROYGBIV color. Don't know? Ask for 'Help'");
		String faveColor = input.nextLine();

		if (faveColor.equals("Help") || faveColor.equals("help")) {
			System.out.println(Help);
			
			//need to make it so thing repeats question if help or not color
		} do {
			if (!faveColor.equals(roygbiv));
			System.out.println("Ah, ah, ah! I said a ROYGBIV color! Please enter a ROYGBIV color. Confused? Ask for help.");
			
			} while (!faveColor.equals(roygbiv));
		
			if (faveColor.equals(roygbiv));
			System.out.println("Your obedience will be rewarded. Patience.");
			System.out.println("How many siblings do you have?");

			int sibNumber = input.nextInt();
			input.nextLine();
			 
		
		
		
		}

	}

}
