package com.findamissingalphabet;

import java.util.ArrayList;

public class Find_a_missing_alphabet {

	public static void main(String[] args) {
		
		String givenword = "Thamizh";
		String word = givenword.toLowerCase();
		
		ArrayList<String> given = new ArrayList<String>();
		given.add(givenword); //mistake 01 - have directly added string into arraylist
		//but it should not be added like that, have to add character wise one by one
		//like array of string
		
		System.out.println(given);
		
		String [] alphabets = {"a","b","c","d"};
		System.out.println(alphabets.length);
	
		for (String string : alphabets) {
			
			System.out.println(string);
			
			if (given.contains(word)) {
				break;
				
			}else {
				System.out.println(given);
			}
		}
			
			}
			
		}





//Note: Find the missing alphabet in the given string -  own try