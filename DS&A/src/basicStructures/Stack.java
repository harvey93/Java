package basicStructures;

public class Stack {
	private myNode current;
	
	public Stack(){
		this.current = new myNode(null);
	}
	
	public myNode push(int val){
		myNode newNode = new myNode(val);
		newNode.setPrev(this.current);
		this.current = newNode;
		return newNode;
	}
	
	public Object getCurrent(){
		return this.current.getVal();
	}
	
	public Object pop(){
		myNode droppedNode = this.current;
		this.current = this.current.getPrev();
		return droppedNode;
	}
}
