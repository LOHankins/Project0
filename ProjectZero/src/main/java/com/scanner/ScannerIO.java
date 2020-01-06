package com.scanner;

import java.util.Scanner;

import com.serialization.Person;
import com.serialization.Serialization;

public class ScannerIO {

	public static void main(String[] args) {
		
	}
		
	static Person buildPerson() {

		Serialization.writeObject("scannedHuman.txt", buildPerson());
		
		System.out.println("---Signup for the Auto Lot App");
		
		System.out.println("--PLEASE ENTER YOUR First Name");
		String firstName=TheScanner.s.nextLine();
		System.out.println("--PLEASE ENTER YOUR Last Name");
		String lastName=TheScanner.s.nextLine();
		System.out.println("Your NAME IS: "+firstName + " " + lastName);
		
		System.out.println("--PLEASE ENTER your email address");
		String email = TheScanner.s.nextLine();
		System.out.println("Your email address is: "+email);
		
		System.out.println("--PLEASE enter a password");
		String password = TheScanner.s.nextLine();
		
		System.out.println("Are you an employee, Y or N");
		String emp = TheScanner.s.nextLine();
		Boolean employee = false;
		if(emp == "y" || emp == "Y") {
			employee = true;
		}
		
		Person p = new Person(firstName, lastName, email, password, employee);
		
		System.out.println("THE PERSON IS: \n" + p);
		return p;
	}
	
	
	
	
	
	
	
	
	
	
	static void trash() {
		Scanner scan = new Scanner(System.in);
		System.out.println("how many would you like?");
		int selected = scan.nextInt();
		switch(selected) {
		case 1:
			System.out.println("you wanted one??? how dare you");
			break;
		case 2:
			System.out.println("two coming right up");
			break;
		case 3:
			System.out.println("you are so greedy");
			break;
		default:
			System.out.println("does not compute");
			break;
		}
		scan.close();
	}
}

