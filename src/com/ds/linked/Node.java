package com.ds.linked;

public class Node {

	private Node next;
	private int data;
	
	public Node(int data) {
		next = null;
		this.data= data;
	}
	
	public Node getNext(){
		return this.next;
	}
	
	public void setNext(Node next){
		if(next != null){
			this.next = next;
		} else {
			System.out.println("Something Wrong");
		}
	}
	
	public int getData(){
		return this.data;
	}

}
