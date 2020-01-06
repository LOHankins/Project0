package com.serialization;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;

import com.main.RetrieveTheArrayLists;
import com.scanner.TheScanner;

public class Car implements Serializable {
	
	private static final long serialVersionUID = 4L;
	public static String vin;
	private String make;
	private String model;
	private String year;
	private String price;
	private static boolean sold;
	private static int deletedItemIndex;
	
	
	public Car(String vin, String make, String model, String year, String price, Boolean sold) {
		super();
		this.vin = vin;
		this.make = make;
		this.model = model;
		this.year = year;
		this.price = price;
		this.sold = sold;
	}
	


	public static Car buildCar() {

		System.out.println("---Enter a new automobile for the Auto Lot");
		
		System.out.println("--PLEASE ENTER THE VIN NUMBER ");
		String vin=TheScanner.s.next();
		
		System.out.println("--PLEASE ENTER THE MAKE OF THE AUTOMOBILE");
		String make=TheScanner.s.next();

		System.out.println("--PLEASE ENTER THE MODEL OF THE AUTOMOBILE");
		String model=TheScanner.s.next();
		
		System.out.println("--PLEASE ENTER The Year of the Automobile");
		String year = TheScanner.s.next();

		System.out.println("--PLEASE ENTER The Price of the Automobile");
		String price = TheScanner.s.next();
		System.out.println("You ARE ENTERING A: " +year +" " +make + " " + model + " for $" + price);
				
		System.out.println("Has this vehicle been sold?, Y or N");
		String sld = TheScanner.s.next();
		Boolean sold = false;
		if(sld == "y" || sld == "Y" || sld == "yes" || sld == "Yes") {
			sold = true;
		}
		
		Car c = new Car(vin, make, model, year, price, sold);
		
		RetrieveTheArrayLists.carList.add(new Car(vin, make, model, year, price, sold));

		System.out.println(RetrieveTheArrayLists.carList);
//		System.out.println(Arrays.toString(RetrieveTheArrayLists.carList));
		
		System.out.println("THE Automobile IS: \n" + c);
		return c;
	}
	
	public static void removeCar() {
		
		if(RetrieveTheArrayLists.carList.isEmpty()) {
			System.out.println("No inventory to display");
		} else {
		// list all auto inventory
		listAutoInventory();
		System.out.println("Enter index of item to be deleted");
		deletedItemIndex = TheScanner.s.nextInt();
		RetrieveTheArrayLists.carList.remove(deletedItemIndex);
		System.out.println("Item Removed");
		listAutoInventory();
		
		
		}
		

	}
	
	@Override
	public String toString() {
		return "Car [make=" + make + ", model=" + model + ", year=" + year + ", price=" + price + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}



	public static void listAutoInventory() {
		
		for(int i = 0; i < RetrieveTheArrayLists.carList.size(); i++) {
			System.out.println("index = " + i + " " + RetrieveTheArrayLists.carList.get(i));
		}
		
	}

}
