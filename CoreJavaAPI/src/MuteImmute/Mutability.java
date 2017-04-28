package MuteImmute;

public class Mutability {
	public static void main(String[] args){
		String s1 = "hello";
		s1 = s1.concat("15");
		System.out.println(s1);
		System.out.println(s1.charAt(5));
		System.out.println(s1.indexOf("x"));
		System.out.println(s1.substring(3, 5));
		System.out.println(s1.toUpperCase());
		System.out.println(s1.equals("hello15"));
		System.out.println(s1.equalsIgnoreCase("HELLO15"));

	}
}
