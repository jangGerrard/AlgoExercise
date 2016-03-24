package kr.ac.kw;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Maze_2178 {
	
	public static int map[][] ;
	public static int res [][];
	static int n =0 ; 
	static int m=0 ;
	static int min= 0;
	
	static int[] dx = {0, 1, -1, 0};
	static int[]dy = {-1, 0, 0, 1};
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt(); 
		m = sc.nextInt();
		
		map = new int[n+1][m+1];
		res = new int[n+1][m+1];
		for(int y = 1; y <= n ;y++){
			String temp = sc.next();
			for(int x =0; x < m ; x++){
				map[y][x+1] = temp.charAt(x) - '0';
			}
		}

		res[1][1] = 1;
		bfs(1, 1);

		//System.out.println(res[n][m]);
		for(int y = 1; y <= n ;y++){
			for(int x =1; x <= m ; x++){
				System.out.print(res[y][x]);
			}
			System.out.println();
		}
		
	}
	
	public static void bfs(int x, int y ){
		Queue<Point> points = new LinkedList<Point>();
		points.add(new Point(x,y));
		while(points.size() != 0){
			Point p = points.remove();
			x = p.x;
			y = p.y;
			for(int i = 0 ; i < 4; i ++){
				int nx = p.x + dx[i];
				int ny = p.y + dy[i];
				if( nx >= 1 && nx <= m && ny >= 1 && ny <= n){
					if(map[ny][nx] == 1 && res[ny][nx] == 0 ){
						res[ny][nx] = res[y][x] + 1;
						points.add(new Point(nx,ny));
					}
				}
			}
		}
		
	}
	
}
