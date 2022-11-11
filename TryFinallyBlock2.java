package exceptionHandling;
import java.util.Arrays;
public class TryFinallyBlock2 {
	public static void main(String[] args) {
		// We cannot use catch after finally 
		try {
			String Flower[]= {"rose","lili","sunflower"};
			Flower[5]="mogara";	
			System.out.println(Arrays.toString(Flower));
		}
        catch (Exception e) {
	         System.out.println(" All types of exception are handled here ");	
		}
		finally {
			System.out.println(" Finally is going to print always");
		}
		System.out.println(" Sentence after try catch finally block");
	}
}
