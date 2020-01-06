package com.serialization;

import java.io.Serializable;
import com.main.RetrieveTheArrayLists;
import com.scanner.TheScanner;
import com.main.SignupOrLogin;


public class TheLogin implements Serializable {
	
	public static boolean loginBoolean = false;
	public static String theEmail = "";
	public static String thePassword = "";
	public static String theEnteredEmail = "Tennis@gmail.com";
	public static String theEnteredPassword = "12345678";
	
	
	public static boolean loginFromSignup() {
		loginBoolean = true;
		return loginBoolean;
	}
	
	
	public static boolean loginInfo() {

		System.out.println("---Log in to the Auto Lot App");
		
		System.out.println("--PLEASE ENTER YOUR EMAIL ADDRESS");
		String theEnteredEmail=TheScanner.s.next();
		
		System.out.println("--PLEASE ENTER YOUR PASSWORD");
		String theEnteredPassword=TheScanner.s.next();
		
		System.out.println(RetrieveTheArrayLists.personList);
		
	
		for(int i = 0; i < RetrieveTheArrayLists.personList.size(); i++) {
			loginBoolean = false;
			System.out.println(RetrieveTheArrayLists.personList.get(i).email + ";  the entered email = " + theEnteredEmail);
			if (RetrieveTheArrayLists.personList.get(i).email == theEnteredEmail) {
				System.out.println("Login successful");
				loginBoolean = true;
				break;
			}
			
		}
	
		System.out.println(loginBoolean);
		if (loginBoolean == false) {
			System.out.println("Login unsuccessful");
		}
		
		return loginBoolean;
		
	}
		

}
