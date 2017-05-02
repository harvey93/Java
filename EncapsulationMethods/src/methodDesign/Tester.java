package methodDesign;

public class Tester {
	private int number;
	private String string;
	public static int test(){
		return 18;
	}
	
	public Tester(int num, String str){
		this.number = num;
		this.string = str;
	}
	
	public int getNum(){
		return number;
	}
	
	public String getStr(){
		return string;
	}

}
