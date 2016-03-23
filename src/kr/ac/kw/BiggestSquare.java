package kr.ac.kw;

import java.util.Scanner;

public class BiggestSquare {
	
	static int[][] arr;
	static int[][] res;
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		arr = new int[n+1][m+1];
		res = new int[n+1][m+1];
		for(int i = 1 ; i <=n;i++){
			String temp = sc.next();
			for(int j =1;j <= m ; j++){
				arr[i][j] = temp.charAt(j) - '0';
			}
		}
		int min = m > n ? n : m;
		
		for(int i = 1 ; i <= min; i++ ){
			
		}
	}
}
