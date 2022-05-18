package com.findamissingalphabet;

import java.util.Arrays;
import java.util.HashSet;

public class Findthe_Missing_Alphabet {

	public static void main(String[] args) {
		
		String givenalphabet ="abc";
		String given = givenalphabet.toLowerCase();
		given=given.replaceAll(" ", "");//to remove if any spaces are there in given string
		
		String[] givenarray = given.split("");
		
		String englishalphabets = "abcdefghijklmnopqrstuvwxyz";
		String englishalp = englishalphabets.toLowerCase();
		String[] alphabets = englishalp.split("");
		//System.out.println(alphabets+" :English alphabet");
		
		HashSet<String> s = new HashSet<String>(Arrays.asList(givenarray));
//		for (String string : givenarray) {
//			s.add(string);
			
//		}
		System.out.println(s+" :Given alphabet in Hashet 1");
		
		HashSet<String>s1 = new HashSet<String>(Arrays.asList(alphabets));
		System.out.println(s1+" :English alphabet in Hashet");
		s1.removeAll(s);
		System.out.println(s1+" :Missing alphabet list");

	}

}
