package com.main;

import java.util.ArrayList;
import java.util.List;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import com.scanner.TheScanner;
import com.serialization.Person;
import com.serialization.Serialization;
import com.serialization.TheLogin;
import com.serialization.Person;
import com.serialization.PersonAndCar;
import com.serialization.Car;
import com.main.TheMain;

public class RetrieveTheArrayLists {
	
	
	public static ArrayList<Person> personList = new ArrayList<Person>();
	public static ArrayList<PersonAndCar> personAndCarList  = new ArrayList<PersonAndCar>();
	public static ArrayList<Car> carList  = new ArrayList<Car>();
	
	public static String PersonFile = "personfile.txt";
	public static String PersonAndCarFile = "pandc.txt";
	public static String CarFile = "car.txt";
	
	public static void retrieveTheArrays() {

	
	if(createTheFiles(PersonFile) == false) {
		personList = Serialization.readPersonObjectList(PersonFile);
	}
	if(createTheFiles(PersonAndCarFile) == false) {
		personAndCarList = Serialization.readPersonAndCarObjectList(PersonAndCarFile);
	}
	if(createTheFiles(CarFile) == false) {
		carList = Serialization.readCarObjectList(CarFile);
	}
}	
	public static boolean createTheFiles(String filename) {
		boolean createdfile = false;
		try
		{
			File fname = new File(filename);
			createdfile = fname.createNewFile();
			if(createdfile == true) {
				System.out.println("Empty file " + filename + " created.");
			}
		} catch (EOFException e) {
			System.out.println("EOF for " + filename);
		} catch (IOException e) {
//			e.printStackTrace();
		}
		System.out.println(createdfile);
		return createdfile;
		
	}

}
