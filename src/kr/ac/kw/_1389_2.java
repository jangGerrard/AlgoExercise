package kr.ac.kw;

import java.util.Scanner;

public class _1389_2 {
	
	static int [][] in;
	static int [][] result;
	static int n ;
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int r = sc.nextInt();
		in = new int[n+1][n+1];
		result = new int[n+1][n+1];
		
		for(int i = 1; i <= r; i++){
			int a = sc.nextInt();
			int b= sc.nextInt();
			in[a][b] = in[b][a] = 1;
		}
		
		for(int i = 1; i <= n ; i++){
			for(int j = 1; j <= n ; j++){
				if(result[j][i] != 0 ){
					result[i][j] = result[j][i];
				} else {
					result [i][j] = result[j][i] = findKebin(i , j, 1);
				}
			}
		}
		
		for(int i = 1 ; i <= n ; i++){
			for(int j = 1 ; j <= n ; j++){
				System.out.print(result[i][j]+"\t");
			}
			System.out.println();
		}
		
	}
	
	public static int findKebin(int i , int j, int length ){
		if(in[i][j] == 1){
			return length;
		}
		
		int res = 99999, temp =0 ;
		for(int k = 1 ; k <= n ; k++){
			if( k != j  ){
				if(result[k][j] != 0 ){
					return length +result[k][j]; 
				}
				temp = findKebin(k ,j , length + 1);
			}
			if(temp < res ){
				res = temp;
			}
			
		}
		
		return temp;
	}
}
