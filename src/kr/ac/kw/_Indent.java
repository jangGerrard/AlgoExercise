package kr.ac.kw;

import java.util.Scanner;

public class _Indent {
	
	public static void main(String[] args){
		int in[];
		int correct[];
		int diff[];
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		in = new int[n+1];
		correct = new int[n+1];
		diff = new int[n+1];
		for(int i = 1 ; i <= n ; i++){
			in[i] = sc.nextInt();
		}
		
		for(int i = 1 ; i <= n ; i++){
			correct[i] = sc.nextInt();
			diff[i] = in[i] - correct[i] ;
		}
		
		for(int i = 1 ; i <= n ; i++){
			
		}
		
		
		
		
		
	}
}
