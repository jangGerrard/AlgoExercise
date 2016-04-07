package kr.ac.kw;

import java.util.Scanner;

public class _2342 {
	static int [][] data = {
		{0, 0, 0, 0, 0},
		{0, 1, 3, 4, 3},
		{0, 3, 1, 3, 4},
		{0, 4, 3, 1, 3},
		{0, 3, 4, 3, 1}
	};
	public static int[] cur = {0,0};
	static int [] input;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		cur = new int[2];
		input = new int[100000+1];
		
		for(int i = 1;  ; i++){
			
			int in = sc.nextInt();
			input[i] = in;
			
			
			
			if(in == 0 ){
				break;
			}
		}
		
		
		
		
	}
}
