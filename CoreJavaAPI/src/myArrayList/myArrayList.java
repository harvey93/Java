package myArrayList;
import java.util.*;

public class myArrayList {
	
	public static void main(String[] args){
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
	}
}
