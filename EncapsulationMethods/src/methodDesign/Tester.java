package methodDesign;

public class Tester {
	public int number;
	public String string;
	
	public static int test(){
		return 18;
	}
	
	public Tester(int num, String str){
		number = num;
		string = str;
	}
	
	public int getNum(){
		return number;
	}
	
	public String getStr(){
		return string;
	}

}
