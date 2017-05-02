package methodDesign;

public class MethodsTests {
	
	public static int test(){
		return 5;
	}
	
	public static void main(String[] args){
		System.out.println("hello");
		System.out.println(test());
		System.out.println(Tester.test());
		Tester myTester = new Tester(10, "hello");
		System.out.println(myTester.getNum());
		System.out.println(myTester.getStr());
	}
	
}

