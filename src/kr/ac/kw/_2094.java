package kr.ac.kw;

import java.util.Scanner;

public class _2094 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] in = new int[n+1][2];
		int[] d = new int[n+1];
		for(int i = 1; i <= n ; i++){
			int y = sc.nextInt();
			int r = sc.nextInt();
			in[i][0] = y;
			in[i][1] = r;
		}
		d[1] =1;
		for(int i = 1 ; i <= n ; i++){
			if(in[i-1][1] < in[i][1]){
				d[i] = d[i-1] + 1;
			} else {
				d[i] = 1;
			}
		}
		
		int y = sc.nextInt();
		int x = sc.nextInt();
		
		
		
		String result = "";
		
		
		
		
	}

}
