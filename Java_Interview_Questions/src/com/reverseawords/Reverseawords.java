package com.reverseawords;

public class Reverseawords {

	public void usingloop() {
	String given = "I Love Tamil";
	String reverse = "";
	
	String[] splittedstring = given.split(" ");
	System.out.println(splittedstring.length);
	
	for (int i = splittedstring.length-1; i>=0; i--) {
		
		reverse=reverse+splittedstring[i]+" ";
	}
	System.out.println(reverse);
	
	}
	
	//Mirror image
	public void usingloop1() {
		String given = "Oh My Love";
	
		String[] newstring = given.split(" ");
		 System.out.println(newstring.length);
		 
	for (int i = 0; i<newstring.length; i++) {//iterate the string by its length
		
		for(int j=newstring[i].length()-1;j>=0;j--) {//to reverse the letters in word
			
			System.out.print(newstring[i].charAt(j));
			//i position la eruka char ra print pannu
		}
		
		System.out.print(" ");
		}
	}

	public static void main(String[] args) {
		
		Reverseawords r = new Reverseawords();
		r.usingloop();
		r.usingloop1();
		

}
}
