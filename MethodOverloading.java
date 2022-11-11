package com.polymorphism;

public class MethodOverloading {
	 public void ringing() {
		  System.out.println("Method ringing");
	  }
	 
	 public void calling(String mobileNumber) {
		 System.out.println(" The user is calling with  mobile number "+mobileNumber );
	 }
	public static void main(String[] args) {
	  System.out.println(" Method Overloading- Same method name with different parameters");
	
	  MethodOverloading obj=new MethodOverloading();
	
	  obj.ringing();
	  obj.calling("8308411260");}
}

/*Method Overloading- Same method name with different parameters
Method ringing
The user is calling with  mobile number 8308411260*/