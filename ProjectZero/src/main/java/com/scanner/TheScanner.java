package com.scanner;

import java.util.Scanner;
import com.serialization.Person;
import com.serialization.Serialization;

public interface TheScanner {
	

	Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		
	}
	
	static void ScannerOpen() {

		System.out.println("The Scanner is open");
	}
	
	static void ScannerClose() {
		s.close();
		System.out.println("The Scanner is closed");

	}
	
	

}

