package basicStructures;
import java.util.*;

public class TestClass {
	public static void main(String[] args){
		Stack myStack = new Stack();
//		myStack.push(15);
//		myStack.push(18);
//		myStack.push(22);
//		myStack.push(28);
//		myStack.push(36);
//		myStack.pop();
//		myStack.pop();
//		System.out.println(myStack.getCurrent());
		Queue myQueue = new Queue();
//		myQueue.queue(10);
//		myQueue.queue(15);
//		myQueue.queue(22);
//		System.out.println(myQueue.getCurrent().getVal());
//		System.out.println(myQueue.getLast().getVal());
//		int[] arr = {1, 2, 3, 4};
//		System.out.println(Arrays.toString(arr));
		DynamicArray myArray = new DynamicArray();
		myArray.add(5);
		myArray.add(7);
		myArray.add(15);
		myArray.add(0);
		myArray.add(33);
		System.out.println(myArray.toString());
	}
}
