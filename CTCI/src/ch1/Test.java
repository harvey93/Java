package ch1;

public class Test {
	
	public static void main(String[] args){
		IsUnique myUnique = new IsUnique();
		System.out.println(myUnique.isUnique("hello"));
		System.out.println(myUnique.isUnique("cats"));
	}
}
