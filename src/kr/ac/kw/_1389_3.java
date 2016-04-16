package kr.ac.kw;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class _1389_3 {

	static int n  ;
	static int  m;
	static int [][] in;
	static int [][] d;
	static boolean [] visited;
	
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		
		in = new int [n+1][n+1];
		visited = new boolean[n+1];
		d = new int [n+1][n+1];
		
		for(int i = 1;  i<=m ; i++){
			int a = sc.nextInt();
			int b = sc.nextInt();
			in[a][b] = in[b][a] = 1;
		}
		
		for(int i = 1; i <= n; i ++){
			bfs(i);
		}
		
		
		for(int i = 1; i <= n ; i++){
			for(int j = 1; j <= n ; j++){
				System.out.print(d[i][j] + "\t");
			}
			System.out.println();
		}
	}
	
	public static void bfs(int start ){
		checkedInit();
		
		
		Queue <_T> q = new LinkedList<_T>();
		for(int i =1; i <= n ; i++){
			if(start != i && in[start][i] == 1 ){
				q.add(new _T(i, 1));
				d[start][i] = d[i][start] = 1;
				visited[i] = true;
			}
		}
		
		while(q.size() != 0 ){
			_T t =  q.remove();
			int elem = t.elem;
			for(int i = 1; i <= n ; i++){
				if(in[elem][i] == 1 && !visited[i] ){
					q.add(new _T(i, t.depth + 1));
					d[start][i] = t.depth + 1;
					visited[i] = true;
				}
			}
		}
		
		
		
		
	}
	
	public static void checkedInit(){
		for(int i = 1; i <= n ; i ++){
			visited[i] = false;
		}
	}
	
	
	
	
}

class _T{
	public int elem;
	public int depth;
	public _T(int elem, int depth){
		this.elem = elem; 
		this.depth = depth;
	}
}
