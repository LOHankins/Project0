package com.main;

import java.io.Serializable;
import java.util.ArrayList;

import com.scanner.TheScanner;
import com.serialization.Car;
import com.serialization.Person;
import com.serialization.PersonAndCar;
import com.serialization.Serialization;
import com.serialization.TheLogin;
import com.main.EmployeeFunctions;
import com.main.RetrieveTheArrayLists;
import com.main.SignupOrLogin;

import static com.main.RetrieveTheArrayLists.*;



public class TheMain extends AutoAbstractClass implements Serializable {

	private static final long serialVersionUID = 4L;
	private static boolean successfulLogin = false;
	private static int loginCounter = 0;
	private static int loginDecision = 0;

	
	
	public static void beginAutoApp() {
		startTheApp();
		TheScanner.ScannerOpen();
		System.out.println("im back");
		loginDecision = SignupOrLogin.SorL();
		if(loginDecision == 9) {
			System.out.println("if signup = 9");
			signup();
			login();
		} else {
			System.out.println("if else");
			login();
		}
		
		if (successfulLogin = true) {
		
	  		if (Person.isEmployee() == true) {
	  			System.out.println(Person.isEmployee());
// Do While loop based on quit from performEmployeeFunctions
  			while (EmployeeFunctions.getTheFunctionChoice() != 5) {
					displayEmployeeDashboard();
					EmployeeFunctions.performEmployeeFunctions();
	  			}
	
// end of do while				
			} else {
				displayUserDashboard();
				
			}
		} else {
			loginCounter++;
			if (loginCounter > 3) {
				endOfAutoApp();
				System.out.println("Too Many Login Attempts - End of App");
			}
		}
	}
	
	
	public static void startTheApp() {

		RetrieveTheArrayLists.retrieveTheArrays();
		System.out.println("Welcome to the Auto Lot Application");
		System.out.println("  ");
		System.out.println("Login or Signup");
		System.out.println("Login - type 1; Signup - type 9");
	}
	
	public static void endOfAutoApp() {
		
		// Return ArrayLists to file

		Serialization.writeObjectListPerson("personfile.txt", RetrieveTheArrayLists.personList);
	}

	public static void displayEmployeeDashboard() {
		System.out.println("EmployeeDashboard");
		
		
		
	}

	public static void displayUserDashboard() {
		System.out.println("UserDashboard");
		
	}

	public static void signup() {
		System.out.println("signup method");
		Person.buildPerson();

	}
	
	public static void login() {
		System.out.println("login method. LoginDecision = " + loginDecision );
		if(loginDecision == 9) {
			successfulLogin = TheLogin.loginFromSignup();
		} else {	
			successfulLogin = TheLogin.loginInfo();
		}
		
		
	}

	public static void main(String[] args) {
				
		beginAutoApp();
	}		
		//open input stream
			
//	}

/*	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}
*/
}
