package array;

import java.util.Arrays;

public class StringArray {
	public static void main(String[] args) {
		String a[]= {"Vaishanvi","neha","payal","kirti","nidhi"};
		String name[]= {"Rahul","pratik","sonu"};
		System.out.println(Arrays.toString(a));
		
		// Second way of printing the array
		for (int i=0;i<=a.length-1;i++) {
			System.out.println(a[i]);
		}
	
		
		System.out.println("Priting the array using for each");
		//Third way of printing the array
		for (String b:name) {
			System.out.println(b);
		}

}}
