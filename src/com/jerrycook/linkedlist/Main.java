package com.jerrycook.linkedlist;

public class Main {

	public static void main(String[] args) {
		
		LinkedList<Integer> llist = new LinkedList<>();
		
		llist.add(new SingleNode<Integer>(1));
		llist.add(new SingleNode<Integer>(2));
		llist.add(new SingleNode<Integer>(3));
		llist.add(new SingleNode<Integer>(4));
		llist.add(new SingleNode<Integer>(5));
		
	
		
		for(int i = 1; i <= llist.getCount();i++) {
			System.out.println("element "+i+" : "+llist.getAt(i).getValue());
		}
		
		System.out.println();
		llist.addAt(new SingleNode<Integer>(20), 3);
		
		for(int i = 1 ; i <= llist.getCount();i++) {
			System.out.println("element "+i+" : "+llist.getAt(i).getValue());
		}
		
		System.out.println("\nthe first element is : "+llist.getFirst().getValue());
		System.out.println("the last element is  : "+llist.getLast().getValue());
		
		llist.deleteFirst();
		System.out.println("\nafter delete first");
		for(int i = 1 ; i <= llist.getCount();i++) {
			System.out.println("element "+i+" : "+llist.getAt(i).getValue());
		}
	
		llist.deleteLast();
		System.out.println("\nafter delete last");
		for(int i = 1;i <= llist.getCount();i++) {
		    System.out.println("element "+i+" : "+llist.getAt(i).getValue());
		}
		
		llist.deleteAt(2);
		System.out.println("\nafter delete at 2");
		for(int i = 1 ; i <= llist.getCount();i++) {
			System.out.println("element "+i+" : "+llist.getAt(i).getValue());
		}
	}

}
