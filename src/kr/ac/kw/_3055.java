package kr.ac.kw;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class _3055 {
	
	static int r; 
	static int c;
	static char in[][];
	static int [][] water;
	static int [][]d ;
	static int [] dx = {0,0,-1,1};
	static int [] dy = {-1,1,0,0};
	
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		r = sc.nextInt();
		c  = sc.nextInt();
		in= new char[r+1] [c+1];
		water = new int[r+1] [c+1];
		d = new int[r+1][c+1];
		Point s = null;
		Point bever = null;
		
		for(int i = 1; i <=r ; i++){
			String temp = sc.next();
			for(int j = 1;  j <= c ; j ++){
				in[i][j] = temp.charAt(j-1);
				if(in[i][j] == 'S'){
					s = new Point(j,i);
				}
				if(in[i][j] == 'D')
					bever = new Point(j,i);
			}
		}
		
		Queue<Point> q = new LinkedList<Point>();
		for(int i = 1; i <= r ; i ++){
			for(int j = 1; j <= c ; j++	){
				if(in[i][j] == '*'){
					q.add(new Point(j ,i));
					water[i][j] = 1;
				}
			}
		}
		
		while(q.size() != 0 ){
			Point p = q.remove();
			for(int k = 0 ; k < 4; k++){
				int nx = p.x + dx[k];
				int ny = p.y + dy[k];
				
				if(nx > 0 && nx <= c && ny > 0 && ny <= r){
					if(water[ny][nx] == 0 && in[ny][nx] == '.' ){
						water[ny][nx] = water[p.y][p.x] + 1;
						q.add(new Point(nx, ny));
					}
				}
			}
		}
		
		q.add(s);
		d[s.y][s.x]= 0; 
		while(q.size() != 0 ){
			Point p = q.remove();
			for(int k = 0 ; k < 4; k++){
				int nx = p.x + dx[k];
				int ny = p.y + dy[k];
				
				if(nx > 0 && nx <= c && ny > 0 && ny <= r){
					if(in[ny][nx] == '.' || in[ny][nx] == 'D'){
						if(d[ny][nx] == 0 && (water[ny][nx] - (d[p.y][p.x] + 1) >= 2  || water[ny][nx] == 0)){
							d[ny][nx] = d[p.y][p.x] + 1;
							q.add(new Point(nx,ny));
						}
					}
				}
			}
		}
		
		System.out.println("water");
		for(int i = 1; i <= r ; i ++){
			for(int j = 1; j <= c ; j++	){
				System.out.print(water[i][j]+ "\t");
			}
			System.out.println();
		}
		
		System.out.println("d");
		for(int i = 1; i <= r ; i ++){
			for(int j = 1; j <= c ; j++	){
				System.out.print(d[i][j] + "\t");
			}
			System.out.println();
		}
		
		int res = d[bever.y][bever.x];
		
		if(res == 0 )
			System.out.println("KAKTUS");
		else
			System.out.println(res);
			
		
				
		
	}
}
