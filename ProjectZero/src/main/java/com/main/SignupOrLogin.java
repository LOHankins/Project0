package com.main;

import java.io.Serializable;
import com.scanner.TheScanner;

public class SignupOrLogin {
	
	private static int theDecision = 0;
	
	public static int SorL() {
		setTheDecision(TheScanner.s.nextInt());
		
		
		if(getTheDecision() == 9) {
			System.out.println("The Decision = 9");
			
		}
		return getTheDecision();
	}

	public static int getTheDecision() {
		return theDecision;
	}

	public static void setTheDecision(int theDecision) {
		SignupOrLogin.theDecision = theDecision;
	}





}