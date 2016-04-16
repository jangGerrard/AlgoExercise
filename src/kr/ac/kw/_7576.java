package kr.ac.kw;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class _7576 {
	
	static int m ;
	static int n;
	static int in[][];
	static int d[][];
	static int[] dx = {0,0,-1,1};
	static int[] dy = {-1,1,0,0};
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		m = sc.nextInt();
		n = sc.nextInt();
		
		in =  new int [n+1][m+1];
		d =  new int [n+1][m+1];
		
		for(int i = 1 ; i <= n ; i++){
			for(int j = 1; j <=m ;j++){
				in[i][j] = sc.nextInt();
			}
		}
		for(int i = 1 ; i <=n  ; i++){
			for(int j = 1; j <= m ; j++){
				d[i][j] = -1;
			}
		}
		
		
		
		Queue<Point> q = new LinkedList<Point>();
		for(int i = 1; i <= n ; i++){
			for(int j = 1;  j <= m ; j++){
				if(in[i][j] == 1){
					d[i][j] = 0;
					q.add(new Point(j,i));
				}
			}
		}
		
		bfs(q);
		
		for(int i = 1; i <= n ; i++){
			for(int j = 1;  j <= m ; j++){
				System.out.print(d[i][j] + "\t");
			}
			System.out.println();
		}
		
		int ans = -2;
		boolean strange = false;
		for(int i = 1; i <= n ; i++){
			for(int j = 1;  j <= m ; j++){
				if(d[i][j] > ans ){
					ans = d[i][j];
				}
				if(d[i][j] == -1){
					strange = true;
				}
			}
		}
		if(strange){
			System.out.println(-1);
		} else {
			System.out.println(ans);
		}
	}
	
	public static void bfs(Queue<Point> q){
		while(q.size() != 0 ){
			Point p = q.remove();
			for(int k = 0 ; k < 4 ; k++){
				int nx = p.x + dx[k];
				int ny = p.y + dy[k];
				if(nx > 0 && nx <= m && ny > 0 && ny <=  n){
					if(d[ny][nx] == -1){
						d[ny][nx] = d[p.y][p.x]+ 1;
						q.add(new Point(nx, ny));
					} else if(d[ny][nx] >= d[p.y][p.x]+ 1 ){
						d[ny][nx] = d[p.y][p.x]+ 1;
						q.add(new Point(nx, ny));
					}
				}
			}
		}
	}
}
