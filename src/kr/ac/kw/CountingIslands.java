package kr.ac.kw;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CountingIslands {
	
	public static int [][] map ; 
	public static int [][] a ; 
	public static int [] dx = {-1, -1, -1, 0, 0, 1, 1, 1};
	public static int [] dy = {-1, 0, 1, -1, 1, -1, 0, 1};
	public static int m ; 
	public static int n ;
	
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		m = sc.nextInt();
		n = sc.nextInt();
		int cnt = 0 ; 
		map = new int [n+1][m+1];
		a = new int [n+1][m+1];
//		System.out.println("m,n" +m+n);
		for(int y = 1 ; y <= n; y++){
			for(int x = 1;  x <= m ; x++){
				map[y][x] = sc.nextInt();
			}
		}
		//입력끝
//		System.out.println("map[1][1]"+map[1][1]);

		for(int y = 1 ; y <= n; y++){
			for(int x = 1;  x <= m ; x++){
				if( map[y][x] == 1 && a[y][x] == 0){
					bfs(x, y, ++cnt);
				}
			}
		}
		
		System.out.println("count : "+ cnt);
		
	}
	
	public static void bfs(int x, int y , int count){
		a[y][x] = count;
		Queue<Point> q = new LinkedList<Point>();
		q.add(new Point(x,y));
		while(!q.isEmpty()){
			Point p = q.remove();
			a[p.y][p.x] = count;
			for(int i = 0 ; i < 8 ; i++ ){
				int nx = x + dx[i];
				int ny = y + dy[i];
				if(nx > 0  && nx <= m && ny > 0  && nx <= n  ){
					if(map[ny][nx] == 1 && a[ny][nx] == 0)
						q.add(new Point(nx,ny));
				}
			}
		}
	}
}
