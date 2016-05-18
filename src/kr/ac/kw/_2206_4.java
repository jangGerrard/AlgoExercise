package kr.ac.kw;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class _2206_4 {
	
	static int in[][];
	static int res[][];
	static int w[][];
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		in = new int[m+1][n+1];
		res = new int[m+1][n+1];
		w = new int[m+1][n+1];
		
		
		for(int i = 1; i <= m ; i++){
			for(int j = 1; j <= n ; j++){
				in[i][j] = sc.nextInt();
			}
		}
		
		Queue<_2206Point> q = new LinkedList<_2206Point>();
		q.add(new _2206Point(1,1));
		
		while(q.size() != 0 ){
			
		}
		
		
	}
}
class _2206Point{
	public int x; 
	public int y ;
	public _2206Point(int x , int y ){
		this.x = x ; 
		this.y = y;
	}
}
