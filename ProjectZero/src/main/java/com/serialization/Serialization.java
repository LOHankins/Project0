package com.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.main.RetrieveTheArrayLists;

import java.io.*;

public class Serialization {
	
	public static String theEmail = "Tenns@gmail.com";
	public static String thePassword = "12345678";
	public static String theEnteredEmail = "LOHankins@gmail.com";
	public static String theEnteredPassword = "12345678";
	public static boolean loginBoolean = false;
	public static List<String> testString = new ArrayList<>();

	public static void main(String[] args) {
		String filename= "objects.txt";
		testString.add(new String("LOHankins@gmail.com"));
/*		System.out.println("testString = " + testString);
		List<Person> list = new ArrayList<>();
		list.add(new Person("Louis", "Hankins", "LOHankins@gmail.com", "12345678", false));
		list.add(new Person("Alexander", "Hamilton", "Alex@gmail.com", "87654321", false));
		list.add(new Person("Serena", "Williams", "Tennis@gmail.com", "12341234", false));
		list.add(new Person("Osceola", "Hansberry", "Osceola@gmail.com", "43214321", false));
		list.add(new Person("George", "Everett", "LOH@gmail.com", "12121212", false));
		String firstName, String lastName, String email, String password, Boolean employee;
		System.out.println("list = " + list);
		writeObjectList(filename, list);
		list = readObjectList(filename);
		System.out.println(list.size());
		System.out.println(list);
		System.out.println("entered email =" + theEnteredEmail +";  entered password =" + theEnteredPassword);
		
		for(int i = 0; i < list.size(); i++) {
			loginBoolean = false;
			System.out.println("i = " + i +" " +list.get(i).email+ "  " + list.get(i).password);
			System.out.println(list.get(i));
			theEnteredEmail = list.get(3).email;
			if (list.get(i).email == theEnteredEmail) {
				System.out.println("Login successful");
				loginBoolean = true;
				break;
			}
			
		}
		System.out.println(loginBoolean);
		if (loginBoolean == false) {
			System.out.println("Login unsuccessful");
		}
*/
//		System.out.println(readObject("scannedHuman.txt")); //getting the object
				//from ScannerExample
	}
	
	public static void writeObject(String file, Object o) {
		System.out.println("writeObject");
		System.out.println(file);
		
		File theFile = new File(file);
		if (!theFile.exists()) {
			try {
				theFile.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		try 

			
		
		
		(ObjectOutputStream oos = new ObjectOutputStream(
				new FileOutputStream(file, true))){
			
			oos.writeObject(o);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		}
		
		
	
	public static Object readObject(String file) {
		System.out.println("readObject");
		try(ObjectInputStream is = new ObjectInputStream(
				new FileInputStream(file))){
			System.out.println(is);
			
			return is.readObject();
			
		}  catch (EOFException e) {
			e.printStackTrace();
		}	catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	
	public static void writeObjectListPerson(String file, List<Person> o) {
		try(ObjectOutputStream os  = new ObjectOutputStream(
				new FileOutputStream(file))) {
			
			os.writeObject(o);
			
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}	
	static void writeObjectListCar(String file, List<Car> o) {
		try(ObjectOutputStream os  = new ObjectOutputStream(
				new FileOutputStream(file))) {
			
			os.writeObject(o);
			
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}	
	static void writeObjectListPersonAndCar(String file, List<PersonAndCar> o) {
		try(ObjectOutputStream os  = new ObjectOutputStream(
				new FileOutputStream(file))) {
			
			os.writeObject(o);
			
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
	
	@SuppressWarnings("unchecked")
	public static List<Person> readObjectList(String file) {
		try(ObjectInputStream ois = new ObjectInputStream(
				new FileInputStream(file))){
			
			return (List<Person>)ois.readObject();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}
	@SuppressWarnings("unchecked")
	public static ArrayList<Person> readPersonObjectList(String file) {
		try(ObjectInputStream ois = new ObjectInputStream(
				new FileInputStream(file))){
			
			return (ArrayList<Person>)ois.readObject();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	@SuppressWarnings("unchecked")
	public static ArrayList<Car> readCarObjectList(String file) {
		try(ObjectInputStream ois = new ObjectInputStream(
				new FileInputStream(file))){
			
			return (ArrayList<Car>)ois.readObject();
			
		
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}
	

	@SuppressWarnings("unchecked")
	public static ArrayList<PersonAndCar> readPersonAndCarObjectList(String file) {
		try(ObjectInputStream ois = new ObjectInputStream(
				new FileInputStream(file))){
			
			return (ArrayList<PersonAndCar>)ois.readObject();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}
}
