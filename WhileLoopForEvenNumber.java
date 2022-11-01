package loops;

public class WhileLoopForEvenNumber {
	public static void main(String[] args) {
		System.out.println(" Printing all the even number between 0 to 100");
		int x=0;
		while (x<=100) {
			if(x%2==0) {
				System.out.println(x);
			}
			x++;
		}
	}

}
