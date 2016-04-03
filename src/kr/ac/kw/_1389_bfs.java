package kr.ac.kw;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class _1389_bfs {
	

	
	public static void main(String[] args){
		int [][] in ;
		int [][] res;
		int n ;
		int m ;
		
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		m = sc.nextInt();
		
		in = new int[n+1][n+1];
		res = new int[n+1][n+1];
		for(int i = 1 ; i <= m ; i++){
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			in[a][b] = in[b][a] = 1;
		}
		///입럭 받는거 끝;
		for(int i = 1 ; i <= n ; i++){
			Queue<Pack> q  = new LinkedList<Pack>();
			q.add(new Pack(i,0));
			
			bfs(in,res,n,m, i, q);
		}
		int min = 9999999;
		int minPeople = 0;
		for(int i = 1 ; i <= n; i++){
			int sum= 0 ;
			for(int j = 1 ; j <= n ; j++){
				sum += res[i][j];
			}
			if(sum < min){
				min = sum;
				minPeople = i;
			}
			
		}
		
		System.out.println(minPeople);
	}
	
	public static void bfs(int [][] in, int[][] res, int n, int m, int start , Queue<Pack> q){
		while( q.size()!= 0 ){
			Pack p = q.remove();
			int depth = p.depth;
			int elem = p.num;
			for(int i = 1; i <= n ; i++){
				if(in[elem][i] == 1 && res[start][i] == 0 && start != i ){
					q.add(new Pack(i , depth+1));
					//여기에 값을 어떻게 주지?
					res[start][i] =  depth+1;
				}
			}
		}
	}
}

class Pack{
	
	public Pack(int n , int depth){
		num = n;
		this.depth = depth;
	}
	public int depth;
	public int num;
}
