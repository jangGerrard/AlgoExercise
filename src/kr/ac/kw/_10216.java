package kr.ac.kw;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _10216 {
	static int n ;
	static int[][] in;
	static int[][] d;
	static int[][] r;
	static List<Point> ps;
	static int[] dx = {0,0,-1,1};
	static int[] dy = {-1,1,0,0};
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int test_case = sc.nextInt();
		ps = new ArrayList<Point>();
		for(int t = 1; t <= test_case ; t++){
			n = sc.nextInt();
			in = new int[5000+1][5000+1];
			d = new int[21][21];
			r = new int[5000+1][5000+1];
			for(int i = 1; i <= n ; i++){
				int x = sc.nextInt();
				int y = sc.nextInt();
				int _r = sc.nextInt();
				ps.add(new Point(x,y));
				in[y][x] = 1;
				r[y][x] = _r;
			}
			int k = 1;
			for(int i = 0 ; i < ps.size(); i++){
				Point point = ps.get(i);
					if(in[point.y][point.x] == 1 && d[point.y][point.x] == 0 ){
						dfs(point.y ,point.x, r[point.y][point.x] , k);
						k++;
					}
			}
			
			for(int i = 0 ; i <= 20 ; i++){
				for(int j = 0 ; j <= 20 ; j++){
					System.out.print(d[i][j]+"\t");
				}
				System.out.println();
			}
			System.out.println(k);
		}
		
		
	}
	
	public static void dfs(int y, int x, int range, int group ){
		d[y][x] = group;
		
		for(int k = 0 ; k < 4 ; k++){
			int nx = x + dx[k];
			int ny = y + dy[k];
			if(nx >= 0 && nx <= n && ny >= 0  && ny <= n ){
				if(in[ny][nx] == 1 && d[ny][nx] == 0 ){
					if(range == 0 ){
						
					} else if(range >= r[ny][nx] ){
						dfs(ny, nx, range -1 , group);
					} else if(range < r[ny][nx]){
						dfs(ny, nx, r[ny][nx] -1  , group);
					}
				} else if(in[ny][nx] == 0){
					if(range == 0 ){
						
					} else if(range >= r[ny][nx] ){
						dfs(ny, nx, range -1 , group);
					} else if(range < r[ny][nx]){
						dfs(ny, nx, r[ny][nx] , group);
					}
				}
			}
		}
	}
}
