package exceptionHandling;

public class tryCatchBlock3 {
	public static void main(String[] args) {
		//ArithmeticException
		try {
			int firstNum=12;
			int secondNum=0;
			int division=firstNum/secondNum;
			System.out.println(" The division of given two number is "+ division);
		}catch (ArithmeticException e) {
			System.out.println(" Arithmetic Exception is handled here");
			e.printStackTrace();	// To know exact which error is coming 	
			}}
}
