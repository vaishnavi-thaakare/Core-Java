package operatorInJava;

public class LogicalOperater {
	public static void main(String[] args) {
      // Logical Operator
	  int p=45;
	  int s=75;
	  if (p%5==0 && s%5==0) {
		  System.out.println("Both numbers "+ p +" and "+ s + " are divisible by 5");
		  
	  }else if (p%5==0 || s%5==0) {
		  System.out.println(" Either one of the number is divisible by 5");
		  
	  }else {
		  System.out.println(" None of the number is divisible by 5");
	  }
	}
}
