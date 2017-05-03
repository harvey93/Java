package basicStructures;

public class TestClass {
	public static void main(String[] args){
		myNode node = new myNode(12);
		myNode node2 = new myNode(15);
		node.setNext(node2);
		System.out.println(node.getNext().getVal());
	}
}
