package com.serialization;

import java.io.Serializable;
import java.util.ArrayList;
import com.main.RetrieveTheArrayLists;
import com.scanner.TheScanner;

public class Person implements Serializable {
	
	public Person(String firstName, String lastName, String email, String password, Boolean employee) {
		super();
		this.lastName = lastName;
		this.firstName = firstName;
		this.email = email;
		this.password = password;
		this.employee = employee;
	}
	
	public static Person buildPerson() {

		System.out.println("---Signup for the Auto Lot App");
		
		System.out.println("--PLEASE ENTER YOUR First Name");
		String firstName=TheScanner.s.next();
		
		System.out.println("--PLEASE ENTER YOUR Last Name");
		String lastName=TheScanner.s.next();
		
		System.out.println("Your NAME IS: "+firstName + " " + lastName);
		
		System.out.println("--PLEASE ENTER your email address");
		String email = TheScanner.s.next();
		System.out.println("Your email address is: "+email);
		
		System.out.println("--PLEASE enter a password");
		String password = TheScanner.s.next();
		
		System.out.println("Are you an employee, Y or N");
		String emp = TheScanner.s.next();
		System.out.println(emp);
		Boolean employee = true;
		if(emp == "y") {
			employee = true;
		}
		
		
		
		Person p = new Person(firstName, lastName, email, password, employee);
		
		RetrieveTheArrayLists.personList.add(new Person(firstName, lastName, email, password, employee));
		
		System.out.println(RetrieveTheArrayLists.personList);

//		Serialization.writeObject("scannedHuman.txt", p);
		
		
		System.out.println("THE PERSON IS: \n" + p);
		return p;
	}
	/**
	 * 
	 */
	private static final long serialVersionUID = 7293717163962328582L;
	private String lastName;
	private String firstName;
	static String email;
	String password;
	private static boolean employee;
	
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public static boolean isEmployee() {
		return employee;
	}
	public void setEmployee(boolean employee) {
		this.employee = employee;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + (employee ? 1231 : 1237);
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (employee != other.employee)
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Person [lastName=" + lastName + ", firstName=" + firstName + ", email=" + email + ", password="
				+ password + ", employee=" + employee + "]";
	}
	
	
}
