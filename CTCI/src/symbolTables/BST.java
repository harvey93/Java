package symbolTables;

public class BST {
	private BSTNode root;
	
	public int get(char key){
		BSTNode x = this.root;
		while(x != null){
			if(key < x.getKey()){
				x = x.getLeft();
			} else if (key > x.getKey()){
				x = x.getRight();
			} else {
				return x.getVal();
			}
		}
		return -1;
	}
	
	public void put(char key, int val){
		root = put(root, key, val);
	}
	
	private BSTNode put(BSTNode x, char key, int val) {
		if(x == null) return new BSTNode(key, val);
		if (key < x.getKey()){
			x.setLeft(put(x.getLeft(), key, val));
		} else if (key > x.getKey()){
			x.setRight(put(x.getRight(), key, val));
		} else {
			x.setVal(val);
		}
		return x;
	}
}
