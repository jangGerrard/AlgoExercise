package com.ds.queue;

public class Queue {

	int data[] ;
	int front ; 
	int rear;
	
	public Queue() {
		this.data = new int[100000];
		this.front = 0;
		this.rear = 0;
	}
	
	public void push(int data){
		this.data[rear++] = data;
	}
	
	public int pop(){
		return data[front++];
	}
	

}
