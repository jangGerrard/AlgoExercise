package kr.ac.kw;

import java.util.Scanner;

public class _2146 {
	static int[][] map;
	static int n ;
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		for(int i = 1; i <= n ; i++){
			for(int j  = 1; j <= n ; j++){
				map[i][j] = sc.nextInt();
			}
		}
		
		///1인것들을 찾고 다른 그룹을 찾아간다.
	}
}
