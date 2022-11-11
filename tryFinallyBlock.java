package exceptionHandling;

import java.util.Arrays;

public class tryFinallyBlock {
	public static void main(String[] args) {
		 try {
			 String className[]= {"divA","div2","div3","div4","div5"};
			 className[8]="div8";
			 System.out.println(Arrays.toString(className));	 
		 }finally {  
			 System.out.println("Finally is not used to handle the exception");
			 System.out.println("Finally is always going to print");	 	 
		 }
		 System.out.println(" Hello");}
}
