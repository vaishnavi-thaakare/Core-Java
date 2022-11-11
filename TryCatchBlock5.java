package exceptionHandling;

public class TryCatchBlock5 {
	public static void main(String[] args) {
		try {
			String name[]= {"neha","pallavi","sakshi","rutu"};
		    name[5]="reena";
		    
		    int num1=90;
			int num2=0;
			int div=num1/num2;
			System.out.println("Division of "+ num1 +"and "+ num2+ "gives "+ div);
				
		}catch(ArithmeticException e) {
			System.out.println(" Arithematic Exception is handled here");
			e.printStackTrace();
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(" ArrayIndexOutOfBoundsException is handled here ");
		}
		catch(Exception e) {
			System.out.println("All types of errors are handled here");
		}
		System.out.println(" If exceptions are handled then only this sentence will print");
		System.out.println(" It has handled only one exception which comes first ");	}}
