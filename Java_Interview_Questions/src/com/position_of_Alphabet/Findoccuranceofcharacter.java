package com.position_of_Alphabet;

import java.util.Scanner;

//find the occurance of the character in the given string
public class Findoccuranceofcharacter {

	public static void main(String[] args) {
		
		String name="Thamizha";
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the char needs to be checked");
		char inputreceived = input.next().charAt(0);
		
		int ascivalue =(int)inputreceived;
		System.out.println("ASCI value of given input :"+ascivalue);
		
		char [] charname = name.toCharArray();
		
		boolean characterpresence = false;
		
		for (char givenname : charname) {
			
			char receivedchar =Character.toLowerCase(givenname);
			int ascivalue1 =(int)receivedchar;
			//System.out.println("ASCI value of itterated characters :"+ascivalue1);
		
			if (ascivalue==ascivalue1) {
				characterpresence=true;
				break;
			}
			
		}
		if (characterpresence) {
			System.out.println("Yes the given char is present in the input string");
			
		}else {
			System.out.println("Given char is not present in the input string");
		}
		
		

	}

}

//Above code are My own codes - to find whether the given char is present int the 
//string or not
