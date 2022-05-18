package com.reverseanumber;

import java.util.ArrayList;
import java.util.Scanner;

public class Reverseanumbers {

	public static void main(String[] args) {
		
	int givenno = 0;
	
	int reverse=0;
	
	//Scanner class
	
	System.out.println("Enter the number");
	Scanner input = new Scanner(System.in);
	givenno=input.nextInt();

		
	while(givenno!=0) {
	
	reverse = reverse*10;
	reverse=reverse+givenno%10;
	givenno=givenno/10;
	
		}
System.out.println("Reversed Number :" + reverse);
}
	

}
//Note: In above pgm, input came from pgm itself, if we want to get input from user
//we can use scanner class