package kr.ac.kw;

import java.util.Scanner;

public class Add123_9095 {
	
	static int d[];
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int testCase = sc.nextInt();
		d = new int[11+1];
		d[1] = 1;
		d[2] = 2;
		d[3] = 4;
				
		for(int i = 4; i <= 11 ; i++){
			d[i] = d[i-3] + d[i-2] + d[i-1];
		}
		
		for(int i = 1 ; i <= testCase ; i++){
			int in= sc.nextInt();
			
			System.out.println(d[in]);
		}
		
	}
}
