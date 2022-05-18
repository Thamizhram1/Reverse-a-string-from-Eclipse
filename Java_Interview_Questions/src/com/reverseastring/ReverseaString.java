package com.reverseastring;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;

public class ReverseaString {
	  
	
	 //Sol 01: By using string buffer
	   public void usingbuffer(String name) {
		StringBuffer buffer = new StringBuffer();
        buffer.append(name);
		
		System.out.println("Using buffer :"+buffer.reverse());
		
	}
	   
	 //Sol 02: By using our own logic
	   public void usingownmethod(String name) {
		   
		   char[] stringchar= name.toCharArray();
			
			String reverse="";//Note: here I have to initialize the string with empty value
			System.out.println(stringchar.length);
			for (int i = stringchar.length-1; i>=0; i--) {//here the current value of 
				//i is length-1...so it should pointing 'h'.	
				
				reverse=reverse+stringchar[i];
			}
			System.out.println("Using ownmethod :"+reverse);
		   
	   }
	   
	   //Sol 03: By using collections
	   public void usingcollection(String name) {
		   
		   char[] namechar = name.toCharArray();
		   
		   ArrayList<Character> array = new ArrayList<Character>();
		   
		   for (Character string : namechar) {
			array.add(string);
		}
		   Collections.reverse(array);//Note this reverse didn't return anything
		   //it return void alone, so I can't print or store any out from this operation
		   //Sol: Is to use Iterator.///***we cannot print arraylist directly
		   //have to perform iteration
		  
		   ListIterator iterator = array.listIterator();
		   while (iterator.hasNext()) {
			   
			   //System.out.println("Using collection :"+iterator.next());
			   System.out.print(iterator.next());
			   //If I want to print in a single line, then I have to give Print() alone
			   //and not Println...if we give ln then the line will get brake
			
		   }
		   
	   }
	   
	public static void main(String[] args) {
		
		Scanner n = new Scanner(System.in);
		System.out.println("Enter the name");
		final String name = n.next();
		
		
		ReverseaString r = new ReverseaString();
		r.usingbuffer(name);
		r.usingownmethod(name);
		r.usingcollection(name);
		
		
		
	}

}
//Note: Char Position and Char length is different