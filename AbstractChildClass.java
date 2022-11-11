package com.Abstraction;
public class AbstractChildClass extends AbstractClass{
	void method1() {
		// TODO Auto-generated method stub
		System.out.println(" This is abstract method");
	}
	public static void main (String[] args) {
		AbstractChildClass obj=new AbstractChildClass();
		obj.method1();
		obj.method2();}
}
