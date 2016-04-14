package kr.ac.kw;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class _2660 {
	static int n ;
	static int[][] in;
	static int[][] d;
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		n = sc.nextInt();
		in = new int[n+1][n+1];
		d = new int[n+1][n+1];
		
		
		int a =0,b=0;
		while(true){
			a = sc.nextInt();
			b = sc.nextInt();
			if(a == -1 && b == -1){
				break;
			}
			in[a][b] = in[b][a] = 1;
		}
		
		for(int i = 1; i <= n ;i++){
			//bfs(i);
			for(int j = 1; j <= n ; j++){
				Set<Integer> list = new HashSet<Integer>();
				list.add(i);
				dfs(i, i , j , 1 , list );
			}
		}
		
		
		for(int i = 1; i <= n ; i++){
			for(int j = 1; j <= n ; j++){
				System.out.print(d[i][j]+"\t");
			}
			System.out.println();
		}
	}
	
//	public static void bfs(int base){
//		Queue<AAA> q = new LinkedList<AAA>();
//		q.add(new AAA(base,0));
//		while(q.size() != 0 ){
//			AAA aaa = q.remove();
//			int item = aaa.from;
//			for(int i = 1 ; i <= n ; i++){
//				if(d[item][base] == 1){
//					
//				}
//			}
//		}
//		
//	}
	
	
	public static void dfs(int base , int from , int to , int depth , Set<Integer> path){
		if(in[from][to] == 1){
			d[base][to] = depth;
		} else {
			for(int i = 1 ; i <= n ; i++){
				if(i != from && !path.contains(i)){
					path.add(i);
					dfs(base, i , to , depth+1 , path);
				}
			}
		}
	}
}

class AAA{
	public int from;
	public int to;
	public int depth;
	public AAA(int from , int to , int depth){
		this.from = from;
		this.to = to;
		this.depth = depth;
	}
}
