package com.swapping;

public class Swaptwonumbers {
	
	public void withthirdvariable() {
		
		int mysalary = 80000;
		int myfriendsalary = 100000;
		System.out.println("Before swapping :"+"Mine :"+mysalary+" "+"Myfriendsalary"+myfriendsalary);
		int thirdperson=mysalary;
		mysalary=myfriendsalary;
		myfriendsalary=thirdperson;
		System.out.println("After swapping :"+"Mine :"+mysalary+" "+"Myfriendsalary"+myfriendsalary);
		
		
	}
	
	public void withoutthirdvariable() {
		
		int a=50000;
		int b=100000;
		
		System.out.println("Before swap, the value of a and b :"+a +" "+b);
		
		a=a-b;
		b=b+a;
		a=b-a;
		System.out.println("After swap, the value of a and b :"+a+" " +b);
	}

	public static void main(String[] args) {
    
		Swaptwonumbers values = new Swaptwonumbers();
		values.withoutthirdvariable();
		values.withthirdvariable();
		
		
		
		
		
	}

}
