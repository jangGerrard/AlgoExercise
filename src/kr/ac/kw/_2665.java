package kr.ac.kw;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class _2665 {
	static int n ;
	static int in[][];
	static int d[][];
	static int dx[] = {0, 0, -1, 1};
	static int dy[] = {-1, 1, 0, 0};
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		in = new int[n+1][n+1];
		d = new int [n+1][n+1];
		
		for(int i =  1; i <= n ; i++){
			for(int j = 1;  j <= n ; j++){
				d[i][j] = -1;
			}
		}
		
		for(int i = 1; i <= n ; i++){
			String temp = sc.next();
			for(int j = 1; j <= n ; j++){
				in[i][j] = temp.charAt(j-1) - '0';
			}
		}
		
		bfs(1 , 1 );
		
		
//		for(int i =  1; i <= n ; i++){
//			for(int j = 1;  j <= n ; j++){
//				System.out.print(d[i][j]+"\t");
//			}
//			System.out.println();
//		}
		
		
		
		System.out.println(d[n][n]);
	}
	
	public static void bfs(int y , int x){
		Queue<Point> q = new LinkedList<Point>();
		q.add(new Point(x,y));
		d[1][1] = 0;
		
		while(q.size() != 0){
			Point p  = q.remove();
			for(int k = 0 ; k < 4 ; k++){
				int nx = p.x + dx[k];
				int ny = p.y + dy[k];
				
				if(nx > 0 && nx <= n && ny > 0 && ny <=n){
					if(in[ny][nx] == 1){ // 갈수 있는 길
						if(d[ny][nx] == -1){ //처음
							d[ny][nx] = d[p.y][p.x];
							q.add(new Point(nx,ny));
						} else { // 이미 방문함
//							d[ny][nx] = Math.min(d[ny][nx] , d[p.y][p.x]);
//							q.add(new Point(nx,ny));
							if(d[ny][nx] <= d[p.y][p.x]){
								
							} else {
								d[ny][nx] = d[p.y][p.x] ;
								q.add(new Point(nx,ny));
							}
						}
					} else if(in [ny][nx] == 0){ //갈수 없는 길
						if(d[ny][nx] == -1){
							d[ny][nx] = d[p.y][p.x] + 1;
							q.add(new Point(nx,ny));
						} else {
//							d[ny][nx] = Math.min(d[ny][nx] , d[p.y][p.x] + 1);
//							q.add(new Point(nx,ny));
							if(d[ny][nx] <= d[p.y][p.x] + 1){
								
							} else {
								d[ny][nx] = d[p.y][p.x] + 1;
								q.add(new Point(nx,ny));
							}
						}
					}
				}
			}
			
			
		}
		
		
	}
}
