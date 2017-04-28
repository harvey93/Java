import java.util.*;
public class BasicOperators {
	public static void main(String [] args){
		int y = 4;
		int x = 3 + 2 * --y;
//		System.out.println(x);
		int z = true ? 15 : 25;
//		System.out.println(z);
//		int dayOfWeek = 0;
//		switch(dayOfWeek) {
//		case 0:
//		System.out.println("Sunday");
//		default:
//		System.out.println("Weekday");
//		case 6:
//		System.out.println("Saturday");
//		break;
//		}
		int i = 0;
//		while (i < 5) {
////			System.out.println("hello");
//			i++;
//		}
		
//		for(int a = 0, b = 1; a < 5; a++){
//			System.out.println(b);
//		}
		
		String[] names = new String[3];
		names[0] = "hrant";
		names[1] = "khacho";
		names[2] = "Vuzh";
		for(String name : names){
			System.out.println("Hello " + name);
		}
		
		int[] List = {1,2,3,4};
//		List.add(1);
//		List.add(2);
//		List.add(3);
//		List.add(4);
		
//		List.forEach(int val -> System.out.println(val));
		for(int item : List){
			System.out.println(item);
		}
	}
}
