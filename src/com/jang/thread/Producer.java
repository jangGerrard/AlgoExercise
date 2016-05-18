package com.jang.thread;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Producer extends Thread{
	final static int MAX_COUNT = 5;
	List<String> messages ;
	
	public Producer(){
		this.messages = new ArrayList<String>();
	}
	
	public synchronized String getMessage() throws InterruptedException{
		notify();
		if(messages.size() == 0){
			wait();
		}
		String message = messages.get(messages.size()-1);
		messages.remove(messages.size()-1);
		return message;
	}
	
	public synchronized void putMessage() throws InterruptedException{
		if(messages.size() == MAX_COUNT){
			wait();
		}
		notify();
		messages.add(new Date().toString());
	}

}
