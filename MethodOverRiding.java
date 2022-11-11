package com.polymorphism;

public class MethodOverRiding {
	
	public void riding() {
		System.out.println(" This is parent method ");
	}
	
	public static void main(String[] args) {
		System.out.println("Over riding Method - Same method name wih same parameters");
		MethodOverRiding obj=new MethodOverRiding();
		obj.riding();	}	}





/*Over Riding Method 
Parent method is over-rided by child method  */