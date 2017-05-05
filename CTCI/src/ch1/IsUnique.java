package ch1;
import java.util.*;

public class IsUnique {
	public boolean isUnique(String str){
		String[] myArray = str.split("");
//		System.out.println(Arrays.toString(str.split("")));
		HashMap myMap = new HashMap();
		for(int i = 0; i < myArray.length; i++){
			String el = myArray[i];
			if(myMap.containsKey(el)){
				int val = (int) myMap.get(el);
				val++;
				myMap.put(el, val);
			}else{
				myMap.put(el, 1);
			}
		}
		System.out.println(myMap.toString());
		return myMap.size() == myArray.length ? true : false;
	}
}
