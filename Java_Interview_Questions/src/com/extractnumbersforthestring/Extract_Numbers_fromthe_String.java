package com.extractnumbersforthestring;

public class Extract_Numbers_fromthe_String {

	public static void main(String[] args) {
		
		String givenstring = "Thamizh123";
		int lengthofstring = givenstring.length();
		System.out.println(lengthofstring);
		
		int countthenumbers=0;
		int value = 0;
		for (int i = 0; i < lengthofstring; i++) {
			
			char itteratedchar = givenstring.charAt(i);
			
			
			if(Character.isDigit(itteratedchar)) {
				int numericvalue = Character.getNumericValue(itteratedchar);
				countthenumbers = countthenumbers+numericvalue;
				System.out.print(numericvalue);
				value++;
				
			}
				
		}
		System.out.println("");
		System.out.println("number of times :"+value);
		System.out.println("");
		System.out.println(countthenumbers);//adding the numbers value

	}

}
