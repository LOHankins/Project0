package com.serialization;

import com.main.RetrieveTheArrayLists;
import com.scanner.TheScanner;
import com.serialization.Person;

public class PersonAndCar {


	private static final long serialVersionUID = 4L;
	static String email;
	private String vin;
	private String bidForCar;
	private static boolean own;
	private String loanPct;
	private String loanLength;
	private String loanMonthly;
	private static String lm;



	public PersonAndCar(String email, String vin, String bidForCar, String loanPct, String loanLength, String loanMonthly, boolean own) {
		super();
		this.email = email;
		this.vin = Car.vin;
		this.bidForCar = bidForCar;
		this.loanPct = loanPct;
		this.loanLength = loanLength;
		this.loanMonthly = loanMonthly;
		this.own = own;
	}

	
	public static String CalculateLoan(String bidForCar, String loanPct, String loanLength) {
		
		
		return lm;
	}



	public static PersonAndCar buildPersonAndCar() {
		
		//temp email
		String email = "TheGoat@gmail.com";
		
		System.out.println("--PLEASE ENTER Your Bid for this vehicle ");
		String bidForCar=TheScanner.s.next();
		
		System.out.println("--PLEASE ENTER THE LOAN PERCENTAGE (AS N.NN");
		String loanPct=TheScanner.s.next();
	
		System.out.println("--PLEASE ENTER THE LENGTH OF LOAN (IN MONTHS");
		String loanLength=TheScanner.s.next();
		
		System.out.println("--PLEASE ENTER The Year of the Automobile");
		String loanMonthly = CalculateLoan(bidForCar, loanPct, loanLength);
	
		own = false;
		
//		System.out.println("--You have entered a bid of $" + bidForCar + "for a " + make + " " + model);
		System.out.println("with a Loan rate of " + loanPct + "% and length of loan of " + loanLength + " months.");
		System.out.println("That will give you a monthly note of " + loanMonthly);
		
		PersonAndCar pandc = new PersonAndCar(Car.vin, email, bidForCar, loanPct, loanLength, loanMonthly, own);
		
		RetrieveTheArrayLists.personAndCarList.add(new PersonAndCar(Car.vin, email, bidForCar, loanPct, loanLength, loanMonthly, own));
		
		System.out.println(RetrieveTheArrayLists.personAndCarList);
//		Serialization.writeObject("pandc.txt", pandc);
		
		
		return pandc;
	}
	
}