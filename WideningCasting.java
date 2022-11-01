package casting;

public class WideningCasting {
	public static void main(String[] args) {
		//byte<short<char<int<long<float<double
		
		byte a=120;
		short b=a;
		System.out.println("1] The byte "+a+" is converted to short "+b);
		
		//we cannot convert byte to char
		byte c=102;
		int d=c;
		System.out.println("2] The byte "+c +"is converted into integer "+d );
		
		short f=67;
		char g=(char)f;
		System.out.println("3] Short to byte conversion is excepetion in widening casting");
		System.out.println("4] The short "+ f+ "is converted to char "+ g); 
		
		byte h=112;
		char i=(char)h;
		System.out.println("5] Byte to char conversion is exception in widening casting");
		System.out.println("6] The byte" + h +" is converted into char "+ i );
		
	
		
		
		
	}
	

}
