package basicStructures;

public class Queue {
	myNode current;
	myNode last;
	
	public Queue(){
		this.current = null;
		this.last = null;
	}
	
	public myNode queue(int val){
		myNode newNode = new myNode(val);
		if(this.current != null){
			this.current.setNext(newNode);
		}else{
			this.current = newNode;
		}
		this.last = newNode;
		return this.current;
	}
	
	public myNode getCurrent(){
		return this.current;
	}
	
	public myNode getLast(){
		return this.last;
	}
}
