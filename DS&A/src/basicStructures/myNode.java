package basicStructures;

public class myNode {
	private Object val;
	private myNode next;
	private myNode prev;
	
	public myNode(Object val){
		this.val = val;
		this.next = null;
		this.prev = null;
	}
	
	public myNode getNext(){
		return this.next;
	}
	
	public void setNext(myNode newNode){
		this.next = newNode;
	}
	
	public myNode getPrev(){
		return this.prev;
	}
	
	public void setPrev(myNode newNode){
		this.prev = newNode;
	}
	
	public Object getVal(){
		return this.val;
	}
}
