package kr.ac.kw;

import java.util.Scanner;

public class _1932_1 {
	public static void main(String[] args){
		final int L = 0;
		final int R = 1;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int in[][] = new int[n+1][n+1];
		int d[][][] = new int[n+1][n+1][2];
		for(int i = 1; i <= n ; i++){
			for(int j = 1; j <= i ; j++){
				in[i][j] = sc.nextInt();
			}
		}
		
		d[1][1][L] = in[1][1];
		d[1][1][R] = in[1][1];
		
		for(int i = 2; i <= n ; i++){
			for(int j = 1; j <= i ; j++){
				if(j-1 > 0){
					d[i][j][L] = Math.max(d[i-1][j-1][L], d[i-1][j-1][R]) + in[i][j];
				} else {
					d[i][j][L] = in[i][j];
				}
				
				if(j <= i - 1 ){
					d[i][j][R] = Math.max(d[i-1][j][L], d[i-1][j][R]) + in[i][j];
				} else {
					d[i][j][R] = in[i][j];
				}
			}
		}
		int min = 0 ;
		for(int i = 1 ; i <= n ; i++){
			for(int j = 0 ; j < 2 ; j++){
				if(min < d[n][i][j])
					min = d[n][i][j];
			}
		}
		
		for(int i = 1; i <= n ; i++){
			for(int j = 1; j <= i ; j++){
				System.out.print(in[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println();
		
		for(int k = 0 ; k < 2 ; k++){
			for(int i = 1; i <= n ; i++){
				for(int j = 1; j <= i ; j++){
					System.out.print(d[i][j][k] + "\t");
				}
				System.out.println();
			}
			System.out.println();
			System.out.println();
		}
		
		System.out.println(min);
		
	}

}
