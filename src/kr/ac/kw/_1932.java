package kr.ac.kw;

import java.util.Scanner;

public class _1932 {
	static int n ;
	static int d[][][];
	static int in[][];
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		d = new int[n+1][n+1][2];
		in = new int[n+1][n+1];
		for(int i = 1; i <= n ; i++){	
			for(int j = 1 ; j <= i ; j++){
				in[i][j] = sc.nextInt();
			}
		}
		d[1][1][0] = in[1][1];
		d[1][1][1] = in[1][1];
		for(int i = 2; i <= n ; i++){	
			for(int j = 1 ; j <= i ; j++){
				//j -1, j+1
				if(j - 1 >= 1){
					d[i][j][0] = Math.max(d[i-1][j-1][0],d[i-1][j-1][1]) + in[i][j];
				}
				if(j + 1 <= i){
					d[i][j][1] = Math.max(d[i-1][j+1][0],d[i-1][j+1][1]) + in[i][j];
				}
			}
		}
		int max = 0 ;
		for(int i = 1; i <= n ; i++){	
			for(int j = 1 ; j <= i ; j++){
				for(int k = 0 ; k <2 ; k++){
					if(d[i][j][k] > max){
						max =d[i][j][k]; 
						System.out.printf("i : %d ,j : %d ,k: %d\n",i,j,k);
					}
				}
			}
		}
		
		System.out.println("max : "+ max);
	}
}
