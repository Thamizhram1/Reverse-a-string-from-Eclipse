package com.numberofvowels;

public class Find_the_vowels_count {

	public static void main(String[] args) {
		String givenname = "Thamizh";
		givenname=givenname.replaceAll(" ", "");
		String name =givenname.toLowerCase();
		System.out.println(name.length()+" : Length of given name");
		
		String vowelslist = "aeiou";
		System.out.println(vowelslist.length()+" : Length of vowels");
		int vcount=0;
		for (int i = 0; i < name.length(); i++) {
				if (name.charAt(i)=='a'||name.charAt(i)=='e'||name.charAt(i)=='i'
						||name.charAt(i)=='o'||name.charAt(i)=='u') {
		  // ||-means 'or'...means if any of given condition met, loop will execute
		 //	za/ & - means 'and'...means all given condition needs to be met
					//vcount=vcount+1;
					vcount++;
				}
				
		}
		System.out.println(vcount+" : Vowels count");
		

	}

}
//note: how to apply condition for multiple characters in if loop