package com.position_of_Alphabet;

public class Findoccurance_without_Iteration {

	public static void main(String[] args) {
		
		String givenname = "Thamizha";
		
		char userinput = 'a';
		
		String givenchar = givenname.toUpperCase();
		String userinputs =Character.toString(userinput).toUpperCase();
		//here, I am changing char to string. so that I can convert it into uppercase
		
		int actuallength = givenchar.length();
		System.out.println(actuallength+" :Given char actual lenght");
		
		//System.out.println(userinputs.length());
		
		givenchar= givenchar.replace(userinputs, "");
		int lengthafterreplacement = givenchar.length();
		
		System.out.println(lengthafterreplacement+" :char lenght after replacement");
		
		System.out.println(actuallength-lengthafterreplacement+" :occrance of userinpt char in the given string");

	}

}
