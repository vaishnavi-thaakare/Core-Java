package exceptionHandling;

public class tryCatchBlock1 {
	public static void main(String[] args) {
	try {
		int a[]= {12,14,15,16,18};
		System.out.println("length of array is "+a.length);
		System.out.println(a[5]);
}
	catch(Exception e) {
		System.out.println(" I have handle exception here");
		
}}
}
