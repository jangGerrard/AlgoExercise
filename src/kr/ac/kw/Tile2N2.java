package kr.ac.kw;

import java.util.Scanner;

public class Tile2N2 {
	
	static int[] d ;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		d = new int[n+1];
		d[1] = 1;
		d[2] = 3;
		for(int i = 3; i <= n ; i++){
			d[i] = d[i-2] * 2 + d[i-1];
			d[i] %=d[i]; 
		}
		
		
		System.out.println(d[n]);
	}
}
