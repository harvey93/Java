package myArrayList;
import java.util.*;
import java.time.*;

public class myArrayList {
	
	public static void main(String[] args){
		int[] arr = {1,2,3,4};
		ArrayList list1 = new ArrayList();
		ArrayList<String> list2 = new ArrayList<String>();
		ArrayList<Integer> list3 = new ArrayList<>();
		list2.add("Sparrow");
		list2.add("eagle");
		list2.add("bluejay");
		list2.add(1, "pidgeon");
		System.out.println(list2);
		list2.remove("eagle");
		System.out.println(list2);
		list2.remove(1);
		System.out.println(list2);
		list2.set(1, "newestBird");
		System.out.println(list2);
		System.out.println(list2.get(1));
		System.out.println(list2.isEmpty());
		System.out.println(list2.contains("Sparrow"));
		list1.add("Sparrow");
		list1.add("newestBird");
		System.out.println(list2.equals(list1));
		list3.add(5);
		list3.add(1);
		list3.add(3);
		list3.add(8);
		list3.add(0);
		System.out.println(list3);
		Collections.sort(list3);
		System.out.println(list3);
		System.out.println(LocalDate.now());
		System.out.println(LocalTime.now());
		System.out.println(LocalDateTime.now());
		String s1 = new String("java");
		StringBuilder s2 = new StringBuilder("java");
		if(s1.equals(s2)){
			System.out.println("truuuuuue");
		}
		System.out.println(s1.substring(2, 2));
		System.out.println("hello");
//		System.out.println(list2[0]);
		char[] c = new char[2];
		int length = c.length;
		int size = list3.size();
		System.out.println(length);
		arr[3]= 5;
		System.out.println(arr[3]);
		
	}
}
