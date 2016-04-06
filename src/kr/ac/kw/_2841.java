package kr.ac.kw;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class _2841 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int p = sc.nextInt();
		List<A> as = new ArrayList<A>();
		Stack<A> stack = new Stack<A>();
		int res = 0;
		for(int i = 1; i <= n ; i++){
			int temp = sc.nextInt();
			int temp2 = sc.nextInt();
			as.add(new A(temp, temp2));
		}
		A before = stack.push(as.get(0));
		for(int i =  1 ; i< as.size(); i++){
			A it = as.get(i);
			if(before.a != it.a){
				stack.pop();
				stack.push(it);
				before = it;
				res++;
			} else if (before.b <= it.b ){
				stack.push(it);
				before = it;
				res++;
			} else if(before.b > it.b){
				A poped;
				while(true){
					if(stack.size() == 0 ){
						break;
					}
					poped = stack.peek();
					if(poped.b > it.b){
						poped = stack.pop();
						res++;
					} else {
						break;
					}
				}
			}
		}
		System.out.println(res);
	}
}

class A{
	public int a;
	public int b;
	public A(int a, int b){
		this.a = a;
		this.b= b;
	}
}
