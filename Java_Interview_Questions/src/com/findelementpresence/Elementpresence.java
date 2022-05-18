package com.findelementpresence;

import java.util.Scanner;

public class Elementpresence {

	public static void main(String[] args) {
		
		int [] given = {0,8,9,3,4,1};
		
		Scanner find = new Scanner(System.in);
		System.out.println("Enter the number which needs to be checked");
		Integer findpresence = find.nextInt();
		
		
		Boolean Numberpresence = false;
		
		for (int search : given) {
			
			if (search==findpresence) {
				Numberpresence=true;
				break;
			}
			
		}
		if (Numberpresence) {
			System.out.println("Given number is present in the list");
		}else {
			System.out.println("Given number is not present in the list");
		}
		
		}
		
		
		
	}

//Note: Best practice is don't use the sysout statement inside the loop

