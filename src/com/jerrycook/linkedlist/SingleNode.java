package com.jerrycook.linkedlist;

public class SingleNode<NodeType>{
	
	private int value;
	private SingleNode<NodeType> next; 
	
	public SingleNode(int value) {
		this.value = value;
		this.next = null;
	}
	
	public int getValue() {
		return value;
	}
	public void setNext(SingleNode<NodeType> next) {
		this.next = next;
	}
	
	public SingleNode<NodeType> getNext(){
		return next;
	}

}
