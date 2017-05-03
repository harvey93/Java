package basicStructures;

public class TestClass {
	public static void main(String[] args){
		Stack myStack = new Stack();
		myStack.push(15);
		myStack.push(18);
		myStack.push(22);
		myStack.push(28);
		myStack.push(36);
		myStack.pop();
		myStack.pop();
		System.out.println(myStack.getCurrent());
	}
}
