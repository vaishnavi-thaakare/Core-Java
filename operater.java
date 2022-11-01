package operatorInJava;

public class operater {
	public static void main(String[] args) {
		/*Operators in Java- 1] Arithmetic operator-addition,multi,subtraction,,division,modules
		                     2] Assignment Operator
                             3] Logical Operator-and &&, or ||, not !=
                             4] Comparison Operator - <,>,<=,>=,!=*/

		int x=9;
		int y=10;
		System.out.println(" The addition of x and y is "+"     :    "+ (x+y));
		int z=x+y; 
		System.out.println(" The addition of x and y is :"+"    :    "+ z);
		int a=x-y;
		System.out.println(" The substraction of x and y is  :  "+a);
		int b=x*y;
		System.out.println(" The multiplication of x and y is :"+ b);
		int c=x/y;
		System.out.println(" The division of x and y is :"+"     :    "+c);
		int d=x%y;
		System.out.println("The remainder is "+d+" "+ "if x divide by y ");
	}

}
