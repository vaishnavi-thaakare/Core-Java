package exceptionHandling;
public class tryCatchBlock4 {
	public static void main (String[] args) {
		try {
			int EvenNumbers[]= {10,20,30,40,50};
			System.out.println(" Length of an array is "+ EvenNumbers.length);
			System.out.println(EvenNumbers[8]);		
		}catch(Exception e) {
			System.out.println(" All Types of exceptions are handled here ");		
			e.printStackTrace();             // To know the name of exception occurring
}}}
