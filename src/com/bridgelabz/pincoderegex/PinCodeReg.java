package com.bridgelabz.pincoderegex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PinCodeReg {
	public static boolean checkValidPincode(String pinCode) {
		String pinCodeRegex = "^[0-9]{3}\\s{0,1}[0-9]{3}$";
		Pattern patternObject = Pattern.compile(pinCodeRegex);
		if (pinCode == null) {
			return false;
		}
		Matcher matcherObject = patternObject.matcher(pinCode);
		return matcherObject.matches();
	}
	public static void main(String[] args) {
		String pincode="400 088";
		boolean isPinCode=checkValidPincode(pincode);
		if(isPinCode) {
			System.out.println(pincode+" is an Valid PinCode");
			System.exit(0);
		}
		System.out.println(pincode+" is an Invalid PinCode");

	}
}