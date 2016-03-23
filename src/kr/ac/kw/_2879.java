package kr.ac.kw;

import java.util.Scanner;
import java.util.Stack;

public class _2879 {
	static int n ;
	static int[] cur;
	static int[] cor;
	static int[] dif;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		n = sc.nextInt();
		
		cur = new int[n+1]; 	//current indent
		cor = new int[n+1]; 	//correct indent
		dif = new int[n+1];
		
		
		for(int i = 1; i <= n ; i++){
			cur[i] = sc.nextInt();
		}
		for(int i = 1; i <= n ; i++){
			cor[i] = sc.nextInt();
		}
		
		fix();		
	}
	
	public static void fix(){
		calculateDifference();
		
		Stack<Integer> stack = new Stack<Integer>();
		
		
	}
	
	public static void calculateDifference(){
		for(int i = 1 ; i <= n ; i++){
			dif[i] = cur[i] - cor[i];
		}
	}
}
