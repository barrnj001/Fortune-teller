package com.fortuneteller;

import java.util.Scanner;

public class FortuneTellerApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		String Help = "Red, Orange, Yellow, Green, Blue, Indigo, Violet.";

//		String[] roygbiv = new String[7];
//		
//		roygbiv[0]= "Red";
//		roygbiv[1]= "Orange";
//		roygbiv[2]= "Yellow";
//		roygbiv[3]= "Green";
//		roygbiv[4]= "Blue";
//		roygbiv[5]= "Indigo";
//		roygbiv[6]= "Violet";
//		
//		int[] month = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12
//				
//		};

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

		System.out.println(
				"If you'll be so kind, tell me you're favorite ROYGBIV color, make sure the first letter is capitalized. Don't know what ROYGBIV is? Ask for 'Help'");
		
		do {
			Help
		} while (faveColor.equals("Help"))

//		for (faveColor.equals("Help");;) {
//			System.out.println(Help);
//			System.out.println("Tell me your favorite color now.");
//			faveColor = input.nextLine();
//
//			break;
//		}
//		else String faveColor = input.nextLine();


		System.out.println("Good job! Now I need the number of siblings you have.");
		int sibNumber = input.nextInt();
		input.nextLine();

		// how long will they retire for?

		String ryears = null;
		if (userAge % 2 == 0) {
			ryears = "20";
		}
		if (!(userAge % 2 == 0)) {
			ryears = "when the universe ends";
		}

		// now to find vacay home

		String vhome = null;
		if (sibNumber < 0) {
			vhome = "Travel Destination";
		}
		if (sibNumber == 0) {
			vhome = "Travel Destination";
		}
		if (sibNumber == 1) {
			vhome = "Travel Destination";
		}
		if (sibNumber == 2) {
			vhome = "Travel Destination";
		}
		if (sibNumber == 3) {
			vhome = "Travel Destination";
		}
		if (sibNumber > 5) {
			vhome = "Travel Destination";
		}

		// next is their car
		String fCar = null;
		if (faveColor == "Red") {
			fCar = "Car";
		}
		if (faveColor == "Orange") {
			fCar = "Car";
		}
		if (faveColor == "Yellow") {
			fCar = "Car";
		}
		if (faveColor == "Green") {
			fCar = "Car";
		}
		if (faveColor == "Blue") {
			fCar = "Car";
		}
		if (faveColor == "Indigo") {
			fCar = "Car";
		}
		if (faveColor == "Violet") {
			fCar = "Car";
		}

		// next is bank balance
		String bBal = null;
		if (birthMonth <= 4) {
			bBal = "...well, it will be empty.";
		}
		if (birthMonth < 4 && birthMonth > 9) {
			bBal = "$2,147,483,647";
		}
		if (birthMonth <= 9) {
			bBal = "$9,223,372,036,854,775,807";
		}

		System.out.println(firstName + " " + lastName + " will retire in " + ryears + ", with " + bBal
				+ " in the bank, a vacation home in " + vhome + ", and travel by " + fCar);
	}

}
