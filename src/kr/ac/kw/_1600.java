package kr.ac.kw;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class _1600 {
	static int k;
	static int w ;
	static int h ;
	static int[][] in ; 
	static int [][] d ;
	
//	static int[] horsedx;
//	static int[] horsedy;
	
	static int[] dx = {0,0,-1,1, }; 
	static int[] dy = {-1,1,0,0, };
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		k = sc.nextInt();
		w = sc.nextInt();
		h = sc.nextInt();
		in = new int[h+1][w+1];
		d = new int[h+1][w+1];
		for(int i = 1; i <= h ; i++){
			for(int j = 1;  j <= w ; j++){
				in[i][j] = sc.nextInt();
			}
		}
		
		Queue<Point> q = new LinkedList<Point>();
		q.add(new Point(1,1));
		d[1][1] = 0;
		while(q.size() != 0 ){
			Point p  = q.remove();
			
		}
		
	}
}
