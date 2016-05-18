package com.jang.thread;

public class Consumer extends Thread{
	
	Producer producer;
	
	public Consumer(Producer p ) {
		producer = p;
	}
	
	@Override
	public void run() {
		try{
			while(true){
				String message = producer.getMessage();
				System.out.println("Got message : "+ message);
			}
		} catch (Exception e){
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args){
		Producer producer = new Producer();
		producer.start();
		new Consumer(producer).start();
	}
}
