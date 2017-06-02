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
}
