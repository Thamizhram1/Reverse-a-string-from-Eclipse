package com.Patterns;

import java.util.Scanner;

public class Patterns {

	public void Starpattern() {
		Scanner n = new Scanner(System.in);
		System.out.println("Enter the number of lines needed for Starpattern");
		int numberoflines = n.nextInt();
		
		int row = 0;
		int column = 0;
		
		for (row = 0; row<numberoflines; row++) {
			
			for (column = 0; column<=row; column++) {
				System.out.print("*"+" ");
				
			}
			System.out.println();
		}
	}
	
	public void Numberpattern() {
		Scanner n = new Scanner(System.in);
		System.out.println("Enter the number of lines needed for Numberpattern");
		int numberoflines = n.nextInt();
		
		int row = 1;
		int column = 1;
		
		for (int i = 1; i <= numberoflines; i++) {
			
		for (row = 1; row<numberoflines; row++) {
			
			for (column = 1; column<=row; column++) {
				
				{
					System.out.print(i);
					
				}
			}
			System.out.println();
		}
		}
	}
	
	public void Numberpattern1() {
		Scanner n = new Scanner(System.in);
		System.out.println("Enter the number of lines needed for Numberpattern1");
		
		int startingnumber=1;
		int limit = n.nextInt();
		
		int row;
		int column;
			
		for (row =0; row<limit; row++) {
			
			for (column =0; column<=row; column++) {
				
					System.out.print(startingnumber+" ");
					startingnumber=startingnumber+1;
					
				
			}
			System.out.println();
		}
		}
	
	public static void main(String[] args) {
		Patterns p = new Patterns();
		p.Numberpattern1();
		p.Numberpattern();
		p.Starpattern();
		
	}
}
