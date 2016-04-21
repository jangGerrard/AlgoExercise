package com.problems;

import java.util.Scanner;


//Finished
public class _B {
	static int n ;
	static int in[][];
	static int d[][];
	
	public static void main(String[] args){
		Scanner sc=  new Scanner(System.in);
		n = sc.nextInt();
		
		in = new int[n+1][n+1];
		d = new int[n+1][n+1];
		
		for(int i = 1 ; i <= n ; i++){
			String temp = sc.next();
			for(int j = 1; j <= n ; j++){
				char c = temp.charAt(j-1);
				if(c == '.'){
					in[i][j] = 1;
				} else {
					in[i][j] = 0;
				}
			}
		}
		
		for(int i = 1; i <= n ; i++){
			d[i][1] = 0;
		}
		int res = 0;
		for(int i = 1; i <= n; i++ ){
			for(int j = 2; j <= n ; j++){
				if(in[i][j -1 ] == 1 && in[i][j] == 1){
					res ++;
				}
			}
		}
		System.out.println(res);
	}
}
