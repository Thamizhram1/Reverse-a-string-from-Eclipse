package com.position_of_Alphabet;

import java.util.Scanner;

public class Findtheoccranceofchar_youtubecode {
	
	public static void main(String[] args) {
		
        String name="Thamizha";
         
         name=name.toLowerCase();//note we can do operation and restore it into same 
         //name, since we used wrapper class...so it is an object.
        
         int occurance=0;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the char needs to be checked");
		char inputreceived = input.next().charAt(0);
		
		for (int i = 0; i < name.length(); i++) {
			
			if (name.charAt(i)==inputreceived) {
				occurance=occurance+1;
			}
			
		}
		System.out.println(inputreceived+" "+"is present"+" and its occreance is "+occurance+" "+"Times");
	}
}

//Note: Using ITERATION