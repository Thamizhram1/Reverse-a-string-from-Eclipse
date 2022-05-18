package com.replacevowels;

public class Replace_vowels_Utube {

	public static void main(String[] args) {
		String givenname = "Thamizh";
		String replacedname = givenname.replaceAll("[AEIOUaeiou]", "*");
		System.out.println(replacedname+" :After replacement **Straight forward method**");
		
		//Another one method is same as my own method
		char[] nameinchar = givenname.toCharArray();
		for (int i = 0; i < givenname.length(); i++) {
			if (givenname.charAt(i)=='a'||givenname.charAt(i)=='e'||givenname.charAt(i)=='i'
					||givenname.charAt(i)=='o'||givenname.charAt(i)=='u') {
				
				nameinchar[i]='*';//here if want to use $ then use escape as\\$
	
	}

}
		//System.out.println(nameinchar+" :Using itteration");
		//We cant print the char directly, so we have use iteration
		
		for (int i = 0; i < nameinchar.length; i++) {
			System.out.print(nameinchar[i]);
			
		}
}
}