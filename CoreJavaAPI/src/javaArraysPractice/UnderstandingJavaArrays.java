package javaArraysPractice;
import java.util.*;

public class UnderstandingJavaArrays {
	
	public static void main(String[] args){
		int[] numbers1 = new int [3];
		int[] numbers2 = {5,2,1,4};
		for(int number : numbers1){
			System.out.print(number + " ");
		}
		System.out.println("");
		for(int num : numbers2){
			System.out.print(num + " ");
		}
		System.out.println("");
		String[] dogs = {"puppy", "fredo", "foster"};
		System.out.println(Arrays.toString(dogs));
		System.out.println(Arrays.toString(numbers2));
		Arrays.sort(numbers2);
		Arrays.sort(dogs);
		System.out.println(Arrays.toString(numbers2));
		System.out.println(Arrays.toString(dogs));
		int [][] arrTwoD = {{1,3,4},{0}, {4,5}};
		System.out.println(Arrays.toString(arrTwoD));
		Arrays.asList(dogs).forEach(el -> System.out.println(el));
	}
}

