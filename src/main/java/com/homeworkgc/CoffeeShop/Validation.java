package com.homeworkgc.CoffeeShop;

public class Validation {

	public static boolean regPassVal(String pass1, String pass2 ) {
	
		boolean checkPass = false;
				
		if(pass1.equals(pass2)) {
			checkPass = true;
		}
		return checkPass;
	}
}
