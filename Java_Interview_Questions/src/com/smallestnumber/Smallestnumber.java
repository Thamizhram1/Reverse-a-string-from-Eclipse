package com.smallestnumber;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class Smallestnumber {
	
	  Integer array[] = {9,1,5,8,3,55};
	  
	  
	  
	//sol 01: It's my own method to find smallest number
	public void findsmallestnumber() {
		int array[] = {9,1,5,8,3,55};
		TreeSet<Integer> smallest = new TreeSet<Integer>();
		for (int i : array) {
			smallest.add(i);
		}
		String s =smallest.toString();
		System.out.println("Using TreeSet :"+s.charAt(1));
		System.out.println("Using collection :"+Collections.min(smallest));//***//
	}
	
	//sol 02: Repeat the above method with user input
	
	//sol 03: By using array
	public void usingarray() {
		Arrays.sort(array);
		System.out.println("Using Array :"+array[0]);
	}
	
	//sol 04: By using collections
	public void usingcollections() {
		List<Integer> smallest = Arrays.asList(array);
		Collections.sort(smallest);
		Integer sm = smallest.get(0);
		System.out.println("Using collections :"+sm);
	}
	
	//sol 05: Using loops 
	public void usingloop() {
		int smallestno =Integer.MAX_VALUE;//to know the integer max value, however 
		//upon the MAX_VALUE
		
		for (int i = 0; i < array.length; i++) {
			
			if(array[i]<smallestno) {
				
				smallestno=array[i];
				
			}//this for loop will execute again and again, finally the smallest value 
			//will be stored
			
		}
		System.out.println("Using loop :"+smallestno);
	}
	public static void main(String[] args) {
		Smallestnumber s = new Smallestnumber();
		s.findsmallestnumber();
		s.usingarray();
		s.usingcollections();
		s.usingloop();
	}

}
