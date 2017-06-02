package symbolTables;


public class BSTNode {
	
	private char key;
	private int val;
	private BSTNode left, right;
	
	public BSTNode(char key, int val){
		this.key = key;
		this.val = val;
	}
	

	public int getVal() {
		return val;
	}

	public void setVal(int val) {
		this.val = val;
	}

	public BSTNode getRight() {
		return right;
	}

	public void setRight(BSTNode right) {
		this.right = right;
	}
	
	public BSTNode getLeft(){
		return this.left;
	}

	public void setLeft(BSTNode left) {
		this.left = left;
	}
	
	public char getKey(){
		return this.key;
	}
	
}
