package operatorInJava;

public class ComparisonOperator {
	public static void main(String[] args) {
		//Comparison Operator
		int firstNumber=12;
		int lastNumber=15;
	
		if (firstNumber>10 && firstNumber >lastNumber) {
			System.out.println("It satisfies both the conditions");
		}
		if (firstNumber!=15) {
			System.out.println(" The first numaber is not equal to 15");
			
		}
		System.out.println();
		if(lastNumber>=firstNumber || lastNumber>15) {
			System.out.println("'OR'" +" indicate either one of the conditions are true or both the conditions are true.");
		}
		
	}

}
