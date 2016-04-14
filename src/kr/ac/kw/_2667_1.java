package kr.ac.kw;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class _2667_1 {
	
	static int n ;
	static int in[][];
	static int d[][];
	static int count = 0 ;
	static int dangi = 1;
	static int[] dx = {0,0,-1,1};
	static int[] dy = {-1,1,0,0};
	static List<Integer> lists;
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		lists = new ArrayList<Integer>();
		n = sc.nextInt();
		in = new int[n+1][n+1];
		d = new int [n+1][n+1];
		for(int i = 1; i <= n ; i++){
			String temp =  sc.next();
			for(int j = 1; j <= n ; j ++){
				in[i][j] = temp.charAt(j-1) - '0';
			}
		}
		
		for(int i = 1 ; i<= n ; i++){
			for(int j = 1; j <=n ;j++){
				d[i][j] = -1;
			}
		}
		
		for(int i = 1; i <=n; i++){
			for(int j = 1 ; j <= n ; j++){
				if(in[i][j] == 1 && d[i][j] == -1 ){
					count = 0;
					bfs(i,j);
					dangi++;
				}
			}
		}
		
		
		Collections.sort(lists, new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				if(o1 >= o2){
					return 1;
				} else {
					return -1;
				}
			}
		});
		System.out.println(dangi - 1);
		for(int i = 0 ; i < lists.size(); i++){
			System.out.println(lists.get(i));
		}
		
	}
	
	public static void bfs(int y, int x ){
		Queue<Point> q = new LinkedList<Point>();
		q.add(new Point(x,y));
		d[y][x] = dangi;
		count ++;
		while(q.size() != 0 ){
			Point p = q.remove();
			for(int k = 0 ; k < 4 ; k++){
				int nx = p.x + dx[k];
				int ny = p.y + dy[k] ;
				if(nx > 0 && nx <= n && ny > 0 && ny <= n ){
					if(in[ny][nx] == 1 && d[ny][nx] == -1 ){
						q.add(new Point(nx,ny));
						d[ny][nx] = dangi;
						count ++;
					}
				}
			}
		}
		
		lists.add(count);
	}
}
