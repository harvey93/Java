package basicStructures;

public class TestClass {
	public static void main(String[] args){
		Stack myStack = new Stack();
		myStack.push(15);
		myStack.push(18);
		System.out.println(myStack.getCurrent());
	}
}
