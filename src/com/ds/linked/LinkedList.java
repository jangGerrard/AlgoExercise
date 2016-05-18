package com.ds.linked;

public class LinkedList {

	private Node head;
	
	public LinkedList() {
		head = null;
	}
	
	public int size(){
		
		Node temp  = head ; 
		int count=0;
		while(temp != null){
			count++;
			temp = head.getNext();
		}
		return count;
	}
	
	public void insert(int data){
		Node node = new Node(data);
		if(head == null){
			head = node;
			return;
		}
		Node temp = this.head;
		Node current  = null;
		while(temp != null){
			current = temp;
			temp = temp.getNext();
		}
		current.setNext(node);
	}
	
	public void insert(int data, int position){
		Node node = new Node(data);
		int count = 0 ;
		Node temp = head;
		Node current = null;
		while(temp != null ){
			current = temp;
			temp = temp.getNext();
			count++;
		}
		temp = current.getNext();
		current.setNext(node);
		node.setNext(temp);
	}
	
	public void print(){
		Node temp = this.head;
		if(head == null){
			System.out.println("no entry");
			return;
		}
		while(temp != null){
			System.out.print(temp.getData()+"\t");
			temp = temp.getNext();
		}
		System.out.println();
	}
	
}
