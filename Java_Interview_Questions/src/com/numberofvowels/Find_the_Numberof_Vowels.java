package com.numberofvowels;

import java.util.Arrays;
import java.util.HashSet;

public class Find_the_Numberof_Vowels {

	public static void main(String[] args) {
		
		String givenname = "Thamizh";
		givenname=givenname.replaceAll(" ", "");
		String name =givenname.toLowerCase();
		String[] listofletters = name.split("");
		//System.out.println(listofletters);//we cannot print the string array
		
		String vowelslist = "aeiou";
		String[] listoflettersinvowels = vowelslist.split("");
		
		HashSet<String> s = new HashSet<String>(Arrays.asList(listofletters));
		
		HashSet<String>s1 = new HashSet<String>(Arrays.asList(listoflettersinvowels));
		
	    s.removeAll(s1);
	    
	    System.out.println(s.size());
	    
	    System.out.println(listofletters.length-s.size());
	    
		}
	
	}

//Note: I tried myself