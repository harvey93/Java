package basicStructures;
import java.util.*;

public class DynamicArray {
	private Object[] store;
	private int capacity;
	private int index;
	
	public DynamicArray(){
		this.store = new Object [4];
		this.index = 0;
		this.capacity = this.store.length;
	}
	
	
	public void add(int val){
		if (this.index >= this.capacity) {
			resize();
		}
		store[index] = val;
		this.index++;
			
	}
	
	public void resize(){
		Object[] newStore = new Object[this.store.length * 2];
		for(int i=0; i < this.store.length; i++){
			newStore[i] = this.store[i];
		}
		this.store = newStore;
		this.capacity = newStore.length;
	}
	
	
	
	public String toString(){
		return Arrays.toString(this.store);
	}

}
