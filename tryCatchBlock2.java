package exceptionHandling;
public class tryCatchBlock2 {
	public static void main(String[] args) {
		try {
		int a=10;
		int b=0;
		int div=a/b;
		System.out.println(div);
	}catch(ArithmeticException e) {
		System.out.println(" Arithematic Exception is handled here");
		System.out.println(" Only one catch block is excuted here ");
	}
	catch(Exception e) {
			System.out.println(" All types of exception are handled now");
		}}
}
