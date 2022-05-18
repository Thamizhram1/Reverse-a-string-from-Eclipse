package com.position_of_Alphabet;

import java.util.Scanner;

public class findtheposition {

	public static void main(String[] args) {
		Scanner given = new Scanner(System.in);
		System.out.println("Enter the input alphabet");
		char inputchar = given.next().charAt(0);
		
		char giveninput = Character.toLowerCase(inputchar);//to convert all the
		//given input letters into small letters
		
		//()object - type casting
		int ascivalue = (int)giveninput;//will store the asci value of given alphabet
		System.out.println(ascivalue);
		int result =ascivalue-96;//To find the position of letter in alphabet
		System.out.println(result);

	}

}
//Note: In pgm ASCI value small and capital alphabet is different. For example

//ASCII - 97-> a, 65->A	

//if we want to find ASCI for small letter then object-96 / for capital object-64