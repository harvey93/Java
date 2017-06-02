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
	
	public char floor(char key){
		BSTNode x = floor(root, key);
		if(x == null) return '~';
		return x.getKey();
		
	}
	
	public int size(){
		return size(root);
	}
	
	private int size(BSTNode x){
		if(x == null) return 0;
		return x.getCount();
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
	
	private BSTNode floor(BSTNode x, char key){
		if(x == null) return null;
		if (key == x.getKey()) {
			return x;
		} else if (key < x.getKey()) {
			return floor(x.getLeft(), key);
		} else {
			BSTNode t = floor(x.getRight(), key);
			if(t != null){ 
				return t ; 
			} else {
				return x;
			}
		}
	}
}
