package kr.ac.kw;

import java.util.Scanner;

public class Maze_2178 {
	
	public static int map[][] ;
	static int n =0 ; 
	static int m=0 ;
	static int min= 0;
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt(); 
		m = sc.nextInt();
		
		map = new int[n+1][m+1];
		for(int y = 1; y <= n ;y++){
			String temp = sc.next();
			for(int x = 1; x <= m ; x++){
				map[y][x+1] = temp.charAt(x);
			}
		}
		depth(1,1,0);
		
	}
	
	public static void depth(int y , int x , int sum){
		if(y > n || x > m || y < 1 || x < 1 ){
			return ;
		}
		
		
		
		
	}
}
