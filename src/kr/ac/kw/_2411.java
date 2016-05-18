package kr.ac.kw;

import java.util.Scanner;

public class _2411 {

	
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n  = sc.nextInt();
		int m = sc.nextInt();
		int[][] in = new int[n+1][m+1];
		int[][] item = new int[n+1][m+1];
		int[][] barrier = new int[n+1][m+1];
		int[][] d = new int[n+1][m+1];
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		for(int i = 1; i <= a ; i++){
			int _a = sc.nextInt();
			int _b = sc.nextInt();
			item[_a][_b] = 1;
		}
		
		for(int i = 1; i <= b ; i++){
			int _a = sc.nextInt();
			int _b = sc.nextInt();
			barrier[_a][_b] = 1;
		}
		///입력 끝
		
		for(int i = 1; i <= m ; i++){
			if(barrier[1][i] != 1){
				d[1][i] = 1;
			} else {
				d[1][i] = 0;
			}
		}
		int res = 1;
		for(int i = 2; i <= n ; i++){
			for(int j = 1; j <= m ; j++){
				if(barrier[i][j] != 1){
					d[i][j] = d[i-1][j] + d[i][j-1];
					if(item[i][j] == 1){
						res *= d[i][j];
						d[i][j] = 1;
						deleteLow(i,j,n,m);
					}
				}
				else {
					d[i][j] = 0;
				}
			}
		}
		
		for(int i = n ; i >= 1 ; i--){
			for(int j = 1;  j <= m ; j ++){
				System.out.print(d[i][j] + "\t");
			}
			System.out.println();
		}
		
		System.out.println(res);
		
	}
	
	private static  void deleteLow(int y , int x, int n , int m ){
		for(int i = 1; i < n ; i++ ){
			for(int j = 1 ; j < m ; j++){
//				d[i][j] = 0;
			}
		}
	}
}
