package com.jennifer.jgjang0202;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


//finished
public class _D {
	
	static int [][] in ; 
	static int [][] d; 
	static int n ;
	static int dx[] = {0,0,-1,1};
	static int dy[] = {-1,1,0,0};
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		in = new int[n+1][n+1];
		d = new int[n+1][n+1];
		
		
		for(int i = 1; i <= n ; i++){
			String temp = sc.next();
			for(int j = 1;  j <= n ; j++){
				in[i][j] = temp.charAt(j-1) - '0';
			}
		}
		
		
		//initialization
		for(int i = 1; i <= n ; i++){
			for(int j  = 1 ; j <= n ; j++){
				d[i][j] =  -1;
			}
		}
		
		bfs(n , 1);
		
		int res = d[1][n] >= 100 ? 100 : d[1][n];
		System.out.println(res);
	}
	
	public static void bfs(int y , int x){
		
		Queue<Point> q = new LinkedList<Point>();
		q.add(new Point(x,y));
		d[y][x] = in[y][x];
		while(q.size() !=  0){
			Point p  = q.remove();
			for(int k = 0 ; k < 4; k++){
				int nx = p.x + dx[k];
				int ny = p.y + dy[k];
				if(nx > 0 && nx <= n && ny > 0 && ny <= n ){
					if(d[ny][nx] == -1 || d[ny][nx] > d[p.y][p.x] + in[ny][nx] ){
						d[ny][nx] = d[p.y][p.x] + in[ny][nx];
						q.add(new Point(nx, ny));
					}
				}
			}
		}
	}
}

class Point{
	public int x ;
	public int y ;
	public Point(int x ,int y ){
		this.x=  x;
		this.y = y;
	}
}