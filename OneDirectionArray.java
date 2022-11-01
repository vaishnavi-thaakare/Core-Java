package array;

import java.util.Arrays;

public class OneDirectionArray {
	public static void main(String[] args) {
		// Declaring the array- one way
		int a[]= {10,20,30,40,50,60};
		System.out.println("1] First way of printing the array"+Arrays.toString(a));
		
	// Second way of printing the array
		System.out.println("2] second way of printing the array");
		for (int i=0;i<=a.length-1;i++) {
			System.out.println(a[i]);}
		
		System.out.println("3] Third of way printing the array");
		for (int o:a) {
			System.out.println(o);}
		
		System.out.println("4] Length of an array "+a.length);
		System.out.println("5] Printing the element at 4th index of an array "+a[4]);
		System.out.println("6] Replacing the value at 3rd index of an array");
		a[3]=3;
		System.out.println(  Arrays.toString(a));

}}
