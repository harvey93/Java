package ch4;

public class Test {
	public static void main(String[] args){
		BSTSequences mySeq = new BSTSequences();
//		Node root = createTree();
//		mySeq.allSequences(root).forEach(el -> System.out.println(el));
		Node simpleRoot = createSimpleTree();
//		simpleRoot.inOrderTraversal();
		mySeq.allSequences(simpleRoot).forEach(el -> System.out.println(el));
	}
	
	private static Node createSimpleTree() {
		Node node1 = new Node(2);
		Node node2 = new Node(1);
		Node node3 = new Node(3);
		
		node1.setLeft(node2);
		node1.setRight(node3);
		
		return node1;
	}
	
	private static Node createTree(){
		Node node1 = new Node(50);
		Node node2 = new Node(20);
		Node node3 = new Node(60);
		Node node4 = new Node(10);
		Node node5 = new Node(25);
		Node node6 = new Node(70);
		Node node7 = new Node(5);
		Node node8 = new Node(15);
		Node node9 = new Node(65);
		Node node10 = new Node(80);
		
		node1.setLeft(node2);
		node1.setRight(node3);
		
		node2.setLeft(node4);
		node2.setRight(node5);
		
		node3.setRight(node6);
		
		node4.setLeft(node7);
		node4.setRight(node8);
		
		node6.setLeft(node9);
		node6.setRight(node10);
		
		return node1;
	}
}
