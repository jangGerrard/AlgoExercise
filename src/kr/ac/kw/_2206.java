package kr.ac.kw;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class _2206 {
	
	static int[][] in;
	static int[][] modified;	
	static int[][] range ;
	
	static int m ;
	static int n;
	static int[] dx = { -1, 0, 1 ,0 };
	static int[] dy = { 0, 1, 0, -1 };
	static List<Point> walls = new ArrayList<Point>();
	static int min = 999999;
	
	static Queue<Point> q; 
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		m = sc.nextInt();
		
		in = new int[n+1][m+1];
		range = new int[n+1][m+1];
		
		for(int i = 1 ; i <= n ; i++){
			String temp = sc.next();
			for(int j = 1; j <= m; j++){
				in[i][j] = temp.charAt(j-1) - '0';
				if(in[i][j] == 1){
					walls.add(new Point(j,i));
				}
			}
		}
		
		for(int k = 0 ; k < walls.size(); k++){
			Point p = walls.get(k);
			modified = new int[n+1][m+1];
			
			for(int i = 1; i <= n; i++){
				for(int j = 1; j <= m ; j++){
					modified[i][j] = in[i][j];
				}
			}
			modified[p.y][p.x] = 0;
			rangeInit();
			bfs();
			if(range[n][m] != 0 ){
				if(range[n][m] < min ) {
					min = range[n][m] ;
				}
			}
			
		}
		
//		for(int i = 1 ; i <= n ; i++){
//			for(int j = 1 ; j <= m ; j++){
//				System.out.print(range[i][j]);
//			}
//			System.out.println();
//		}
		System.out.println(min);
		
	}
	
	public static void bfs(){
		q = new LinkedList<Point>();
		//1,1에서 bfs
		q.add(new Point(1,1));
		range[1][1] = 1;
		
		while(q.size() != 0 ){
			Point p = q.remove();
			
			for(int i = 0 ; i < 4; i++){
				int nx = p.x + dx[i];
				int ny = p.y + dy[i];
				if( nx > 0 && nx <= m && ny > 0 && ny <= n ){
					if(modified[ny][nx] == 0 && range[ny][nx] == 0){
						range[ny][nx] = range[p.y][p.x]+ 1; 
						q.add(new Point(nx, ny));
					}
				}
			}
		}
	}
	
	public static void rangeInit(){
		for(int i = 1 ; i <= n ; i++){
			for(int j = 1; j <= m; j++){
				range[i][j] = 0;
			}
		}
	}
}
