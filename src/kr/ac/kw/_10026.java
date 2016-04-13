package kr.ac.kw;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class _10026 {
	
	static char[][] in;
	static int[][] color;
	static int n ;
	static int[] dx = {0, 0, -1, 1};
	static int[] dy = {-1, 1, 0, 0};
	
	public static void main(String[] args){
		Scanner sc =new Scanner(System.in);
		
		n = sc.nextInt();
		in = new char[n+1][n+1];
		color = new int[n+1][n+1];
		for(int i = 1; i <= n ; i++){
			String temp = sc.next();
			for(int j = 1;  j <= n ; j++){
				in[i][j] = temp.charAt(j-1);
			}
		}
		int k = 1; 
		for(int i = 1; i <= n ; i++){
			for(int j = 1; j <= n ; j++){
				if(color[i][j] == 0){
					normalBfs(i , j , k);
					k++;
				}
			}
		}
//		for(int i = 1; i <= n ; i++){
//			for(int j = 1; j <= n ; j++){
//				System.out.print(color[i][j]+"\t");
//			}
//			System.out.println();
//		}
		
		int k2 = 1;
		color = new int[n+1][n+1];
		for(int i = 1; i <= n ; i++){
			for(int j = 1; j <= n ; j++){
				if(color[i][j] == 0){
					colorBlindBfs(i , j , k2);
					k2++;
				}
			}
		}
		
		
		
//		for(int i = 1; i <= n ; i++){
//			for(int j = 1; j <= n ; j++){
//				System.out.print(color[i][j]+"\t");
//			}
//			System.out.println();
//		}
		
		System.out.printf("%d %d",k-1,k2-1);
	}
	
	
	public static void normalBfs(int y , int x , int c){
		Queue<Point> q = new LinkedList<Point>();
		q.add(new Point(x,y));
		color[y][x] = c;
		while(q.size() != 0){
			Point p = q.remove();
			
			for(int k = 0 ; k < 4 ; k++){
				int nx = p.x + dx[k];
				int ny = p.y + dy[k];
				if(nx > 0 && nx <= n && ny > 0 && ny <= n){
					if(color[ny][nx] == 0 ){
						if(in[ny][nx] == in[p.y][p.x]){
							color[ny][nx] = color[p.y][p.x];
							q.add(new Point(nx,ny));
						}
					}
				}
			}
		}
		
	}
	
	public static void colorBlindBfs(int y , int x , int c){
		Queue<Point> q = new LinkedList<Point>();
		q.add(new Point(x,y));
		color[y][x] = c;
		while(q.size() != 0){
			Point p = q.remove();
			
			for(int k = 0 ; k < 4 ; k++){
				int nx = p.x + dx[k];
				int ny = p.y + dy[k];
				if(nx > 0 && nx <= n && ny > 0 && ny <= n){
					if(color[ny][nx] == 0 ){
						if(in[ny][nx] == in[p.y][p.x]){
							color[ny][nx] = color[p.y][p.x];
							q.add(new Point(nx,ny));
						} else if( (in[ny][nx] == 'R' && in[p.y][p.x] == 'G') ||
								(in[ny][nx] == 'G' && in[p.y][p.x] == 'R') ){
							color[ny][nx] = color[p.y][p.x];
							q.add(new Point(nx,ny));
						}
					}
				}
			}
		}
		
	}
}
