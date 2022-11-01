package com.inheritance;

public class HierarchicalParent extends HierarchicalGrandParent{
	
	public void family1() {
		System.out.println(" This is from parent");
	}
	
	
	public static void main (String[] args) {	
		
		HierarchicalParent obj=new HierarchicalParent();
		obj.family();
}
}