package kr.ac.kw;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class _2206_3 {
	
	static int n ;
	static int m;
	static int[][] in;
	static int [][] cost;
	static int [][] dist;
	static int[] dx = {0, 0, -1, 1};
	static int[] dy = {-1, 1, 0, 0};
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		in = new int[n+1][m+1];
		cost = new int[n+1][m+1];
		dist = new int[n+1][m+1];
		for(int i = 1; i <= n ; i++){
			String temp = sc.next();
			for(int j = 1; j <= m ; j++){
				in[i][j] = temp.charAt(j-1) - '0';
			}
		}
		
		
		Queue<Point> q = new LinkedList<Point>();
		dist[1][1] = 1;
		cost[1][1] = 0;
		q.add(new Point(1,1));
		while(q.size() != 0){
			Point p = q.remove();
			for(int i = 0 ; i< 4 ; i++){
				int nx = p.x + dx[i];
				int ny = p.y + dy[i];
				if(nx <= m && nx >= 1 && ny <= n && ny >= 1){
					if(cost[p.y][p.x] == 0 && in[ny][nx] == 1){
						cost[ny][nx] = 1;
						dist[ny][nx] = dist[p.y][p.x] + 1;
						q.add(new Point(nx, ny));
					} else if(in[ny][nx] == 0 ){
						if(dist[ny][nx] != 0){
							if (dist[ny][nx] > dist[p.y][p.x] + 1){
								cost[ny][nx] = cost[p.y][p.x];
								dist[ny][nx] = dist[p.y][p.x] + 1;
								q.add(new Point(nx, ny));
							} else if(dist[ny][nx] == dist[p.y][p.x] + 1) {
								cost[ny][nx] = cost[ny][nx] > cost[p.y][p.x] ?cost[p.y][p.x] :cost[ny][nx]; 
							} else if(dist[ny][nx] < dist[p.y][p.x] + 1){
								//여기서도 고려해야 할게 있나?
							}
						}else {
							cost[ny][nx] = cost[p.y][p.x];
							dist[ny][nx] = dist[p.y][p.x] + 1;
							q.add(new Point(nx, ny));
						}
					}
				}
			}
		}
		
		if(dist[n][m] == 0){
			System.out.println(-1);
		} else {
			System.out.println(dist[n][m]);
		}
	}
}
