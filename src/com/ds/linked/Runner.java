package com.ds.linked;

public class Runner {
	
	public static void main(String[] args){
		LinkedList linkedList = new LinkedList();
		
		
		linkedList.insert(1);
		linkedList.insert(2);
		linkedList.insert(3);
		linkedList.insert(4);
		linkedList.insert(5);
		linkedList.insert(6);
		linkedList.insert(9,3);
		
		linkedList.print();
	}
}
