package lambdaTest;
import java.util.*;

public class lambdaTest {
	public static void main(String[] args){
		System.out.println("lambdas");
		ArrayList<String> list = new ArrayList<String>();
		list.add("cat");
		list.add("hat");
		list.add("vazgen");
		list.add("fat");
		list.forEach((a)-> {
			if(a.length() < 4){
				System.out.println(a);
			}
		});
		
	}
}
