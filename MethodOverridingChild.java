package com.polymorphism;

public class MethodOverridingChild 	extends MethodOverRiding{
	public void riding() {
		System.out.println(" Parent method is over-rided by child method  ");
	}
	public static void main(String[] args) {
		System.out.println("Over Riding Method ");
		MethodOverridingChild obj=new MethodOverridingChild();
		obj.riding();
	}	
}
/*
Over Riding Method 
Parent method is over-rided by child method  
*/