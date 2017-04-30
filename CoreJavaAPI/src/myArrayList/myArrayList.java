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
	}
}
