package com.ds.priorityqueue;

import java.util.Scanner;
import java.util.Stack;

public class StackEx {
	
	private static Stack<Integer> stack = new Stack<Integer>();
	
	public StackEx() {
		
	}

	public static void main(String[] args){
		
		stack.push(9);
		stack.push(8);
		stack.push(7);
		stack.push(6);
		stack.push(5);
		stack.push(4);
		
		while(stack.size() != 0 ){
			int res = stack.pop();
			System.out.println(res);
		}
		
	}
}
