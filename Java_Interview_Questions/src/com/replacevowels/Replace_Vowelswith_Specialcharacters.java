package com.replacevowels;

public class Replace_Vowelswith_Specialcharacters {

	public static void main(String[] args) {
		String givenname = "Thamizh";
		String name = givenname.toLowerCase();
		//name.split("");//if we split the string, will get array of string
		char[] namearray = name.toCharArray();//we cannot print the char array/string array
		System.out.println(name+" :Before replacement ");
		
		//String vowels = "aeiou";
		//String[] vowelsarray = vowels.split("");
		//String result="";
		for (int i = 0; i < name.length(); i++) {
			if (name.charAt(i)=='a'||name.charAt(i)=='e'||name.charAt(i)=='i'
					||name.charAt(i)=='o'||name.charAt(i)=='u') {
				
				namearray[i]='*';
//				String itteratedchar = name.toString();
//				String replacevalue = "&";
//				result = name.replaceAll(name,replacevalue);
		
				
//				itteratedchar.replace(vowels, itteratedchar)
				
//		for (String string : namearray) {
//			
//			if (string.contains("a")||string.contains("e")||string.contains("i")
//					||string.contains("o")||string.contains("u")) {
//				
				
//				String result = string.replaceAll(string, "&");
//				System.out.println(result);
			}
			
		}
		System.out.println(namearray);

	}

}
//Note:Note able to find a logic....corrected by checking with youtbe video