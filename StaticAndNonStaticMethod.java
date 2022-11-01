package method;

public class StaticAndNonStaticMethod {
	public void method1() {           //Non-static method- We require obj to call it
		System.out.println(" This is first method ");}
	public static void method2() {
		System.out.println(" This is second method");}
	
	public int method3() {             // It return value
		System.out.println(" This is third method");
		int i=5;
		return i;}
	
	public static int method4() {          
		System.out.println(" This is fourth method");
		int i=89;
		return i;}
	
	public static void main(String[] args) {
		System.out.println("This is main method");        //Static method
		StaticAndNonStaticMethod obj=new StaticAndNonStaticMethod();
		obj.method1();
		method2();
		System.out.println(obj.method3());
		System.out.println(method4());}
	

}
