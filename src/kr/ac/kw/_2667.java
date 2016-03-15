package kr.ac.kw;

import java.util.Scanner;

public class _2667 {
	
	public static int[][] map ;
	public static int[][] visited ;
	public static int n ; 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		map = new int[n+1][n+1];
		visited = new int[n+1][n+1];
		
		int res= 0;
		
		for(int i = 1; i <= n ; i++){
			for(int j = 1 ; j <= n ; j++){
				res = bfs(j,i,0);
			}
		}
	}
	
	public static int  bfs(int x , int y, int count ){
		boolean check = false;
		
		check = visited[y][x] == 1 ? true : false;		
		
		if(x > n || y > n || x < 1 || y < 1){
			return count;
		}
		
		
		
		if(map[y][x] == 0){
			return count;
		} else if(map[y][x] == 1 && !check){
			
		}
		return count;
	}
	
	
	
	
}

class Dangi{
	public int id ;
	public int houseCount;
}
