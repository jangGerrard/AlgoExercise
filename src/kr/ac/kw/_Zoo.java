package kr.ac.kw;

import java.util.Scanner;

public class _Zoo {
	static int [][] d ;
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		d = new int[n+1][2];
		d[1][0] = 1;
		d[1][1] = 2;
		for(int i =2 ; i <= n ; i++){
			d[i][0] = d[i-1][1] + d[i-1][0];
			d[i][1] = d[i-1][1] + (d[i-1][0] * 2); 
		}
		int res = (d[n][0] + d[n][1]) % 9901;
		System.out.println(res);
	}
}
