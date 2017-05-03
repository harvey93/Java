package basicStructures;

public class myNode {
	private int val;
	private myNode next;
	
	public myNode(int val){
		this.val = val;
		this.next = null;
	}
	
	public myNode getNext(){
		return this.next;
	}
	
	public void setNext(myNode newNode){
		this.next = newNode;
	}
	
	public int getVal(){
		return this.val;
	}
}
