package kr.ac.kw;

import java.util.Scanner;

public class AscNumber {
	
	public static final int mod = 10007;
	
	public static void main(String[] args) {
		int[][] d = new int[1000+1][10];
		Scanner sc = new Scanner(System.in);
		
		
		int n = sc.nextInt();
		for(int i =0 ; i <= 9 ; i++){
			d[1][i] = 1;
		}
		
		for(int i = 2 ; i <= n ; i++){//길이
			for(int j = 0 ; j <= 9 ; j++){ //0~9
				for(int k = 0 ; k <= j ; k++ ){ //자신보다 작은놈
					d[i][j] += d[i-1][k];
					d[i][j] %= mod;
				}
			}
		}
		
		int res =0;
		for(int i =0 ; i <= 9 ; i++){
			res += d[n][i];
		}
		res %= mod;
		System.out.println(res);
	}
}
