package com.fortuneteller;

import java.util.Scanner;

public class FortuneTellerApp {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

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
				"Obedience is rewarded. Now, I need just a bit more information from you. What number is your birth month?");
		int birthMonth = input.nextInt();
		input.nextLine();

		System.out.println(
				"If you'll be so kind, tell me you're favorite ROYGBIV color. Don't know what ROYGBIV is? Ask for 'Help'");
		String faveColor = input.nextLine();

		if (faveColor.equals("Help")) {
			System.out.println("ROYGBIV");
			System.out.println("Tell me your favorite color now.");
			faveColor = input.nextLine();
		}

		System.out.println("Almost there now. Patience is also rewarded! Now I need the number of siblings you have.");
		int sibNumber = input.nextInt();
		input.nextLine();

		// how long will they retire for?

		String ryears = null;
		if (userAge % 2 == 0) {
			ryears = "20 years";
		}
		if (!(userAge % 2 == 0)) {
			ryears = "50 years";
		}

		// now to find vacay home

		String vhome = null;
		if (sibNumber < 0) {
			vhome = "Vesuvius";
		}
		if (sibNumber == 0) {
			vhome = "Paris, France";
		}
		if (sibNumber == 1) {
			vhome = "Cleveland, Texas";
		}
		if (sibNumber == 2) {
			vhome = "Sydney, Australia";
		}
		if (sibNumber == 3) {
			vhome = "Nagasaki, Japan";
		}
		if (sibNumber >= 4) {
			vhome = "London, England";
		}

		// next is their car
		String fCar = null;
		if (faveColor.equalsIgnoreCase("Red")) {
			fCar = "horse-drawn carriage.";
		}
		if (faveColor.equalsIgnoreCase("Orange")) {
			fCar = "teleportation.";
		}
		if (faveColor.equalsIgnoreCase("Yellow")) {
			fCar = "astral projection.";
		}
		if (faveColor.equalsIgnoreCase("Green")) {
			fCar = "a flaming chariot.";
		}
		if (faveColor.equalsIgnoreCase("Blue")) {
			fCar = "a normal car.";
		}
		if (faveColor.equalsIgnoreCase("Indigo")) {
			fCar = "a Rolls Royce";
		}
		if (faveColor.equalsIgnoreCase("Violet")) {
			fCar = "sports car.";
		}

		// next is bank balance
		String bBal = null;
		if (birthMonth >= 4 && birthMonth < 9) {
			bBal = "$2,147,483,647";
		}
		if (birthMonth <= 4) {
			bBal = "...well, it will be nothing";
		}
		if (birthMonth >= 9) {
			bBal = "$9,223,372,036,854,775,807";
		}
		System.out.println("The stars have spoken! Your fortune reads as follows:");
		System.out.println(firstName + " " + lastName + " will retire in " + ryears + ", with " + bBal
				+ " in the bank, a vacation home in " + vhome + ", and travel by " + fCar);
	}

}
