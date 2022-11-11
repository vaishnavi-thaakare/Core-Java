package exceptionHandling;

import java.util.Arrays;

public class HandlingTwoError {
	public static void main(String[] args) {
		try {
			int a=10;
			int b=0;
			int division=a/b;
			System.out.println(division);}
		catch(Exception e){
			System.out.println("First error is handled here ");	
		}
		try {
			int array[]= {45,7,8,9,4};
		    array[9]=99;
		    System.out.println(Arrays.toString(array));
		}catch(Exception e) {
			System.out.println(" Second error is handled here ");
		}
		System.out.println(" Finish");}
}
