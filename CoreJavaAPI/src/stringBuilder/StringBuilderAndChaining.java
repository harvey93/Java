package stringBuilder;

public class StringBuilderAndChaining {
	public static void main(String[] args){
		StringBuilder alpha = new StringBuilder();
		alpha.append('a');
		alpha.append('c');
		alpha.append('z');
		System.out.println(alpha);
		System.out.println(alpha.charAt(1));
		System.out.println(alpha.indexOf("z"));
		alpha.insert(1, 'b');
		System.out.println(alpha);
		alpha.append("hello");
		alpha.delete(0, 2);
		System.out.println(alpha);
		StringBuilder beta = new StringBuilder("czhello");
		System.out.println(alpha == beta);
		System.out.println(alpha.toString().equals(beta.toString()));
	}
}
