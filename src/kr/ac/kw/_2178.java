package kr.ac.kw;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class _2178 {
	
	static int [][] in;
	static int [][] d;
	static int[] dx = {0,0, -1, 1};
	static int[] dy = {-1, 1, 0, 0};
	
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int y = sc.nextInt();
		int x = sc.nextInt();
			
		in = new int[y+1][x+1];
		d = new int[y+1][x+1];
		
		for(int i = 1; i<= y ; i++){
			String temp = sc.next();
			for(int j = 1; j <= x ; j++){
				in[i][j] = temp.charAt(j-1) - '0';
			}
		}
		for(int i = 1 ; i<= y ; i++){
			for(int j = 1; j <= x ; j++){
				d[i][j] = -1;
			}
		}
		
		
		d[1][1] = 1;
		Queue<Point> q = new LinkedList<Point>();
		q.add(new Point(1,1));
		while(q.size() != 0 ){
			Point p = q.remove();
			for(int k = 0 ; k<4 ; k++){
				int nx = p.x + dx[k];
				int ny = p.y + dy[k];
				if(nx > 0 && nx <= x && ny > 0 && ny <= y){
					if(in[ny][nx] == 1 && d[ny][nx] == -1){
						d[ny][nx] = d[p.y][p.x] + 1;
						q.add(new Point(nx, ny));
					}
				}
			}
		}
		
//		for(int i = 1; i <= y ; i++){
//			for(int j = 1; j <= x  ; j++){
//				System.out.print(d[i][j] +"\t"	);
//			}
//			System.out.println();
//		}
		System.out.println(d[y][x]);
		
	}
}
