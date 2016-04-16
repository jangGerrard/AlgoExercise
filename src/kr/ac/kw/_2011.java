package kr.ac.kw;

import java.util.Scanner;

public class _2011 {
	
	static int d[][];
	
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		String in =  sc.next();
		int n = in.length();
		d = new int[n+1][3];
		
		d[1][1] = 1;
		d[1][2] =0; 
		
		for(int i = 2; i <= n ; i ++){
			d[i][1] = d[i-1][1] + d[i-1][2];
			int temp = Integer.parseInt(in.substring(i-1, i));
			if(temp <= 26){
				d[i][1]
			}
				
		}
	}
}
