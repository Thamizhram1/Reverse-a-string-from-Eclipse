package com.upperandLowercaseconvertion;

public class Upper_to_lower_caseconvertion {

	public static void main(String[] args) {
		String name = "THAMIZH is fine";//combination of small and caps
		System.out.println(name.length());
		char[] givenname = name.toCharArray();
		
		
		for (int i = 0; i < givenname.length; i++) {
			
			//since the asci value for capital letter start from 65 and ends with 90
			if(givenname[i]>=65 && givenname[i]<=90) {
		    givenname[i] = (char) ((char)givenname[i]+32);//way to cast character
		    //as like int (int)
			}
		    
		}
       for (int i = 0; i < givenname.length; i++) {
    	   System.out.print(givenname[i]);
		
	}
       System.out.println();//empty printline to make output comes in 2 lines
       
       for (int i = 0; i < givenname.length; i++) {
    	   
    	   if(givenname[i]>=97 && givenname[i]<=122) {
   		    givenname[i] = (char) ((char)givenname[i]-32);//way to cast character
   		    //as like int (int)
   			}
    	   
		
	}
       for (int i = 0; i < givenname.length; i++) {
    	   System.out.print(givenname[i]);
       }
       
	}//01-to convert a	ll upper case into lower case letters	

	//02 - to convert all lower case into upper case letters
	

}
