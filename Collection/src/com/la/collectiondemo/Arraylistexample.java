package com.la.collectiondemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;


public class Arraylistexample {

	public void arraylisteg() {
		ArrayList<String> array= new ArrayList<String>();
		array.add("Benz");
		array.add("BMW");
		array.add("Audi");
		array.add("Audi");
		
		System.out.println(array);	
		
		System.out.println(array.get(0));
		System.out.println(array.indexOf("Audi"));
		System.out.println(array.indexOf("Tata"));//if I enter the name which is not 
		//in the list, then we will get negative value
		System.out.println(array.lastIndexOf("Audi"));
		
		ArrayList<String>newarraylist=new ArrayList<String>();
		newarraylist.addAll(array);//here I am inserting one collection into another collection
		
		System.out.println("Result of newarraylist"+newarraylist);//It will print the old list once again
		
		newarraylist.clear();
		System.out.println(newarraylist);//it will erase all details in the list,
		//we can see only as brases alone
		
		//we can remove value from the list using object or index value
		array.remove(0);
		System.out.println(array);
		
		array.remove("BMW");
		System.out.println(array);
		
		array.add("Null");
		System.out.println(array);
		
		array.set(0, "Honda");
		System.out.println(array);
		
		System.out.println(array.isEmpty());
		
		//**Iterate** in most of the interview we may asked to write code 
		//to iterate the list value
		
		//method 01, using for each loop, short and simple
		for (String string : array) {
			
			System.out.println("output of for each loop :"+string);
			
			//array.add("SCODA"); // If I uncomment this line we will get
			//concurrent modification exception ****hence it proves that the ArrayList
			//is not support multithreading.
			
	    //method 02, using for loop		
		}
		for (int i = 0; i < array.size(); i++) {
			System.out.println("output of for loop :" +array.get(i));//here we cannot 
			//print index i directly, only way to call is by using object
			//Note: we can directly print only object and its stored value alone
			
		}
		
		//method 03, using iterator
		
		ListIterator<String>arraylist=array.listIterator();//by Using list iterator 
		//we can print the list values
		
		while (arraylist.hasNext()) {
			System.out.println("Next value"+arraylist.next());
			
		}
		while (arraylist.hasPrevious()) {
			System.out.println("Previous value"+arraylist.previous());
			
		}
		
		Iterator<String>arraylist_iterator=array.iterator();
		
		while (arraylist_iterator.hasNext()) {
			System.out.println(arraylist_iterator.next());//Note when 
			//we mention .next() inside the sysout, we should not enter as
			//.hasnext()...if we did the loop will become endless, will execute
			//again and again
			
		}
			
		}
	
	public static void main(String args[]) {
		
		Arraylistexample example = new Arraylistexample();
		example.arraylisteg();
	}

}
