package com.jerrycook.linkedlist;


public class LinkedList<NodeType> {

	private SingleNode<NodeType> root;
	private int count;
	
	public LinkedList() {
		this.count = 0;
		this.root = null;
	}
	
	public int getCount() {
		return count;
	}
	
	public void add(SingleNode<NodeType> node) {
		if(root == null) {
			root = node;
		}
		else {
			SingleNode<NodeType> tempNode = root;
			for(int i =1 ; i < count;i++) {
				tempNode = tempNode.getNext();
			}
			tempNode.setNext(node);
		}
		count ++;
	}
	public SingleNode<NodeType>getAt(int position){
		if(position <= 1) {
			return root;
		}
		else {
			SingleNode<NodeType> tempNode = root;
			position = position > count ? count:position;
			for (int i =1; i < position-1;i++) {
				tempNode = tempNode.getNext();
				
			}
			return tempNode.getNext();
			
		}
	}
	
	public SingleNode<NodeType> getFirst(){
		if(root != null) {
			return root;
		}else {
			System.out.println("List is empty");
			return null;
		}
	}
	
	public SingleNode<NodeType> getLast(){
		SingleNode<NodeType> tempNode = root;
		for(int i = 1; i < count-1;i++) {
			tempNode = tempNode.getNext();
		}
		return tempNode.getNext();
	}
	
	public void deleteFirst() {
		SingleNode<NodeType> tempNode = root;
		tempNode = root.getNext();
		root = tempNode;
		count --;
	}
	public void deleteLast() {
		SingleNode<NodeType> tempNode = root;
		for(int i = 1 ; i < count-1;i++) {
			tempNode = tempNode.getNext();
		}
		tempNode.setNext(null);
		count--;
	}
	
	public void deleteAt(int position) {
		SingleNode<NodeType> tempNode = root;
		if(position <= 1) {
			tempNode = tempNode.getNext();
			root = tempNode;
		}else {
			position = position > count ? count:position;
			for(int i = 1; i < position -1;i++) {
				tempNode = tempNode.getNext();
				
			}
			tempNode.setNext(tempNode.getNext().getNext());
		}
		count --;
	}
	
	public void addAt(SingleNode<NodeType> node, int position) {
		SingleNode<NodeType> tempNode = root;
		if(position <= 1) {
			root = node;
			root.setNext(tempNode);
		}else {
			position = position > count ? count:position;
			for(int i = 1; i < position -1;i++) {
				tempNode = tempNode.getNext();
			}
			SingleNode<NodeType> tempNode2 = tempNode.getNext();
			tempNode.setNext(node);
			tempNode = tempNode.getNext();
			tempNode.setNext(tempNode2);
		}
		count++;
	}
}
	

