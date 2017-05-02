package lambdaTest;
import java.util.*;
import java.util.function.*;

public class lambdaTest {
	
	
	public static void print (List<Integer> ints, Predicate<Integer> checker){
		ints.forEach((Integer animal) -> {
			if (checker.test(animal)){
				System.out.println(animal);
			}
		});
	}
	
	
	public static void main(String[] args){
//		System.out.println("lambdas");
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
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list2.add(3);
		list2.add(5);
		list2.add(12);
		list2.add(15);
		print(list2, a -> a > 6);
	}
}
