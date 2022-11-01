package casting;

public class narrowcasting {
	public static void main(String[] args) {
		//double>float>long>int>char>short>byte
		
		//double to int conversion
		double a=45.45585d;
		int b=(int)(a);
		System.out.println("1] The double "+ a+" is converted into int :"+b);
		
		//double to float conversion
		double x=7.123456;
		float y=(float)x;
		System.out.println("2] The double "+x+ " is converted into float :"+y);
		
		double c=1785.02255;
		long d=(long)c;
		System.out.println("3] The double "+ c+ "is converted into long :"+ d);
		
		//we cannot convert double to char

		double e=789.45;
		short f=(short)e;
		System.out.println("4] The double "+e +"is converted into short :"+ f);
		
		double g=14.12;
		byte fg=(byte)g;
		System.out.println("5] The double "+g+"is converted into byte :"+ fg);
		
	    float h=45.788f;
	    long j=(long)h;
	    System.out.println("6] Float "+h+"is converted into long :"+ j);
	    
	    float i=79.78864f;
	    int k=(int)i;
	    System.out.println("7] The float"+ i+" is converted into int :"+k);
	    
	   float l=78.012f;
	   short m=(short)l;
	   System.out.println("8] The float "+l+ "is converted into short :"+m);
	   
	   float n=111.11f;
	   byte o=(byte)n;
	   System.out.println("9] The float "+n+"is converted into byte  :"+o);
	   
	   
	    
	
		
	}

}
