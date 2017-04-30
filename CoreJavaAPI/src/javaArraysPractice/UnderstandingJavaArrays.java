package javaArraysPractice;
import java.util.*;

public class UnderstandingJavaArrays {
	
	public static void main(String[] args){
		int[] numbers1 = new int [3];
		int[] numbers2 = {1,2,3,4};
		for(int number : numbers1){
			System.out.print(number + " ");
		}
		System.out.println("");
		for(int num : numbers2){
			System.out.print(num + " ");
		}
		System.out.println("");
		String[] dogs = {"puppy", "fredo", "foster"};
		System.out.print(Arrays.toString(dogs));
	}
}

