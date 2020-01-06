package com.main;

import com.scanner.TheScanner;
import com.serialization.Car;
import com.main.*;

public class EmployeeFunctions {
	
	public static int theFunctionChoice = 0;
	
	
	
	public static int getTheFunctionChoice() {
		return theFunctionChoice;
	}

	public static void setTheFunctionChoice(int theFunctionChoice) {
		EmployeeFunctions.theFunctionChoice = theFunctionChoice;
	}

	public static void performEmployeeFunctions() {
		
		System.out.println("Please select a function to perform");
		System.out.println("Enter 1 to Add a car to the inventory");
		System.out.println("Enter 2 to Remove a car from inventory");
		System.out.println("Enter 3 to View an Individual car to Accept or Reject bids");
		System.out.println("Enter 4 to View all payments");
		System.out.println("Enter 5 to Quit");
		
		theFunctionChoice = TheScanner.s.nextInt();
		
		switch(theFunctionChoice) {
		case 1:
			addCarToInventory();
			break;
		case 2:
			removeCarFromInventory();
			break;
		case 3:
			acceptRejectBids();
			break;
		case 4:
			viewAllPayments();
			break;
		case 5:
			endSession();
			break;
		default:
			System.out.println("Something went wrong in case statement");
		}
	}
	
	public static void addCarToInventory() {
		System.out.println("addCarToInventory");
		Car.buildCar();
		
	}
	
	public static void removeCarFromInventory() {
		System.out.println("remove car from inventory");
		Car.removeCar();
	}
	
	public static void acceptRejectBids() {
		System.out.println("Accept or Reject Bids");
	}
	
	public static void viewAllPayments() {
		System.out.println("View all Payments");
	}
	
	public static void endSession() {
		System.out.println("End Session");
	}


}
