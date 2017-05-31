package ch4;

public class Node {
	int data;
	Node left = null;
	Node right = null;
	
	public Node(int data) {
		this.data = data;
	}

	public Node getLeft() {
		return left;
	}

	public void setLeft(Node left) {
		this.left = left;
	}

	public Node getRight() {
		return right;
	}

	public void setRight(Node right) {
		this.right = right;
	}
	
	public void inOrderTraversal(){
		if(this.left != null){
			this.left.inOrderTraversal();
		}
		System.out.println(this.data);

		if(this.right != null){
			this.right.inOrderTraversal();
		}
	}
}
