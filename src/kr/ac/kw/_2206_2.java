package kr.ac.kw;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class _2206_2 {
	static int n;
	static int m;
	static int min = 99999999;
	static int in[][];
	static int [][] modified;
	static int [][] res;
	static ArrayList<Point> walls;
	static int[] dx = {0, 0, -1, 1};
	static int[] dy = {-1, 1, 0, 0};
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		m = sc.nextInt();
		
		in = new int[n+1][m+1];
		modified  = new int[n+1][m+1];
		res = new int[n+1][m+1];
		walls = new ArrayList<Point>();
		for(int i = 1 ; i <= n ; i++){
			String temp = sc.next();
			for(int j = 1; j <= m; j++){
				in[i][j] = temp.charAt(j-1) - '0';
				if(in[i][j] == 1){
					walls.add(new Point(j, i));
				}
			}
		}
		//입력 끝
		
		
		for(int k = 0 ; k < walls.size() ; k++){
			
			for(int i = 1; i <= n ; i++){
				for(int j = 1; j <= m ; j++){
					modified[i][j] = in[i][j];
				}
			}
			Point p = walls.get(k);
			modified[p.y][p.x] = 0;
			
			Queue<Point>	q = new LinkedList<Point>();
			q.add(new Point(1,1));
			res[1][1] = 1;
			while(q.size() != 0 ){
				p = q.remove();
				for(int l = 0 ; l < 4 ; l++){
					int nx = p.x + dx[l];
					int ny = p.y + dy[l];
					if(nx > 0 && nx <= m && ny > 0 && ny <= n ){
						if( modified[ny][nx] == 0 && res[ny][nx] == 0){
							res[ny][nx] = res[p.y][p.x] + 1;
							q.add(new Point(nx,ny));
						}
					}
				}
			}
			
			if(res[n][m] < min && res[n][m] != 0 )
				min = res[n][m];
			
			
			for(int i =1; i <= n ; i++ ){
				for(int j = 1; j <= m; j++){
					res[i][j] = 0;
				}
			}
			
		}
		
		System.out.println(min);
				
	}
}
