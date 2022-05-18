																																																																																																				package com.findthelengthofstring;

public class Stringlength {
	String name="thamizh";
	
	//step 01: Direct and simple using length method
	public void stringmethod() {
		
		System.out.println("Length of given input string :"+name.length());
		
	}
	
	//step 02: Without using direct length method
	public void withoustringmethod() {
		char[]charname=name.toCharArray();
		//String[] charname = name.split(" ");//I cannot
		int i=0;
		for (char c : charname) {
			i++;
		}
		System.out.println("Given string lenght by withoutstring method :"+i);
	}
	

	public static void main(String[] args) {
		Stringlength s = new Stringlength();
		s.stringmethod();
		s.withoustringmethod();

	}

}
