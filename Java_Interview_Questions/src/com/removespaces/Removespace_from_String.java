package com.removespaces;

public class Removespace_from_String {

	public static void main(String[] args) {
		String name= " Thamizh!! ";
		//01. Trim function
		System.out.println(name.trim()+" :Using Trim");
		
		//02. Strip function
		System.out.println(name.stripLeading()+" :Leading");
		System.out.println(name.stripTrailing()+" : Trailing");
		System.out.println(name.strip()+" :Using strip");
		
		//03. Using Regular expression
		
		System.out.println(name.replaceAll("^[ \t]+|[ \t]+$", ""));
		System.out.println(name.replaceAll("^[ \t]", ""));
		System.out.println(name.replaceAll("[ \t]+$", ""));

	}

}
